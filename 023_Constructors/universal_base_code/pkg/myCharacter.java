package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	public String Role;
	public int str = 5;
	public int cons = 5;
	public int intel = 5;
	public int dex = 5;
	public int charis = 5;
	
	
	public myCharacter() {
		Role = "Nothing";
		
	}
	
	public myCharacter(String a){
		Role = a;
		if(a.equals("Wizard")||a.equals("wizard"))
		{
			System.out.println("You chose Wizard! Excelsior!");
			System.out.println("Stats: Str - 5 Intel - 5 Const - 5 Dex - 5 Char - 5");
		}
		else if(a.equals("Warrior")||a.equals("warrior"))
		{
			System.out.println("You chose Warrior! For Honor!");
			System.out.println("Stats: Str - 5 Intel - 5 Const - 5 Dex - 5 Char - 5");
		}
		else if(a.equals("Rogue")||a.equals("rogue"))
		{
			System.out.println("You chose Rogue! How cunning!");
			System.out.println("Stats: Str - 5 Intel - 5 Const - 5 Dex - 5 Char - 5");
		}
		else
		{
			Role = "Nothing";
			System.out.println("You did not choose a class");
			System.out.println("Stats: Str - 5 Intel - 5 Const - 5 Dex - 5 Char - 5");
		}
	}

}
	
	

