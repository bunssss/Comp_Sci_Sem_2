package pkg;

public class Gizmo
{ 
   boolean isE;
   String maker;
   double cost;
   
   public Gizmo() {
      
   }
   
   public Gizmo(String maker, boolean isE, double cost){
      this.maker = maker;
      this.isE = isE;
      this.cost = cost;
   }
   
   public Gizmo(String maker, boolean isE){
      this.maker = maker;
      this.isE = isE;
   }
   
   public String toString()
   {
   	return "" + maker + " " + isE + " " + cost;
   }
   
   public boolean isElectronic(){
      return isE;
   }
   
   public String getMaker(){
      return maker;
   }
   public double getCost(){
      return cost;
   }
   public void setCost(double cost){
      this.cost = cost;
   }
   
   public boolean equals(Gizmo other){
      boolean a = this.maker == other.getMaker();
      boolean b = this.isE == other.isElectronic();
      boolean c = this.cost == other.getCost();
      
      if(a && b && c){
         return true;
      }
      else{
         return false;
      }
      
      
   
   }
}
