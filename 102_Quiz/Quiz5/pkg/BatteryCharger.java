package pkg;
import java.util.Scanner;
import java.util.Random;


public class BatterCharger {
	private int[] rateTable;
	
	//Part A
	private int getChargingCost(int startHour, int chargeTime) {
		int cost = 0;
		int c = startHour;
		
		if(chargeTime == 1) {
			cost = rateTable[startHour];
			return cost;
		}
		
		if(chargeTime > 1) {
		for(int d = 0; d <= chargeTime; d++) {
			
			if(c == rateTable.length) {
				c = 0;
			}
			
			cost = (cost + rateTable[c]);
			c++;
			
			}
		}
	
		return cost;
	}
	
	//Part B
	
	public int getChargeStartTime(int chargeTime) {
		int minimumCost = 0;
		int x = 0;
		
		for(int c = 0; c < chargeTime; c++) {
			minimumCost = (rateTable[c] + rateTable[c+1]);
		}
		
		while(true) {
			int chargeCost = getChargingCost(x, chargeTime);
			
			if(chargeCost == minimumCost) {
				break;
			}
			else {
				x++;
			}
		}
		
		return x;
	}

}

