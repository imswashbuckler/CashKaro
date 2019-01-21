package AquestionAaamaaaaaazoooon;
public class SubArray_HighestAdd {

	static int k;

	public static void maxSubArraySum(int[] arr)
	{
	    	int max = Integer.MIN_VALUE;
	    	int sum = 0;
	    	for(int i=0;i<arr.length;i++)
	    	{
	    		sum=sum+arr[i];
	    		if(max<sum)
	    		{
	    			max=sum;
	    		}
	    		if(sum<0)
	    		{
	    			sum=0;
	    		}
	    	}
	    	System.out.println(max);
	    	
	    	
	}
	public static void main(String[] args) {
		

		int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
		maxSubArraySum(a);
		
	}

}
