import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		
		Random rand = new Random();
		
		int[] jerry;
		int c;
		int r;
		
		
		jerry = new int[999];
		c = 0;
		
		while(c < jerry.length) {
			r = rand.nextInt();
			jerry[c] = r;
			System.out.println(jerry[c]);
			c=c+1;
		}


		
	}
}
