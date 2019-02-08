public class SubArray_HighestAdd {

	static int k;

	static int maxSubArraySum(int arr[]) {
		int size = arr.length;
		int max=arr[0];
		
		for(int i=0;i<arr.length-1;i++)
		{
			int k=arr[i]+arr[i+1];
			if(max<k)
			{
				max=k;
				
			}
			
			
		}
		return max;
		
		/*
		for (int i = 0; i < size; i++) {
			end = end + a[i];
			if (max < 0) {
				max = 0;
			}
			if (max_so_far < max) {
			}
			end = 0;
		}
		return max;
*/	}

	public static void main(String[] args) {
		int[] arr = { -10, -2, -3, -6, 2, -120, -187 };

		int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
		System.out.println("Maximum contiguous sum is " + maxSubArraySum(arr));
	}

}
