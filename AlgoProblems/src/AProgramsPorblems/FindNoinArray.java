package AProgramsPorblems;

public class FindNoinArray {

	public void findNoinArray(int[] arr, int k)

	{
		int low = 0;
		int high = arr.length - 1;
		while (high > low) {
			if (arr[low] == k)

			{
				System.out.println(low);
				break;
			} else if (arr[high] == k) {
				System.out.println(high);
				break;
			} else {
				low++;
				high--;

			}

		}

	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 56, 7, 8, 88, 23 };
		FindNoinArray obj = new FindNoinArray();
		obj.findNoinArray(arr, 2);

	}

}
