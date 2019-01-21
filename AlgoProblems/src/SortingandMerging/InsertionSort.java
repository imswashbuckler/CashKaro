package SortingandMerging;

import java.util.Arrays;

public class InsertionSort {

	public static void insertionSort(int[] arr) {
		int key;
		for (int i = 1; i < arr.length; i++) {
			key = arr[i];
			int j = i - 1;
			while (j>= 0 && key < arr[j]) {
				//int temp=arr[j+1];
				arr[j + 1] = arr[j];
				//arr[j]=temp;
				j--;

			}
            arr[j+1] = key;


		}

	}

	public static void main(String[] args) {

		int[] arr = { 10, 6, 7, 4, 2, 34 };

		insertionSort(arr);

		System.out.println(Arrays.toString(arr));

	}
}
