package pkg;
import java.util.ArrayList;


public class OnlinePurchaseManager
{
   
   private ArrayList<Gizmo> purchases;
      
   public OnlinePurchaseManager() {
      purchases = new ArrayList<Gizmo>();
   }
   
   public void add(String mkr, boolean isE, double cost) {
      Gizmo a = new Gizmo(mkr, isE, cost);
      purchases.add(a);
   }

   
   public Gizmo getCheapestGizmoByMaker( String mkr )
   {
    String maker;
   ArrayList<Gizmo> a = new ArrayList<Gizmo>();
      
      for(int c = 0; c < purchases.size(); c++){
            maker = purchases.get(c).getMaker();
            if(maker.equals(mkr)){
               a.add(purchases.get(c));
            }
            
         }
         
         double cost1; double cost2;
         
         for(int c = 0; c < a.size()-1; c++){
            cost1 = a.get(c).getCost();
            cost2 = a.get(c+1).getCost();
            
            if(cost2 < cost1){
               a.get(c).setCost(cost2);
               a.remove(c+1);
            }
            
         }
         
         return(a.get(0));
   }
   
   public int countElectronicsByMaker(String mkr) {
      int n = purchases.size();
      int a = 0;
      String maker;
      boolean elec;
      
      
      for(int c = 0; c<n; c++){
         maker = purchases.get(c).getMaker();
         elec = purchases.get(c).isElectronic();
         
         if(maker.equals(mkr) && elec==true) {
            a++;
         }
         
      }
      
      return a;
   }
   
   public boolean hasAdjacentEqualPair(){
      for(int c = 0; c<purchases.size()-1; c++){
         if(purchases.get(c).equals(purchases.get(c+1))){
            return true;
         }
      }
      
      return false;
   }
   
   
   
   public String toString()
   {
   	return "" + purchases;
   }
}
