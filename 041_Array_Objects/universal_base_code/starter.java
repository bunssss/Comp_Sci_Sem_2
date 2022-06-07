import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Warrior[] x = new Warrior[100];
		Wizard[] z = new Wizard[100];
	
		int c = 0;
		
		while(c<100) {
			x[c] = new Warrior();
			z[c] = new Wizard();
			c=c+1;
		}
		
		c = 0;
		int d = 0;
		while(c<100 && d<100) {
			x[c].attack(z[d]);
			z[d].attack(x[c]);
			
			if(z[d].isDead()) {
				d=d+1;
			}
			if(x[c].isDead()) {
				c=c+1;
			}
			if(z[99].isDead()) {
				c=98-c;
				System.out.println("The war has ended! The Warriors have won! with " + c + " left in their army!");
				break;
			}
			if(x[99].isDead()) {
				d=98-d;
				System.out.println("The war has ended! The Wizards have won with " + d + " left in their army!");
				break;
			}
		}
		
	}
}
