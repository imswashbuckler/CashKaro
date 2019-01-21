package AProgramsPorblems;

import java.util.Arrays;

public class MergeSort {
	
	private int[] helper;

	private static void sort(int arr[], int low, int high) {
		if (high > low) {
			int mid = (low + high) / 2;
			// System.out.println("low:"+low+"  high:"+high);
			sort(arr, low, mid);
			sort(arr, mid + 1, high);

			// System.out.println("low1:"+low+"  high1:"+high);
			//System.out.println(Arrays.toString(arr));
			merge1(arr, low, mid, high);

		}

	}

	public static void merge(int[] arr, int low, int mid, int high) {

		if (high <= low)
			return;

		int len = high - low + 1;
		int[] temp = new int[len];
		int a = low;
		int b = mid + 1;
		int i = 0;
		while (i < len) {

			//System.out.println(Arrays.toString(temp));

			
			
			if (a <= mid && b <= high) {
				if (arr[a] <= arr[b]) {
					temp[i] = arr[a];
					a++;
				} else {
					temp[i] = arr[b];
					b++;
				}
				i++;
			}
			
			System.out.println(Arrays.toString(temp));

			while (a <= mid && b > high) {
				temp[i] = arr[a];
				a++;
				i++;
			}

			while (b <= high && a > mid) {
				temp[i] = arr[b];
				b++;
				i++;
			}
		}
		for (int k = 0; k < temp.length; k++)
			arr[low + k] = temp[k];
	}

	

	static void merge1(int arr[], int l, int m, int r)
	{
	    int i, j, k;
	    int n1 = m - l + 1;
	    int n2 =  r - m;
	    int[] L= new int[n1];
	    int[] R= new int[n2];
	 
	    /* Copy data to temp arrays L[] and R[] */
	    for (i = 0; i < n1; i++)
	        L[i] = arr[l + i];
	    for (j = 0; j < n2; j++)
	        R[j] = arr[m + 1+ j];
	 
	    /* Merge the temp arrays back into arr[l..r]*/
	    i = 0; // Initial index of first subarray
	    j = 0; // Initial index of second subarray
	    k = l; // Initial index of merged subarray
	    while (i < n1 && j < n2)
	    {
	        if (L[i] <= R[j])
	        {
	            arr[k] = L[i];
	            i++;
	        }
	        else
	        {
	            arr[k] = R[j];
	            j++;
	        }
	        k++;
	    }
	 
	    /* Copy the remaining elements of L[], if there
	       are any */
	    while (i < n1)
	    {
	        arr[k] = L[i];
	        i++;
	        k++;
	    }
	 
	    /* Copy the remaining elements of R[], if there
	       are any */
	    while (j < n2)
	    {
	        arr[k] = R[j];
	        j++;
	        k++;
	    }
	}
	public static void main(String[] args) {
		int[] arr = { 1, 8, 2, 5, 33, 3, 12, 77, 122 };
		MergeSort obj = new MergeSort();
		obj.sort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));

	}
}
