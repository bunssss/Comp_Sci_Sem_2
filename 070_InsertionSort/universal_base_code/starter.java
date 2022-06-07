import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	
	public static void insertionSort(int[] arr){
		
	}
	
	public static void main(String args[]) {
		// Your code goes below here
			int[] arr = new int[200];
		 
		 for(int c = 0; c < arr.length; c++){
		 	arr[c] = ((int)(Math.random()*1000));
		 }
		 
		 insertionSort(arr);
		 for(int c = 0; c < arr.length; c++){
		 	System.out.print(arr[c] + " ");
		 }


		
	}
}
