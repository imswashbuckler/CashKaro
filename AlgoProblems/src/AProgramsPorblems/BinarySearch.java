package AProgramsPorblems;

public class BinarySearch {
	public static boolean TestSprint(int[] arr, int p)
	{
		int k=0;
		int l=arr.length;
		while(l>=k)
		{
			int pivot=(l+k)/2;
			
	        //int pivot = k + (l - k)/2;

		if(arr[pivot]==p)
		{
			return true;
			
		}
		else if(arr[pivot]>p)
		{
			l=pivot-1;
			
		}
		else if(arr[pivot]<p)
		{
			k=pivot+1;
			
			
		}	
			
		}
		return false;
		
		
		
	}
	
public static void main(String[] args) {
	int[] arr={2,3,4,5,8,10,14};
	System.out.println(TestSprint(arr,2));
	System.out.println(TestSprint(arr,3));
	System.out.println(TestSprint(arr,4));
	System.out.println(TestSprint(arr,5));
	System.out.println(TestSprint(arr,1));
	System.out.println(TestSprint(arr,6));
	
	
}	

}
