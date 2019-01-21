package AProgramsPorblems;

import java.util.Scanner;

public class FactorialRecursion {

	int  result1=1;
	public static int fact(int a)
	{
		if(a==1)
		{
			return 1;
		}
			
		int res=a*fact(a-1);
	//	System.out.println(res);
		return res;
	}
	

	public static int  fact2(int a,int res)
	{
		//int res=1;
		if(a==1)
		{
			 return 1;
		}
	
		while(a>1)
		{
		//	System.out.println(res);
			fact2(a-1,res);
			res=a*res;
			//res =a*fact2(a-1,res);
			a--;
			 
		}
		return res;
	}
	
	public static int fact1(int a)
	{
		int result=a;
	while(a>1)
	{
		 result=result*(a-1);
		 a--;
		
	}
	
	return result;
	
	}
	public static int  findfact(int k)
	{
		int result=1;
		if(k==1)
		{
			return 1;
		}
		else
		{
			System.out.println(result);
	     	result=k*findfact(k-1);	 
		//k--;
		}
		
		return result;
	}
	
	

	public static void main(String[] args) 
	{
		/*System.out.println("Test");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		System.out.println(a);
	*/	FactorialRecursion rc = new FactorialRecursion();
		int k =rc.fact(5);
		System.out.println(k);
		int s=fact2(5,1);
		System.out.println(s);
		
			
	}

}
