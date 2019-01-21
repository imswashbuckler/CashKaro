package Brills;
import java.util.LinkedHashMap;
import java.util.Map;


public class HashMapWithDuplicate2 {

	
	static Map<String, String> mp = new LinkedHashMap<String, String>();
	
	public static void AddduplicateKey(String[] str,String[] str1)
	{
		for(int i=0;i<str.length;i++)
		{
			if(mp.containsKey(str[i]))
			{
			int count=1;
			String k=str[i];
			
			while(mp.containsKey(k))
			{
				 k =str[i]+"_"+count;
				count=count+1;
				
				
			}
			mp.put(k, str1[i]);
			
			
		}
			else
			{
				mp.put(str[i], str1[i]);
				
			}
			
			
		}
	}
	

	
		
public static void main(String[] args) {

	String[] key = { "A", "B", "C", "D", "D", "F", "A", "D", "F", "A", "A" };
	// char[] key={'A','B','C','D','E','F','G','I','J','K','L'};

	String[] val = { "V1","V2", "V3","V4","V5","V6","V7","V8", "V9","V10", "V11‌​" };
	//clsDuplicateKey(key, val);
	AddduplicateKey(key,val);
	for (String ch : mp.keySet()) {
		System.out.println(ch + "---" + mp.get(ch));

	}

	/*for (String ch : map1.keySet()) {
		System.out.println(ch + "---" + map1.get(ch));

	}*/
}
}
