import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Hangman FRQ
		
		//Empty Constructor
		public Hangman() {
			guessingWord = "potato"
			numTries = 5;
			
		}
		public Hangman(int a) {
			numTries = a;
		}
		
		//guessCheck method
		public int guessCheck(String letter, int start) {
			while(start < guessingWord.length());
			if(letter.equals(guessingWord.substring(start, start+1)) {
				return start;
			}
			else {
				start++;
			}
			if(start >= guessingWord.length()) {
				break;
				return -1;
			}
		}
		
		//checkWin method
		public boolean checkWin(boolean [] arr) {
				int c = 0;
				int count = 0;
				while(c<arr.length) {
					if(arr[c] == true) {
						count++;
						c++;
					}
					else {
						c++;
					}
				}
				if(count<arr.length) {
					return false;
				}
				else
				{
					return true;
				}
			}
		}
		


		
	}
}
