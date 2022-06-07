import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Random rand1 = new Random();
		int rand_num1 = rand1.nextInt(10);
		System.out.println(rand_num1);
		
		Random rand2 = new Random();
		int rand_num2 = rand2.nextInt(100)+1;
		System.out.println(rand_num2);
		
		Random rand3 = new Random();
		double rand_num3 = rand3.nextDouble()+2.5;
		System.out.println(rand_num3);
		
		Random rand4 = new Random();
		Random rand5 = new Random();
		int rand_num5 = rand5.nextInt(576);
		double rand_num4 = rand4.nextDouble();
		double num6 = 14;
		double total = rand_num5+num6+rand_num4; 
		
		System.out.println(total);
		
		// Random rand1 = new Random();
		// Random rand2 = new Random();
		// Double a = rand1.nextDouble();
		// int b = rand2.nextInt(43);
		// Double c = 12.5;
		// Double result = a+b+c;
		// System.out.println(result);
		// System.out.println(a);
		// System.out.println(b);

	}
}
