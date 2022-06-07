import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Role[] x = new Role[3];
	
	x[0] = new Wizard();
	x[1] = new Warrior();
	x[2] = new Sorcerer();
	
	System.out.println(x[0].getName());
	System.out.println(x[1].getName());
	System.out.println(x[2].getName());

		
	}
}
