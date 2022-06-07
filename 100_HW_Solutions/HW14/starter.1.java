import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		//My Work
		
		Pet[] x = new Pet[10];
		
		for(int c = 0; c<x.length; c++) {
			if(c<5) {
			x[c] = new Fish();
			x[c].trick();
			}
			else if(c>=5 && c<10) {
			x[c] = new Bear();
			x[c].trick();
				
			}
		}
		
		/////////////////
		
		Dog Snoopy = new Dog();						// Default Constructor
		Dog Snoopy2 = new Dog(36);					// Age Constructor
		Dog Snoop3 = new Dog(true);					// Trained Constructor
		Dog Toto = new Dog("Toto");					// Name Constructor
		Dog Clifford = new Dog("Clifford", true);	// Name, Trained Constructor
		Dog Scooby = new Dog("Scooby", 50, false);	// Name, Age, Trained Constructor

		Cat Felix = new Cat("Felix", 100, true);	// Name, Age, Trained Constructor

		System.out.println();
		Clifford.trick();							// Trained trick
		Scooby.trick();								// Untrained trick
		Felix.trick();
	}
}
