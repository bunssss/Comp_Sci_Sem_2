import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Creature x = new Spider();
		Creature y = new Zombie();
		Role a = new Sorcerer();

		while(x.getHealth() > 0) {
			a.attack(x);
			if(x.getHealth() <= 0) {
				break;
			}

		}
		while(y.getHealth() > 0) {
			a.attack(y);
			if(y.getHealth() <= 0) {
				break;
			}
		}
		
	}
}
