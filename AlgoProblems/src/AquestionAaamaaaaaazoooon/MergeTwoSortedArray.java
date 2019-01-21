package AquestionAaamaaaaaazoooon;

public class MergeTwoSortedArray {

	public static int[] merge2SorteArray(int[] arr1, int[] arr2) {
		int[] merge = new int[arr1.length + arr2.length];
		int i = 0;
		int j = 0;
		int l1 = arr1.length;
		int l2 = arr2.length;
		int k = 0;
		while (i < l1 && j < l2) {
			if (arr1[i] < arr2[j]) {
				merge[k] = arr1[i];
				k++;
				i++;

			} else {
				merge[k] = arr2[j];
				k++;
				j++;
			}
		}
		while (i < l1) {
			merge[k++] = arr1[i++];
		}
		// Store remaining elements of second array
		while (j < l2) {
			merge[k++] = arr2[j++];
		}
		return merge;

	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 5, 6, 8, 9, 10 };
		int[] arr2 = { 1,2, 4, 7 };
		int[] mer = merge2SorteArray(arr1, arr2);
		for (int i = 0; i < mer.length; i++) {
			System.out.print(mer[i] + "-");
		}

	}

}
