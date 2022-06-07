package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	
	
	public String Role;
	public int str;
	public int cons;
	public int intel;
	public int dex;
	public int charis;
	
	public myCharacter() {
		Role = "Nothing";
		str = 0;
		cons = 0;
		intel = 0;
		dex = 0;
		charis = 0;
		
	}
	
	// public void myToString() {
	// 	System.out.println("Your role is " + Role);
	// 	System.out.println("Your strength trait is: " + str);
	// 	System.out.println("Your dexterity trait is: " + dex);
	// 	System.out.println("Your intelligence trait is: " + intel);
	// 	System.out.println("Your constitution trait is: " + cons);
	// 	System.out.println("Your charisma trait is: " + charis);
	// }
	
	public void myToString() {
		if(Role.equals("Wizard")||Role.equals("wizard"))
		{
			System.out.println("You chose Wizard! Excelsior!");
			System.out.println("Stats: Str - " + str + " Intel - " + intel + " Const - " + cons + " Dex - " + dex + " Char - " + charis);
		}
		else if(Role.equals("Warrior")||Role.equals("warrior"))
		{
			System.out.println("You chose Warrior! For Honor!");
			System.out.println("Stats: Str - " + str + " Intel - " + intel + " Const - " + cons + " Dex - " + dex + " Char - " + charis);
		}
		else if(Role.equals("Rogue")||Role.equals("rogue"))
		{
			System.out.println("You chose Rogue! How cunning!");
			System.out.println("Stats: Str - " + str + " Intel - " + intel + " Const - " + cons + " Dex - " + dex + " Char - " + charis);
		}
		else
		{
			Role = "Nothing";
			System.out.println("You did not choose a class");
			System.out.println("Stats: Str - " + str + " Intel - " + intel + " Const - " + cons + " Dex - " + dex + " Char - " + charis);
		}
	}
	
	public myCharacter(String a){
		Role = a;
		
	}

}
	
	

