package sorting_algorithms;

import java.util.Arrays;

public class insertionSort {

	public static void main(String[] args) {
		int[] Array={2,6,9,88,57,06,25,4,7,1,15,12,10};
		inserSort(Array);
		System.out.println("insertion sort :Sorted array is" +" " +Arrays.toString(Array));
		System.out.println("Best case - Time complexity is O(n)");
		System.out.println("worst case ,average case - Time complexity is O(n^2)");

	}

	private static void inserSort(int[] array) {
		int n=array.length;
		
		
        for(int i = 1; i < n; i++) {
            int tmp = array[i];
            int j = i-1;
            while(j >= 0 && tmp < array[j]) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = tmp;
		}
		
	}

	}

