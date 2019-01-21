package DynamicProgrammin;

import java.util.Arrays;

public class fibonacciSeries {
	
	
	public static void findfibo(int n)
	{
		int[] fib =new int[n];
		 fib[0]=0;
		 fib[1]=1;
		 
		 for(int i=2;i<n;i++)
		 {
			 fib[i]=fib[i-1]+fib[i-2];
			 
		 }
		 
		 System.out.println(Arrays.toString(fib));
		
		
	}
	
	
	public static int  findfibobyrecurr(int n)
	{
		if(n==0)
		{
			return 0;
			
		}
		if(n==1)
		{
			return 1;
			
		}
		else	
		return findfibobyrecurr(n-1)+findfibobyrecurr(n-2);		 	
		}
	public static void main(String[] args) {
		
		findfibo(250);
		int n=250;
		/*for(int i=0;i<n;i++)
		{
			int m=findfibobyrecurr(i);
			
			System.out.print(m+",");
		}*/
		
	}

}
