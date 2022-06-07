import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		
		Random rand = new Random();
		
		int[] a;
		int b = rand.nextInt(150) + 51;
		int c = 0;
		int d;
		int e = 100;
		
		a = new int[b];
		
		while(c < a.length) {
			d = rand.nextInt(100)+1;
			a[c] = d;
			System.out.print(a[c] + " ");
			c = c+1;
		}
		
	

		System.out.println();
		System.out.println();
		System.out.println("There are " + c + " elements." + " " + a.length);
		
		c=0;
		while(c<a.length) {
			
			if(a[c]<e) {
				
				e = a[c];
				
			}
			c=c+1;
		}
		
		c=0;
		d=0;
		while(c<a.length) {
	
			d = d+a[c];
			c=c+1;
		
		if(c==a.length) {
			d=d/c;
			System.out.println("Average: " + d);
			break;
			}	
		}
		
		c=0;
		d=0;
		int z = a[0];
		int y = a[1];
		while(c<a.length) {
			
			d=d+1;
			if(d == a.length) {
			System.out.println("Maximum: " + z);
			break;
		}
			// System.out.println(d);
			// System.out.println(c);
			// System.out.println(z + " " + y);
			
			if(z>y) {
				z=z;
			}
			else {
				z=y;
			}
			c=c+1;
			y=a[c];
		
		}
	
		System.out.println("Minimum: " + e);
		
		

		
		
		


		
	}
}
