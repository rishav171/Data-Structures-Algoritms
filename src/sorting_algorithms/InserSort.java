package sorting_algorithms;

import java.util.Arrays;

public class InserSort {

	public static void main(String[] args) {
		int[] array={2,5,99,33,63,85,35,74,5,4,84,3};
		mergesort(array);
		System.out.println("Merge Sort :"+" "+Arrays.toString(array));
		
	}

	private static void mergesort(int[] array) {
		
		mergesort(array,0,array.length-1);
		
	}

	private static void mergesort(int[] array, int start, int end) {
		if(start<end){
		int mid=(start+end)/2;
		mergesort(array,start,mid);
		mergesort(array,mid+1,end);
		merge(array,start,mid,end);
		
		
		
		
	}
	}

	private static void merge(int[] array, int start, int mid, int end) {
		// TODO Auto-generated method stub
		
	}

}
