package AProgramsPorblems;

public class ArraysumPairs {

	// Q3
	static int s=0;
	public static int isSumPossible(int[] array, int sum) {

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {

				if ((array[i] + array[j]) == sum) {
					s=1;
					// return s;
					
				} else {
					
					
					// return s;

				}
			}

		}
		return s;
	}

	public static void main(String args[]) throws Exception {

		int arr[] = { 1, 8, 30, 40, 100 };
		int n = 70;
		int k= isSumPossible(arr, n);
		System.out.println(k);

	}
}
