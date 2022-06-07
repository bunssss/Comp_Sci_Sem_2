import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Apprentice a = new Apprentice();
		Apprentice b = new Apprentice("USC", 3);
		Apprentice c = new Apprentice("piano", "UCLA", 2);
		Apprentice d = new Apprentice("Ram", 20, "guitar", "USC", 1);
		
		a.playInstrument();
		b.practice();
		c.perform();
		d.practiceAtUniversity();


		
	}
}
