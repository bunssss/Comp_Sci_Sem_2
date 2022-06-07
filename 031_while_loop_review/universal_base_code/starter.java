import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Random rand = new Random();
		int a = rand.nextInt(101);
		int c = 0;
		
		while(c<100) {
			System.out.println(a);
			a = rand.nextInt(101);
			c=c+1;
		}


		
	}
}
