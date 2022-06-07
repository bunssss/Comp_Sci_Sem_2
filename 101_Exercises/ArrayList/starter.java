import java.util.*;

class starter {
	//Methods go here
	
	//Method 1
	public static void printArrayList(ArrayList <Integer> a) {
		int x = a.size();
		int c = 0;
		
		
		while(c < x) {
			System.out.print(a.get(c) + " ");
			c++;
		}
	}
	
	//Method 2
	public static void addValuesArrayList(ArrayList <Integer> a, int n) {
		Random rand = new Random();
		int c = 0;
		int x;
		
		while(c < n) {
			x = rand.nextInt(101);
			a.add(x);
			c++;
		}
	}

	public static void main(String args[]) {
		// Your code goes below here
		
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int a = sc.nextInt();
	
	ArrayList <Integer> arr = new ArrayList<Integer>();
	addValuesArrayList(arr, a);
	printArrayList(arr);


	}
}
