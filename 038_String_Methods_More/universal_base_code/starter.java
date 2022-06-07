import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a name: ");
		String name = sc.nextLine();
		int a = name.length();
		System.out.println(name.substring(name.indexOf(" "),a));
		


		
	}
}
