package pkg;
import java.util.Scanner;
import java.util.Random;


public class HorseBarn {
	private Horse[] spaces;
	
	public int findHorseSpace(String name) {
		int i = 0;
		String HName;
		while(i < spaces.length) {
		HName = spaces[i].getName();
		if(HName.equals(name)) {
			return i;
		}
		else {
			i++;
		}
		
		if(i == spaces.length) {
			return -1;
		}
		
		}
	}
	
	public void consolidate() {
		
		int i = 0;
		Horse[] space2 = new Horse[spaces.length];
		for(int c = 0; c < spaces.length; c++) {
			if(spaces[c] != null) {
				space2[i] = spaces[c];
				i++;
			}
		}
	}
		
}
