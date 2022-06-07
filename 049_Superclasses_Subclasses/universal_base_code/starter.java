import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Performer a = new Performer();
	Performer b = new Performer("", 23);
	
	Musician ab = new Musician();
	Musician bc = new Musician("Guitar");
	
	a.getName();
	a.practice();
	
	b.getName();
	b.perform();
	
	ab.getName();
	ab.perform();
	ab.playInstrument();
	
	bc.practice();
	bc.getInstrument();


		
	}
}
