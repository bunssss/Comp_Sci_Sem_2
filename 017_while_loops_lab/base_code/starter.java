import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		
		Scanner input = new Scanner(System.in);
		System.out.print("Type in your name here: ");
		String name = input.nextLine();
		System.out.print("Type in the number of times you want it to be printed: ");
		int a = input.nextInt();
		
		int b = 0;
		
		while(b<a)
		{
			System.out.println(name);
			if(b==a)
		{
			break;
		}
		b = b + 1;
		}
	}
}
