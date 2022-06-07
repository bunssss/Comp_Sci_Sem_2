import java.util.*;

class starter {
	public static void main(String args[]) {
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		addValuesInt(arr1, 100);
		printValuesInt(arr1);
		System.out.println();
		System.out.println();
		removeDup(arr1);		//Create this method.
		printValuesInt(arr1);
		System.out.println();
	}

	public static void addValuesInt(ArrayList<Integer> arr, int num){
		for(int i = 0; i < num; i++){
			arr.add(((int)(Math.random()*100)));
		}
	}

	public static void printValuesInt(ArrayList<Integer> arr){
		for(int i = 0; i < arr.size(); i++){
			System.out.print(arr.get(i) + ", ");
		}
	}
	
	public static void removeDup(ArrayList<Integer> arr){
		int dup = 0;
		
		for(int c = 0; c < arr.size(); c++){
			dup = arr.get(c);
			for(int x = c+1; x < arr.size(); x++){
				int a = arr.get(x);

				if(dup == a){
					arr.remove(x);
					x--;
				}
			}
		}
		
		
	}
	
}
