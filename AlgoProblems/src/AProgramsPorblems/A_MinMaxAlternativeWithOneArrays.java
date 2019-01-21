package AProgramsPorblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class A_MinMaxAlternativeWithOneArrays 
{
	public static void main(String[] args) 
	{
Integer[] arr={14,15,16,2,3,9,4,10,5,6,7,8,12,19,20,1};

for(int i=0;i<arr.length;i++)
{
	for(int j=i+1;j<arr.length;j++)
	{
		if(arr[i]<arr[j])
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;					
		}		
	}

}
System.out.print(Arrays.toString(arr));
	ArrayList<Integer> list = new ArrayList(Arrays.asList(arr));
		//Collections.sort(list,Collections.reverseOrder());
		int i=1;
		//System.out.println(list.size());
		while(i<list.size()){
			int val = list.remove(list.size()-1);
			System.out.println(val);
			list.add(i, val);
			i=i+2;
		}
		System.out.println(list);		
	}
}	
	

