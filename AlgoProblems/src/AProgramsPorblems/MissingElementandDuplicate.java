package AProgramsPorblems;

import java.util.HashMap;
import java.util.Map;

public class MissingElementandDuplicate {
	
	public static void main(String[] args) {
		
	int Numsum10=0;
	int Sumarr=0;
	int[] arr={1,2,3,4,5,5,7,8,9,10};
	int count=1;
	int missinnum=0;
	int p=0;
	
	for(int i=1;i<=10;i++)
	{
		Numsum10=Numsum10+i;
		
	}
	System.out.println("Numsum10:"+Numsum10);
	
	Map<Integer,Integer> map=new HashMap<Integer, Integer>();
	for(int i=0;i<arr.length;i++)
	{
		
		if(map.containsKey(arr[i]))
		{
			map.put(arr[i], count+1);
			
		}
		else
		{
			map.put(arr[i], count);
			
		}
		
	}
	
	for(int m:map.keySet())
	{
		
		if(map.get(m)>1)
			
		{
			
			System.out.println(m);
			p=m;;
			
		}
	}
	
	for(int i=0;i<arr.length;i++)
	{
		Sumarr=Sumarr+arr[i];	
		
	}
	
	System.out.println("SumArr:  "+Sumarr);
	int sum2=Sumarr-p;
	 missinnum=Numsum10-sum2;


	
	System.out.println(missinnum);
	
	
	}
}
