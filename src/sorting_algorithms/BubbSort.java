package sorting_algorithms;

import java.util.Arrays;

public class BubbSort {

	public static void main(String[] args) {
		int[] Array={2,6,9,88,57,06,25,4,7,1,15,12,10};
		bubsort(Array);
		System.out.println("Buuble Sort :Sorted array is" +" " +Arrays.toString(Array));
		System.out.println("Best case - Time complexity is O(n)");
		System.out.println("worst case ,average case - Time complexity is O(n^2)");

	}

	private static void bubsort(int[] array) {
		
		int n = array.length;
		
		  for(int i=0;i<n-1;i++){

			   for(int j=0;j<n-1-i; j++){

			     if(array[j] > array[j+1])

			       swap(array,j,j+1);
				
			}
			
			
			}
			
		}
		
		

	private static void swap(int[] array, int j, int i) {
		// TODO Auto-generated method stub
		int temp=array[j];

		 array[j]=array[i];

		 array[i]=temp;
		
	}
		
	}

	/*private static void swap(int[] array, int j, int i) {
		int temp=array[i];
		array[i]=array[j];
		array[j]=temp;
		
		
	*/


