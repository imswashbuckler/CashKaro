public class FindElementinSortedArray {

	public static int getElementPresence1(int[] arr, int low, int high, int k) {
		int p = (low + high) / 2; //int arr1[] = { 5, 7, 8, 9, 10, 11, 12, 13 };0,8,13
		while (low <= high) {

			if (arr[p] == k) 
			{
				return p;
			}  if (arr[p] < k) {
				return getElementPresence1(arr, p+1, high, k);
			}  if (arr[p] > k) {

				return getElementPresence1(arr, low, p-1, k);
			}

		}
		return -1;
	}

	public static int getElementPresence(int[] arr, int low, int high, int k) {

		int piv = (low + high) / 2;
//		boolean b = false;

		while (low <= high) {
			if (arr[piv] == k) {
				return piv;

			}
			if (k < arr[piv]) {
				return getElementPresence(arr, low, piv - 1, k);

			}
			if (k > arr[piv]) {
				return getElementPresence(arr, piv + 1, high, k);

			}

		}
		return -1;
	}

	public static void main(String[] args) {
		int arr1[] = { 5, 7, 8, 9, 10, 11, 12, 13 };
		int m = 0;
		int n = arr1.length - 1;
		int key = 5;
		int g = getElementPresence1(arr1, m, n, key);
		System.out.println(g);
	}
}
