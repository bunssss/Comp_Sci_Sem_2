import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	
	public static void toStringArray(int [] x) {
		
		int c = 0;
		int d;
		
		while(c<x.length) {
			System.out.print(x[c] + " ");
			c = c+1;
		}
		
	}
	
	public static int getArrayAverage(int [] y) {
		int c=0;
		int d=0;
		while(c<y.length) {
	
			d = d+y[c];
			c=c+1;
		
		if(c==y.length) {
			d=d/c;
			break;
			}	
		}
		System.out.println();
		System.out.println("Average: " + d);
		return d;
	}
	
	public static int getArrayMax(int [] z) {
		int c = 0;
		int d = 0;
		int x = z[0];
		int y = z[1];
		
		while(c<z.length) {
			
			d=d+1;
			if(d == z.length) {
				System.out.println("Maximum: " + x);
				break;
			}
			
		if(x>y) {
				x=x;
			}
			else {
				x=y;
			}
			c=c+1;
			y=z[c];
		}
		
		return x;
		
	}
	
	public static int getArrayMin(int [] y) {
		int c=0;
		int e =100;
		while(c<y.length) {
			
			if(y[c]<e) {
				
				e = y[c];
				
			}
			c=c+1;
		}
		
		System.out.println("Minimum " + e);
		return e;
	}
	
	public static void main(String args[]) {
		// Your code goes below here
	
	Random rand = new Random();
	
		int[] a;
		a = new int[100];
		int c = 0;
		int d;
		
		while(c < a.length) {
			d = rand.nextInt(100)+1;
			a[c] = d;
			c=c+1;
		}
		
		toStringArray(a);
		getArrayAverage(a);
		getArrayMax(a);
		getArrayMin(a);
		
	}
}
