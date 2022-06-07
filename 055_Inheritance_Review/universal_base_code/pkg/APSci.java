package pkg;
import java.util.Scanner;
import java.util.Random;


public class APSci extends Science{

public void calcCred() {
		
		if(grade >= 90) {
			cred = 5;
		}
		else if(grade >= 80) {
			cred = 4;
		}
		else if(grade >= 70) {
			cred = 3;
		}
		else if (grade >= 60) {
			cred = 2;
		}
		else if(grade < 60) {
			cred = 1;
		}
	}
}

