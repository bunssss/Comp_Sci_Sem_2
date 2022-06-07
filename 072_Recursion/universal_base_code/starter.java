import pkg.*;
import java.util.*;

class starter {
	public static int recurPower(int base, int n){
		if(n == 0){
			return 1;
		}
		
		return base*recurPower(base, n-1);
	}

	public static void main(String args[]) {

	System.out.print(recurPower(2, 3));
		
	}
}
