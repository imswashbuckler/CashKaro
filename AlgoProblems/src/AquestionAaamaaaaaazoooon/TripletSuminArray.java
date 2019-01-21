package AquestionAaamaaaaaazoooon;

public class TripletSuminArray {

	public static void sumTriplet(int[] arr, int n, int sum1) {
		int l = arr.length;
		int diff = l - n;
		int sum=0;
		int j=0;
		int i=0;
		for ( i = 0; i < diff; i++)
		{
			for ( j = i; j < n+i; j++)
			{
				sum = sum + arr[j];
			}
			if(sum==sum1)
			{
					
					break;
				
			}
			else
			{
				sum=0;
			}
			

		}
		System.out.println(i+"   "+(i+n));

	}

	public static void main(String[] args) {
		int[] arr = { -10, -2, -3, 6, -2, -3, -7 };
		sumTriplet(arr,3,-6);
		

	}
}
