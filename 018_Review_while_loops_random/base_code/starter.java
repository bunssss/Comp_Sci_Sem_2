import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		
		Random rand1 = new Random();
		int rand_num1 = rand1.nextInt(1001);
		
		System.out.print("Guess a number between 1-1000: ");
		Scanner number = new Scanner(System.in);
		int guess = number.nextInt();
		
		while(guess!=rand_num1)
		{
			if(guess<rand_num1)
			{
				System.out.print("Your guess is too low! Try again! ");
				guess = number.nextInt();
			}
			if(guess>rand_num1)
			{
				System.out.print("Your guess is too high! Try again! ");
				guess = number.nextInt();
			}
			if(guess==rand_num1)
			{
				System.out.println();
				System.out.print("Congrats! You guessed correctly!");
				break;
			}
			
		}

		
	}
}
