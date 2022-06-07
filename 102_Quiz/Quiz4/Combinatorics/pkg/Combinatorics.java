package pkg;
import java.util.Scanner;
import java.util.Random;


public class Combinatorics {

public static int factorial(int n) {
	int a = n;
	
	if(n==1) {
		return 1;
	}
	
	while(a > 1) {
		a = a-1;
		n = n*a;
	}
	
	return n;
}

public static void numCombinations(int n, int r) {
	
	if(n<r) {
		System.out.println("No possible combinations");
	}
	else {
	int d = 0;
	d = factorial(n) / (factorial(r) * factorial(n-r));
	
	System.out.print("There are " + d + " possible combinations");
	}

}
	
	
	
}
