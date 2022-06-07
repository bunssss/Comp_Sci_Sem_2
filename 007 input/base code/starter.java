import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.print("First Name: ");
		Scanner fname = new Scanner(System.in);
		String first = fname.nextLine();
		
		System.out.print("Age: ");
		Scanner old = new Scanner(System.in);
		String age = old.nextLine();
		
		System.out.print("Birthday Month: ");
		Scanner bdaymonth = new Scanner(System.in);
		String month = bdaymonth.nextLine();
		
		System.out.print("Birthday Day: ");
		Scanner bday = new Scanner(System.in);
		String day = bday.nextLine();
		
		System.out.print("Birthday Year: ");
		Scanner bdayyear = new Scanner(System.in);
		String year = bdayyear.nextLine();
		
		System.out.print("How much is a buck fifty? Answer: ");
		Scanner fifty = new Scanner(System.in);
		String answer = bday.nextLine();
		
		System.out.println();
		System.out.println("Your name is " + first + " and you were born on " + month + " " + day + ", " + year);
		System.out.println("You are " + age + " years old!!!");
		System.out.println("You have " + answer + " dollars in your wallet!");
	
	}
}
