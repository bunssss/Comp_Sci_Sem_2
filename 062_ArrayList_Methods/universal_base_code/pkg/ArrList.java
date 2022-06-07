package pkg;
import java.util.*;
import java.util.Scanner;
import java.util.Random;


public class ArrList {

public static void toStringArrayList(ArrayList <Integer> arr){
	for(int c = 0; c < arr.size(); c++){
		System.out.print(arr.get(c) + " ");
	}
}

public static int getArrayListAverage(ArrayList <Integer> arr){
	int avg = arr.get(0);
	
	for(int c = 0; c < arr.size()-1; c++){
		System.out.print(avg + " ");
		avg = avg + arr.get(c+1);
	}
	
	avg = avg/arr.size();
	
	return avg;
}

}

