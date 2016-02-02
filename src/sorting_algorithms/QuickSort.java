package sorting_algorithms;

public class QuickSort {
	
	public static void main(String[] args) {
		int[] array={3,8,6,5,33,12,67,44,77,98,34,12,56,412};
		Quicksort(array,0,array.length-1);
	}

	private static void Quicksort(int[] array, int start, int end) {
		while(start<=end){
		partition(array,start,end);
		Quicksort(array,start,pivot_index-1);
		Quicksort(array,pivot_index+1,end);
		
		
		}
		
		
	}

	private static int partition(int[] array, int start, int end) {
		int pivot_index=0;
		int pivot=array[end];
		
		for(int i=0;i<end;i++){
			if(array[i]<pivot){
				swap(array[i],array[pivot_index]);
				pivot_index=pivot_index+1;
			}
			
		}
		swap(array[pivot_index],array[end]);
		return pivot_index;
		
		
		
	}

	private static void swap(int fisrtelement, int secondelement) {
		int temp;
		temp=secondelement;
		secondelement=fisrtelement;
		fisrtelement=temp;
		
	}

}
