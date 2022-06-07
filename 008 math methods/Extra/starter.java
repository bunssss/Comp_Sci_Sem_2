import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		
		System.out.print("Enter your first number: ");
		Scanner first = new Scanner(System.in);
		double one = first.nextDouble();
		System.out.print("Enter your second number: ");
		Scanner second = new Scanner(System.in);
		double two = second.nextDouble();
		
		double squarert = Math.sqrt(two);
		double power = Math.pow(one,two);
		
		System.out.println();
		System.out.println("Square root of your second number =  " + squarert);
		System.out.println("Your first number to the power of your second number = " + power);
	
	}
}
