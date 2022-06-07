package pkg;
import java.util.Scanner;
import java.util.Random;


public class CombinedTable {
	int seats;
	double desirability;

	public CombinedTable(SingleTable a, SingleTable b) {
		int s1 = a.getNumSeats();
		int s2 = b.getNumSeats();
		double h1 = a.getHeight();
		double h2 = b.getHeight();
		
		seats = (s1+s2) - 2;
		
		if(h1 == h2) {
			desirability = 
		}
		else {
			desirability = ((h1+h2)/2) - 10;
		}
		
	}
	
	public double getDesirability() {
		return desirability;
	}
	
	public boolean canSeat(int a) {
		if(a>seats) {
			return false;
		}
		else {
			return true;
		}
	}

}

