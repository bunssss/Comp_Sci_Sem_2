import java.util.*;
import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		ArrayList <Integer> amog = new ArrayList<Integer>();
		int a = 0;
		
		System.out.print("How many numba: ");
		int n = sc.nextInt();
		
		for(int c = 0; c < n; c++){
			a = rand.nextInt(100)+1;
			amog.add(c, a);
		}
		
		ArrList.toStringArrayList(amog);
		System.out.println();
		System.out.println(ArrList.getArrayListAverage(amog));
		
		
		

		
	}
}
