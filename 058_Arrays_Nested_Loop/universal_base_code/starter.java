import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a symbol: ");
		String symbol = sc.nextLine();
		System.out.print("Enter a width: ");
		int w = sc.nextInt();
		System.out.println("Enter a height: ");
		int h = sc.nextInt();
		
		for(int d = 0; d < h; d++) {
			for(int c = 0; c < w; c++) {
				System.out.print(symbol);
		}
			System.out.println();		
		}

		
	}
}
