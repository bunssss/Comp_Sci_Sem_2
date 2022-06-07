import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("What is your name?");
		Scanner user = new Scanner(System.in);
		String name = user.nextLine();
		
		System.out.println("What is your title?");
		String title = user.nextLine();
		
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
		String clas = user.nextLine();
		
		
		if(clas.equals("Wizard")||clas.equals("wizard"))
		{
			System.out.println();
			System.out.println("You have chosen to be a Wizard!");
		}
		else if(clas.equals("Warrior")||clas.equals("warrior"))
		{
			System.out.println();
			System.out.println("You have chosen to be a Warrior!");
		}
		else if(clas.equals("Rogue")||clas.equals("rogue"))
		{
			System.out.println();
			System.out.println("You have chosen to be a Rogue!");
		}
		else
		{
			System.out.println("That's not one of the options...You are nothing then.");
		}
		
		System.out.println();
		System.out.println("You have 25 skill points to spend on Strength, Dexterity, Intelligence, Constitution and Charisma. Make sure to spend then wisely.");
		
		int total = 25;
		
		while(total <= 25)
		{
				System.out.print("Strength (1-10): ");
		Scanner points = new Scanner(System.in);
		int a = points.nextInt();
		
		while(a>10)
		{
			System.out.print("You can't go over 10! Try Again: ");
			a = points.nextInt();
		
		if(a <= 10)
		{
			total = total - a;
			System.out.println("You have " + total + " left to spend.");
		}
		}
		
		System.out.print("Dexterity (1-10): ");
		int b = points.nextInt();
		
		while(b>10)
		{
			System.out.print("You can't go over 10! Try Again: ");
			b = points.nextInt();
		
		if(b <= 10)
		{
			total = total - b;
			System.out.println("You have " + total + " left to spend.");
		}
		}
		
		
		System.out.print("Intelligence (1-10): ");
		int c = points.nextInt();
		
		while(c>10)
		{
			System.out.print("You can't go over 10! Try Again: ");
			c = points.nextInt();
		
		if(c <= 10)
		{
			total = total - c;
			System.out.println("You have " + total + " left to spend.");
		}
		}
		
		System.out.print("Constitution (1-10): ");
		int d = points.nextInt();
		
		while(d>10)
		{
			System.out.print("You can't go over 10! Try Again: ");
			c = points.nextInt();
		
		if(d <= 10)
		{
			total = total - d;
			System.out.println("You have " + total + " left to spend.");
		}
		}
		
		System.out.print("Charisma (1-10): ");
		int e = points.nextInt();
		
		while(e>10)
		{
			System.out.print("You can't go over 10! Try Again: ");
			e = points.nextInt();
		
		if(e <= 10)
		{
			total = total - e;
			System.out.println("You have " + total + " left to spend.");
		}
		if(total == 0)
		{
			break;
		}
		}
		
		
		System.out.println();
		System.out.println("------------------------------");
		System.out.println("You are " + name + " " + title);
		
		if(clas.equals("Wizard"))
		{
			System.out.println("You are a " + clas + " with the following stats!");
		}
		else if(clas.equals("Rogue"))
		{
			System.out.println("You are a " + clas + " with the following stats!");
		}
		else if(clas.equals("Warrior"))
		{
			System.out.println("You are a " + clas + " with the following stats!");
		}
		else
		{
			System.out.println("You are nothing with the following stats!");
		}
		}
		
		// System.out.println("Strength - " + a);
		// System.out.println("Dexterity - " + b);
		// System.out.println("Intelligence - " + c);
		// System.out.println("Constitution - " + d);
		// System.out.println("Charisma - " + e);
		
		// System.out.println();
		// System.out.println("Good luck on your quest " + name + "!");
	}
}
