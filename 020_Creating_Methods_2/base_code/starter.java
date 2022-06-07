import java.util.Scanner;
import java.util.Random;

class starter {
	
	public static int pow(int a, int b){
		
		int z = a;
		int c = 1;
		
		while(c < b)
		{
			a = a*z;
			c=c+1;
		}
	
		return a;
		}
	
	public static void main(String args[]) {
		// Your code goes below here

int a = pow(3,4);
System.out.println(a);
		
	}
}
