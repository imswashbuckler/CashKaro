package AquestionAaamaaaaaazoooon;

public class BinarySearch {

	public static boolean BinSearch(int[] arr, int i, int l, int k) {

		while (i <= l) {
			int mid = (i + l) / 2;

			if (arr[mid] == k) {
				return true;

			} else if (arr[mid] < k) {
				return BinSearch(arr, mid + 1, l, k);

			} else {
				return BinSearch(arr, i, mid - 1, k);

			}

		}
		return false;

	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 19, 21, 23, 26 };
		boolean y = BinSearch(arr, 0, arr.length, 26);
		System.out.println(y);
	}
}
