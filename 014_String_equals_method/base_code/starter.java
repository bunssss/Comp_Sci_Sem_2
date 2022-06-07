import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
		Scanner role = new Scanner(System.in);
		String clas = role.nextLine();
		
		if(clas.equals("Wizard"))
		{
			System.out.println();
			System.out.println("You have chosen to be a Wizard!");
		}
		else if(clas.equals("Warrior"))
		{
			System.out.println();
			System.out.println("You have chosen to be a Warrior!");
		}
		else if(clas.equals("Rogue"))
		{
			System.out.println();
			System.out.println("You have chosen to be a Rogue!");
		}
		else
		{
			System.out.println("That's not one of the options...Rerun the program.");
		}
	}
}
