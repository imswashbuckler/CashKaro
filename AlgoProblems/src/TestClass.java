import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;


public class TestClass {

	 static Map<ArrayList<Integer>, Integer> map= new HashMap<ArrayList<Integer>, Integer>();

	
	public  static void GetSubSequnce(int[] arr)
		{
		
	List<Integer> arrdiff= new ArrayList<Integer>();
		for(int i=0;i<arr.length-1;i++)
		{
			
			arrdiff.add(arr[i]-arr[i+1]);
		}
		
		int larrdif=arrdiff.size();
		for(int i=0;i<larrdif-1;i++)
		{
			for(int j=i+1;j<larrdif;j++)
			{
			if(arrdiff.get(i)==arrdiff.get(j))
			{
				ArrayList<Integer> arr1 = new ArrayList<Integer>();
			
				for(int k=i ;k<=j+1; k++)
				{
					arr1.add(arr[k]);
				}
			map.put(arr1, arr1.size());		
				
			}
			else
			{
				break;
				
			}
			
			
		}
		}
	//	System.out.println(arrdiff);
	}
	
	public static void main(String[] args) {
		
		int[] arr={1,3,4,5,-8,-9,-10,
				12,18,20,22,3,4,6,11,10,9,8,22,20,18,12,13,-7,-8,-9,-10,11,10,9};
		
		GetSubSequnce(arr);
		System.out.println(map);
		Set<Integer> st = new TreeSet<Integer>();

		for(ArrayList<Integer> Larr:map.keySet())
		{
			int val=map.get(Larr);
			st.add(val);
			
		}
		
		for (Integer s : st) {
		{
			System.out.print("SIZE:"+s);
			
			for(ArrayList<Integer> Larr:map.keySet())
			{
				
				
			if(map.get(Larr)==s)
			{
				for(ArrayList<Integer> arr4:map.keySet())
				{
				if(arr4.contains(Larr)!=true)
				{				
			System.out.println(" SEQ:"+Larr);
				}
			}
			}}
		
			}
		
	}
	}
}
