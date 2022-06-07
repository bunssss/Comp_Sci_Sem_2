import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a word: ");
	String ans = sc.nextLine();
	int a = ans.length();
	
	for(int c = 0; c<a; c++) {
		System.out.println(c + "\t" + ans.substring(c,c+1));
	}


		
	}
}
