import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Random rand1 = new Random();
		int rand_num1 = rand1.nextInt(1001);
		
		System.out.print("Guess a number between 1-1000: ");
		Scanner number = new Scanner(System.in);
		int guess = number.nextInt();
		
		if(guess==rand_num1)
		{
			System.out.println("You are correct!");
		}
		else
		{
			System.out.println("Sorry, you are incorrect. The number was " + rand_num1);
		}

	}
}
