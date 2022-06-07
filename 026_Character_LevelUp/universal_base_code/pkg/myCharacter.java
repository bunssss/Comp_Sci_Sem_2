package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	
		static String Role;
		static int str;
		static int cons;
		static int intel;
		static int dex;
		static int charis;
		
		static int level;
		static int points;

public myCharacter() {
Role = "nothing";
cons = 0;
str = 0;
intel = 0;
dex = 0;
charis = 0;
level = 0;
points = 0;
}

public myCharacter(String m) {
	Role = m;
}

public boolean checkPoints(int pts) {
	if(pts > 10 || pts < 0) {
		return false;
	}
	else if(pts > points) {
		return false;
	}
	else {
		return true;
	}
}

	public void levelUp() {
		
	Scanner sc = new Scanner(System.in);
	
	if(level == 0) {
		level = level+1;
		points = points+25;
	}
	else if(level > 0) {
		level = level+1;
		points = points+10;
	}
	System.out.println("You are now level " + level + ". You have " + points + " points to spend!");
	System.out.println("You may only spend up to 10 points per trait.");
	System.out.println();
	
	while(points > 0) {
		System.out.print("Strength: ");
		int a = sc.nextInt();
		checkPoints(a);
		if(checkPoints(a)) {
			points = points - a;
			str = a;
			System.out.println("You now have " + points + " points left to spend.");
		}
		else {
			while(checkPoints(a)==false) {
				System.out.print("Try Again: ");
				a = sc.nextInt();
				checkPoints(a);
				if(checkPoints(a)) {
				points = points - a;
				str = a;
				System.out.println("You now have " + points + " points left to spend.");
				}
			}
		}
			System.out.print("Intelligence: ");
		int b = sc.nextInt();
		checkPoints(b);
		if(checkPoints(b)) {
			points = points - b;
			intel = b;
			System.out.println("You now have " + points + " points left to spend.");
		}
		else {
			while(checkPoints(b)==false) {
				System.out.print("Try Again: ");
				b = sc.nextInt();
				checkPoints(b);
				if(checkPoints(b)) {
				points = points - b;
				intel = b;
				System.out.println("You now have " + points + " points left to spend.");
				}
			}
		}
		System.out.print("Constitution: ");
		int c = sc.nextInt();
		checkPoints(c);
		if(checkPoints(c)) {
			points = points - c;
			cons = c;
			System.out.println("You now have " + points + " points left to spend.");
		}
		else {
			while(checkPoints(c)==false) {
				System.out.print("Try Again: ");
				c = sc.nextInt();
				checkPoints(c);
				if(checkPoints(c)) {
				points = points - c;
				cons=c;
				System.out.println("You now have " + points + " points left to spend.");
				}
			}
		}
		System.out.print("Dexterity: ");
		int d = sc.nextInt();
		checkPoints(d);
		if(checkPoints(d)) {
			points = points - d;
			dex = d;
			System.out.println("You now have " + points + " points left to spend.");
		}
		else {
			while(checkPoints(d)==false) {
				System.out.print("Try Again: ");
				d = sc.nextInt();
				checkPoints(d);
				if(checkPoints(d)) {
				points = points - d;
				dex=d;
				System.out.println("You now have " + points + " points left to spend.");
				}
			}
		}
		System.out.print("Charisma: ");
		int e = sc.nextInt();
		checkPoints(e);
		if(checkPoints(e)) {
			points = points - e;
			charis = e;
			System.out.println("You now have " + points + " points left to spend.");
		}
		else {
			while(checkPoints(e)==false) {
				System.out.print("Try Again: ");
				e = sc.nextInt();
				checkPoints(e);
				if(checkPoints(e)) {
				points = points - e;
				charis=e;
				System.out.println("You now have " + points + " points left to spend.");
				}
			}
		}
		if(points==0) {
			System.out.println("You ran out of points!");
			System.out.println();
			myToString();
			break;
		}
		
		System.out.println();
		myToString();
		break;
	}
	
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

private int setStrength(int a) {
	str = a;
	return str;
}

private int setIntelligence(int b) {
	intel = b;
	return intel;
}

private int setConstitution(int c) {
	cons = c;
	return cons;
}

private int setCharisma(int d) {
	charis = d;
	return charis;
}

private int setDexterity(int e) {
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
	

	
	

