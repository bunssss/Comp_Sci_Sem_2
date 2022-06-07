import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.print("Enter your first number: ");
		Scanner num1 = new Scanner(System.in);
		int num_1 = num1.nextInt();
		
		System.out.print("Enter your second number: ");
		Scanner num2 = new Scanner(System.in);
		int num_2 = num2.nextInt();
		
		if(num_1!=num_2)
		{
			System.out.println("The two numbers are not equal");
		}
		if(num_1==num_2)
		{
			System.out.println("The two numbers are equal");
		}
	}
}
