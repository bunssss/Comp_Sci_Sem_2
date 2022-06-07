package pkg;

public class Robot {		
	private int[] hall;
	private int pos;
	private boolean facingRight;
	
	
	//Part A
	private boolean forwardMoveBlocked() {
		if(facingRight == true && hall[pos] == hall.length - 1) {
			facingRight = false;
			return true;
		}
		else if(facingRight == false && hall[pos] == 0) {
			facingRight = true;
			return true;
		}
		else {
			return false;
		}
		
	}
	
	//Part B
	private void move() {
		boolean block = forwardMoveBlocked();
		
		if(block == false && hall[pos] == 0) {
			pos++;
		}
		if(block == false && hall[pos] > 0) {
			hall[pos] = hall[pos] - 1;
		}
		if(block == true && hall[pos] > 0) {
			hall[pos] = hall[pos] - 1;
		if(block == true && hall[pos] == 0) {
			facingRight == false;
		}
		if(facingRight == false && block == false && hall[pos] == 0) {
			pos = pos - 1;
		}
		if(facingRight == false && block == false && hall[pos] > 0) {
			hall[pos] = hall[pos] - 1;
		}
	}
	
	//Part C 
	private int clearHall() {
		int c;
		boolean clear = hallIsClear();
		
		while(hall[pos] > 0) {
			move();
			c++;
			
		if(hall[pos] == 0) {
			move();
			c++;
		}
		
		}
		
		if(clear) {
		return c;
		}
		
	}
}
