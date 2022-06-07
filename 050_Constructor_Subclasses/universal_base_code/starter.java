import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Musician a = new Musician("Peak", "Piano");
	Musician b = new Musician("Mid", "Guitar");
	
	a.getName();
	a.practice();
	a.getInstrument();
	
	b.getName();
	b.perform();
	b.playInstrument();

	System.out.println(b.getAge());
		
	}
}
