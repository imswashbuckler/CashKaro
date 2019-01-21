package SortingandMerging;

import java.util.Arrays;

public class SelectionSort {

	public static void sort(int arr[]) 
	    { 
	        int n = arr.length; 
	  
	        for (int i = 0; i < n-1; i++) 
	        { 
	             int min_idx = i; 
	            for (int j = i+1; j < n; j++) 
	                if (arr[j] < arr[min_idx]) 
	                    min_idx = j; 
	  
	             
	            int temp = arr[min_idx]; 
	            arr[min_idx] = arr[i]; 
	            arr[i] = temp; 
	        } 
	    } 
	
	
public static void main(String[] args) {

	int arr1[] = { -570, 60, -35, 2, 45, 320, 0 };
	sort(arr1);

	System.out.println(Arrays.toString(arr1));
}	
}
