import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		
		Ascii myArt1 = new Ascii ("human","冰淇淋");
		Ascii myArt2 = new Ascii ();
		Ascii myArt3 = new Ascii("cactus", 2);
		Ascii myArt4 = new Ascii("other");
		Ascii myArt5 = new Ascii("Mario", "maro", 4);
		
		myArt2.setType("dog");
		myArt2.setName("DaDog");
		myArt2.setNumber(2);
		
		myArt4.setName("amogos");
		myArt4.setNumber(3);
		myArt4.setAscii("<(''<)  <( ' ' )>  (> '')>");
		
		myArt1.printArt();
		myArt2.printArt();
		myArt3.printArt();
		myArt4.printArt();
		myArt5.printArt();
		


		
	}
}
