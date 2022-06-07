import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		
	Scanner sc = new Scanner(System.in);
	String name = sc.nextLine();
	int index = 0;
    
	String midReply;
    if(name.length() < 3){
        midReply = "Mid";
    } else {
        midReply = "Mid" + name.substring(3);
    }
    
 
	

	
	System.out.print(midReply);

		
	}
}
