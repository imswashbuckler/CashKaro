package ADeafult;

public class FindNumberinSortedArray_pivot {
	
	public static int getElementPresence(int[] arr,int low , int high,int k)
	{
		boolean b=false;
		while(high>=low)
		{
			int pivot=(high+low)/2;
			
			if(k==arr[pivot])
			{
				return pivot;
				
			}//1,2,3,4,5,6,7,8,  3
			 if(k<arr[pivot])
			{
			//	high=pivot;
				 return getElementPresence(arr,low ,pivot-1, k);
			}
			 if(k>arr[pivot])
			{
			//	low=pivot;
				return getElementPresence(arr,pivot+1 ,high, k);
				
			}
			
		}
		return -1;
		
		
	}

	
	public static void main(String[] args) {
		 int arr1[] = {5, 7, 8, 9, 10, 11, 12,13};
	      int m=0;
		  int n = arr1.length-1;
	      int key = 13;
	      int g=getElementPresence(arr1,m,n,key);
	      System.out.println(g);

	}
}
