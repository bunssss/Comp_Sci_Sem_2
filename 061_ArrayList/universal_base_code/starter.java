import java.util.*;
import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.print("How many cookie: ");
		int n = sc.nextInt();
		
ArrayList <String> cookies = new ArrayList<String>();
	
	for(int c = 0; c < n; c++){
		cookies.add(c, "cookie");
		System.out.print(cookies.get(c) + " ");
	}	


		
	}
}
