package AProgramsPorblems;

import java.util.Arrays;

public class ZeroOneSegreationinOneLoop {

	public static void main(String[] args) {

		int[] arr = { 0, 1, 1, 0, 1, 0, 0, 1, 1, 1, 0, 0 };

		int l=0;
		int h=arr.length-1;
		while(l<h)
		{
			while(arr[l]==0)
			{
			l++;	
				
			}
			while(arr[h]==1)
			{
			h--;	
				
			}
			if(l<h)
			{
				int temp=arr[l];
				arr[l]=arr[h];
				arr[h]=temp;
				
			}
			
			
		}
	
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
		
}
}
	