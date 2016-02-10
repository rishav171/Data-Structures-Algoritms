package sorting_algorithms;

import java.util.Arrays;

public class BubbSort {

	public static void main(String[] args) {
		int[] Array={2,6,9,88,57,06,25,4,7,1,15,12,10};
		BubbleSort(Array);
		System.out.println("Buuble Sort :Sorted array is" +" " +Arrays.toString(Array));
		System.out.println("Best case - Time complexity is O(n)");
		System.out.println("worst case ,average case - Time complexity is O(n^2)");

	}

	private static void BubbleSort(int[] Array) {
		int n=Array.length;
		for(int  i=0; i< n-2; i++)
		{
			for(int j=0;j<n-i-1;j++){
				if(Array[j]>Array[j+1])
				swap(Array,j,j+1);
				
			}
			
		}
		
		
		
	}
		
		

	private static void swap(int[] array, int first, int second) {
	
		
		int temp=array[first];
		array[first]=array[second];
		array[second]=temp;
		
	}
		
	}

	/*private static void swap(int[] array, int j, int i) {
		int temp=array[i];
		array[i]=array[j];
		array[j]=temp;
		
		
	*/


