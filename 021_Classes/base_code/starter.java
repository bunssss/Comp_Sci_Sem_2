import java.util.Scanner;
import java.util.Random;

class Character{
	
	String Role = new String("Wizard");
	int str = 5;
	int cons = 5;
	int intel = 5;
	int dex = 5;
	int charis = 5;
	
	
}

class starter {
	public static void main(String args[]) {
		// Your code goes below here

Character myChar = new Character();
System.out.println("Your Role is: " + myChar.Role);
System.out.println("Strength - " + myChar.str);
System.out.println("Intelligence - " + myChar.intel);
System.out.println("Constitution - " + myChar.cons);
System.out.println("Charisma - " + myChar.charis);
System.out.println("Dexterity - " + myChar.dex);

		
	}
}
