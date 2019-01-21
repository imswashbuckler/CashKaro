import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;


public class AnagramListSort 
{
	 static TreeMap<Integer, Set<String>> m= new TreeMap<Integer, Set<String>>();


	public static void sortAnagram(String[] arr)
	{
		for(int i=0;i<arr.length-1;i++ )
		{
			Set<String> st = new TreeSet<String>();

			int count=1;

			for(int j=i+1;j<arr.length;j++)
			{
//	String[] str={"ABC","ACB","DEF","PQR","RQP","FED",	"CAB"};
			if(arr[j]!="" && arr[i]!="" )
			{
			if(isAnagram(arr[i],arr[j])==true )
			{
				st.add(arr[i]);
				st.add(arr[j]);
				arr[j]="";
				m.put(i, st);

				
			}
			
			}
			
		}
		}
		

	}

	public static boolean isAnagram(String str, String str1) {
		boolean b = true;

		char[] Arr1 = str.toCharArray();
		char[] Arr2 = str1.toCharArray();

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
		if(Arr1.length==Arr2.length)
		{
		for (char c : Arr1) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);

			}

		}
		for (char c : Arr2) {
			if (map1.containsKey(c)) {
				map1.put(c, map1.get(c) + 1);
			} else {
				map1.put(c, 1);

			}

		}

		for (char k : map.keySet()) {
			if (map.get(k) == map1.get(k)) {

			} else {
				b = false;
				break;

			}

		}
		}
		else
		{
			b=false;
		}
		return b;
	}

	
	public static void main(String[] args) {
		
		
		String[] str={"RQP","ABC","ACB","DEF",
				"PQR","FED",	"CAB"};
		
		sortAnagram(str);
		List<Entry<Integer,Set<String>>> list = new 
				ArrayList<Entry<Integer,Set<String>>>(m.entrySet());
		
		// List<Entry<String, Integer>> list=new ArrayList<Map.Entry<String,Integer>>(map.entrySet());
	//	Collections.sort(list, new Comparator<Map.Entry<String,Set<String>>>() 
		
				Collections.sort(list, new Comparator<Entry<Integer,Set<String>>>() 
						{		

							@Override
							public int compare(Entry<Integer, Set<String>> o1,
									Entry<Integer, Set<String>> o2) {
								// TODO Auto-generated method stub
				return o1.getValue().toString().compareTo(o2.getValue().toString());
							}
				
				});
						
				//System.out.println(m);
		// Collections.sort(list,new Comparator<Map.Entry<String,Set<String>>>()		
		/*String[] str={"pear","amleth","dormitory",
				"tinsel","dirty room","hamlet",	"listen","silnet"};
	*/
	for(int s:m.keySet())
		{
		System.out.println(s+"--"+m.get(s));	
			
		}
		
	}
}
