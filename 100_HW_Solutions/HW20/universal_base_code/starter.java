import java.util.*;

class starter {
	
	public static void bubbleSort(ArrayList<Integer> arr){
		for(int outer = 0; outer < arr.size()-1; outer++){
			for(int inner = 0; inner < arr.size()-outer-1; inner++){
				if(arr.get(inner) > arr.get(inner+1)){
					int temp = arr.get(inner);
					arr.set(inner, arr.get(inner+1));
					arr.set(inner+1, temp);
				}
			}
		}
	}
	
	public static void insertionSort(ArrayList<Integer> arr){
		int outer, inner, key;
		
		for(outer = 1; outer < arr.size(); outer++){
			key = arr.get(outer);
			inner = outer-1;
			
			while(inner >= 0 && arr.get(inner) > key){
				arr.set(inner+1, arr.get(inner));
				inner = inner - 1;
			}
			arr.set(inner+1, key);
		}
	}
	
	public static void selectionSort(ArrayList<Integer> arr){
		int outer, inner, min_index;
		
		for(outer = 0; outer < arr.size(); outer++){
			min_index = outer;
			for(inner = outer+1; inner < arr.size(); inner++){
				if(arr.get(inner) < arr.get(min_index)){
					min_index = inner;
				}
			}
			int temp = arr.get(outer);
			arr.set(outer,arr.get(min_index));
			arr.set(min_index, temp);
		}
		
	}
	
	
	
	public static void main(String args[]) {
		
		ArrayList <Integer> arr1 = new ArrayList<Integer>();
		ArrayList <Integer> arr2 = new ArrayList<Integer>();
		ArrayList <Integer> arr3 = new ArrayList<Integer>();
		
		for(int c = 0; c < 100; c++){
			arr1.add(c, ((int)(Math.random()*100)));
			arr2.add(c, ((int)(Math.random()*100)));
			arr3.add(c, ((int)(Math.random()*100)));
		}
		
		//Bubble Sort
		System.out.print("Bubble Sort: ");
		bubbleSort(arr1);
		bubbleSort(arr2);
		bubbleSort(arr3);
		
		System.out.println(arr1.get(arr1.size()/2) + ", " + arr2.get(arr2.size()/2) + ", " + arr3.get(arr3.size()/2));
		
		//Selection Sort
		System.out.print("Selection Sort: ");
		selectionSort(arr1);
		selectionSort(arr2);
		selectionSort(arr3);
		
		System.out.println(arr1.get(arr1.size()/2) + ", " + arr2.get(arr2.size()/2) + ", " + arr3.get(arr3.size()/2));
		
		//Insertion Sort
		System.out.print("Insertion Sort: ");
		insertionSort(arr1);
		insertionSort(arr2);
		insertionSort(arr3);
		
		System.out.println(arr1.get(arr1.size()/2) + ", " + arr2.get(arr2.size()/2) + ", " + arr3.get(arr3.size()/2));
		
	}
	
	
}
