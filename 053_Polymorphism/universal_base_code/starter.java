import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Performer a = new Performer();
		Musician b = new Musician();
		Apprentice c = new Apprentice();
		Actor d = new Actor();
		
		a.perform();
		a.practice();
		
		b.perform();
		((Performer)b).practice();

		c.practiceAtUniversity();
		((Musician)c).playInstrument();
		
		d.monologue();
		((Performer)d).perform();
		
		
	}
}
