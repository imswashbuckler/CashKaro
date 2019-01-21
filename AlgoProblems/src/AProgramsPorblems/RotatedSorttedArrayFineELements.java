package AProgramsPorblems;

public class RotatedSorttedArrayFineELements {

	public static int findElementinBinarySearch(int[] arr, int l, int k) {

		int low = 0;
		int high = l;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == k) {

				return mid;

			} else if (arr[mid] < k) {
				low = mid + 1;

			} else {
				high = mid - 1;

			}

		}
		return -1;

	}

	public static int findElement(int[] arr, int l, int k) {

		boolean b = false;
		int low = 0;
		int high = l;
		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr[mid] == k) {
				return mid;
			}

			if (arr[mid] <= arr[high]) {

				if (k > arr[mid] && k <= arr[high]) {
					low = mid + 1;

				} else {
					high = mid - 1;

				}
			} 
			else // (arr[mid] >= arr[high])arr = { 40, 5, 6, 7, 8, 1, 3 };

			{
				if (k < arr[mid] && arr[low] <= k) {
					high = mid - 1;
				}

				else {

					low = mid + 1;

				}

			}

		}

		return -1;
	}

	public static int findPivot(int[] arr, int lenght)

	{
		int low = 0;
		int high = lenght;

		while (high >= low) {

			int mid = (high + low) / 2;
			if (arr[mid] > arr[mid + 1]) {
				return mid + 1;

			} else if (arr[low] <= arr[mid]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}

		}

		return -1;
	}

	public static void main(String[] args) {

		int[] arrb = { 4, 5, 6, 7, 8, 9, 10 };
		// int m=findElementinBinarySearch(arrb,arrb.length-1,3);
		// xSystem.out.println(m);
		int[] arr = { 4, 5, 6, 7, 8, 1, 3 };
		 int pivot = findPivot(arr, arr.length - 1);
		 System.out.println(pivot);
	/*	int indexOfElemet = findElement(arr, arr.length - 1, 50);
		System.out.println(indexOfElemet);
		String str1 = new String("String1");
		String str2 = new String("String2");
		System.out.print(str1 == str2);
		System.out.print(str1.equals(str2));
		str1 = str2;
		System.out.print(str1 == str2);
System.out.println();
		String a="dada";
	    String b="dada";
	    // a=b;
		System.out.println(a==b);
	*/	
	}
}