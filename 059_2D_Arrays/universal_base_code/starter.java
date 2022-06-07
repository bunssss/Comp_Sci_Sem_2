import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Random rand = new Random();
		int avg = 0;
		int [][] h = new int[5][5];
		
		for(int x = 0; x < h.length; x++){
			for(int y = 0; y < h[0].length; y++){
				int r = rand.nextInt(10);
				h[x][y] = r;
			}
		}
		
		for(int x = 0; x < h.length; x++){
				System.out.println();
			for(int y = 0; y < h[0].length; y++){
				System.out.print(h[x][y] + " ");
			}
		}
		
		avg = h[0][0];
		for(int x = 0; x < h.length; x++){
			for(int y = 1; y < h[0].length-1; y++){
				avg = avg + h[x][y];
				System.out.println(avg);
			}
		}
			
		
		
	}
}
