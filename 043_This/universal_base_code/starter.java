import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
			
		Random rand = new Random();
		dwarf[] x = new dwarf[100];
		String[] ab;
		ab = new String[100];
		int[] cd;
		cd = new int[100];
		int c = 0;
		int d;
		
		while(c<100) {
			x[c] = new dwarf();
			d=rand.nextInt(7);
			int age = rand.nextInt(100)+1;
			
			if(d==0) {
				x[c].setName("Grumpy");
				x[c].setAge(age);
			}
			else if(d==1) {
				x[c].setName("Dopey");
				x[c].setAge(age);
			}
			else if(d==2) {
				x[c].setName("Doc");
				x[c].setAge(age);
			}
			else if(d==3) {
				x[c].setName("Happy");
				x[c].setAge(age);
			}
			else if(d==4) {
				x[c].setName("Bashful");
				x[c].setAge(age);
			}
			else if(d==5) {
				x[c].setName("Sneezy");
				x[c].setAge(age);
			}
			else if(d==6) {
				x[c].setName("Sleepy");
				x[c].setAge(age);
			}
			c=c+1;
		}
		
		c=0;
		
		while(c<100) {
			
			ab[c]=(x[c].getName());
			cd[c] = (x[c].getAge());
			System.out.println("Dwarf " + c + "'s name is " + ab[c] + " and their age is " + cd[c]);
			c=c+1;
			
		}
		
		d = 0;
		c=1;
		while(c<100) {
		String names;
		names = (x[c].getName());
		// System.out.print(" " + names);
		if(x[0].isSameName(names)) {
			d=d+1;
		}
		c=c+1;
		}
		
		System.out.println("There are " + d + " other dwarfs named " + x[0].getName());
		
		
	}
}
