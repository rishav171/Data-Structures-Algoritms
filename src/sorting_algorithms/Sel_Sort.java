package sorting_algorithms;
import java.util.Arrays;
public class Sel_Sort {

	public static void main(String[] args) {
		int[] A={6,3,4,9,6,5,1,32,75,45,78};
		int x=A.length;
		
		selsort(A,x);
		
		System.out.println("Selection Sort methor:sorted array "+" "+Arrays.toString(A));
		System.out.println("Time Complexity is O(n^2) in worst, best and average cases");
		
	}

	private static void selsort(int[] a, int n) {
	    for (int i = 0; i < n - 1; ++i)
	    {
	      int minIndex = i;
	      for (int j = i + 1; j < n; ++j)
	      {
	        if (a[j] < a[minIndex])
	        {
	          minIndex = j;
	        }
	      }
	      int temp = a[i];
	      a[i] = a[minIndex];
	      a[minIndex] = temp;
			}
			
			
			
		}
		
	}


