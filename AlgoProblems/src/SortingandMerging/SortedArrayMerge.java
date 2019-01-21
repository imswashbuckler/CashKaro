package SortingandMerging;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortedArrayMerge {
	static int[] arr1 = { 1, 5,8, 9, 10, 15, 20,22,33,49,50,55 ,200,500};
	static int[] arr2 = { 2, 3, 8, 13 ,100,800};

	static void merge(int m, int n) {
		// Iterate through all elements of ar2[] starting from
		// the last element
		for (int i = n - 1; i >= 0; i--) {
			/*
			 * Find the smallest element greater than ar2[i]. Move all elements
			 * one position ahead till the smallest greater element is not found
			 */
			int j, last = arr1[m - 1];
			for (j = m - 2; j >= 0 && arr1[j] > arr2[i]; j--)
				arr1[j + 1] = arr1[j];

			// If there was a greater element
			if (j != m - 2 || last > arr2[i]) {
				arr1[j + 1] = arr2[i];
				arr2[i] = last;
			}
		}
	}

	public static void merge2(int[] a, int[] b) {
		int[] answer = new int[a.length + b.length];
		int i = 0, j = 0, k = 0;

		while (i < a.length && j < b.length) {
			if (a[i] < b[j])
				answer[k++] = a[i++];

			else
				answer[k++] = b[j++];
		}

		while (i < a.length)

			answer[k++] = a[i++];

		while (j < b.length)

			answer[k++] = b[j++];

		System.out.println(Arrays.toString(answer));
	}

	public static void merge3(int[] a, int[] b) {
		int[] answer = new int[a.length + b.length];

		int i = 0, j = 0;
		int k = 0;
		// static int[] arr1 = { 1, 5, 9, 10, 15, 20,22,33,49,50,55 ,200};
		// static int[] arr2 = { 2, 3, 8, 13,100 };
		while (i < arr1.length && j < arr2.length) {//1,2,3,8,9
			//i0,1,1,1,2,2,3
			//j0,0,1,2,2,3,3
			//k0,1,2,3,,4,5,6
			if (a[i] < b[j]) {
				answer[k] = a[i];
				k++;
				i++;
			} else {
				answer[k] = b[j];
				k++;
				j++;

			}
		}

		while (i < arr1.length)
			answer[k++] = arr1[i++];

		// Store remaining elements of second array
		while (j < arr2.length)
			answer[k++] = arr2[j++];

		for (int p : answer) {
			System.out.print(p + ",");

		}
	}

	public static void mergeArrays(int[] arr1, int[] arr2, int n1, int n2,
			int[] arr3) {
		int i = 0, j = 0, k = 0;

		// Traverse both array
		while (i < n1 && j < n2) {
			// Check if current element of first
			// array is smaller than current element
			// of second array. If yes, store first
			// array element and increment first array
			// index. Otherwise do same with second array
			if (arr1[i] < arr2[j])
				arr3[k++] = arr1[i++];
			else
				arr3[k++] = arr2[j++];
		}

		// Store remaining elements of first array
		while (i < n1)
			arr3[k++] = arr1[i++];

		// Store remaining elements of second array
		while (j < n2)
			arr3[k++] = arr2[j++];
		
		for (int p : arr3) {
			System.out.print(p + " ");

		}
	
	}

	public static void main(String[] args) {

		// merge2(arr1, arr2);
		// merge(arr1.length, arr2.length);
		// System.out.print("After Merging \nFirst Array: ");
		// System.out.println(Arrays.toString(arr1));
		// System.out.print("Second Array:  ");
		// System.out.println(Arrays.toString(arr2));

		// System.out.println(Arrays.asList(arr1.toString()));
		// System.out.println(Arrays.asList(arr2.toString()));
		int[] answer1 = new int[arr1.length + arr2.length];
		merge3(arr1, arr2);
//		mergeArrays(arr1,arr2,arr1.length,arr2.length,answer1);

	}
}