import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import AProgramsPorblems.factorialByRecursion;

public class FewgeneralAlgo {

/*	public static int fact(int a) {
		
		if(a==1)
		{
			return 1;
		}
		else
		{
			return a*fact(a-1);
			
		}
	
	}

	public static int[] fibo(int a) {
		
		int[] fib= new int[a];
		fib[0]=0;
		fib[1]=1;
		for(int i=2;i<a;i++)
		{
			fib[i]=fib[i-1]+fib[i-2];
			
		}
		return fib;
		
		
	
	}

*/
	public static void fiboWithPrime(int a) {
		int[] fib= new int[a];
		fib[0]=0;
		fib[1]=1;
		for(int i=2;i<a;i++)
		{
			fib[i]=fib[i-1]+fib[i-2];
			int k=fib[i];
			for(int j=2;i<k/2;k++)
			{
				if(k%j!=0)
				{
					//System.out.println(k);
					
				}
				
			}
			
			
		}
		
		
	
	}

	public static void main(String[] args) {
		fiboWithPrime(100);
/*		System.out.println((Arrays.toString(fibo(10))));
		System.out.println(fact(5));
		
		List<String> ls = new ArrayList<String>();
		ls.add("a");
		ls.add("b");
		ls.add("v");
		System.out.println(ls.toString());
		
		String str="abcdef";
		char[] chaArr= str.toCharArray();
		String str1="";
		for(int i=0;i<chaArr.length;i++)
		{
			str1=str1+chaArr[i];
			
		}
		
		System.out.println(str1);
	*/	
		}

}
