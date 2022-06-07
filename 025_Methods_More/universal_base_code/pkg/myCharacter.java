package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	
		public String Role = "Nothing";
		public int str = 0;
		public int cons = 0;
		public int intel = 0;
		public int dex = 0;
		public int charis = 0;

public myCharacter() {

}

public myCharacter(String m) {
	Role = m;
}

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

public String setRole(String r) {
		if(r.equals("Wizard")||r.equals("wizard"))
		{
			Role = r;
		}
		else if(r.equals("Warrior")||r.equals("warrior"))
		{
			Role = r;
		}
		else if(r.equals("Rogue")||r.equals("rogue"))
		{
			Role = r;
		}
		else
		{
			Role = "Nothing";
			System.out.println("You did not choose a class");
			System.out.println("Stats: Str - " + str + " Intel - " + intel + " Const - " + cons + " Dex - " + dex + " Char - " + charis);
		}
	return Role;
}

public int setStrength(int a) {
	str = a;
	return str;
}

public int setIntelligence(int b) {
	intel = b;
	return intel;
}

public int setConstitution(int c) {
	cons = c;
	return cons;
}

public int setCharisma(int d) {
	charis = d;
	return charis;
}

public int setDexterity(int e) {
	dex = e;
	return dex;
}

public boolean setAll(String rl, int st, int in, int con, int cha, int dx) {
	Role = rl;
	str = st;
	intel = in;
	cons = con;
	dex = dx;
	charis = cha;
	
	return true;
	
}

}
	

	
	

