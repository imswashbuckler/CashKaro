package AProgramsPorblems;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class Anagram2 {
	//String word = "teste";
	 static boolean b=false;
	 static void isAnagram(String str1, String str2) {  
	        String s1 = str1.replaceAll("\\s", "");  
	        String s2 = str2.replaceAll("\\s", "");  
	        boolean status = true;  
	        if (s1.length() != s2.length()) {  
	            status = false;  
	        } else {  
	            char[] ArrayS1 = s1.toLowerCase().toCharArray();  
	            char[] ArrayS2 = s2.toLowerCase().toCharArray();  
	            Arrays.sort(ArrayS1);  
	            Arrays.sort(ArrayS2);  
	            status = Arrays.equals(ArrayS1, ArrayS2);  
	        }  
	        if (status) {  
	            System.out.println(s1 + " and " + s2 + " are anagrams");  
	        } else {  
	            System.out.println(s1 + " and " + s2 + " are not anagrams");  
	        }  
	    }  
	public void checkana(String word,String Anagm)
	
	{ 
		if(word.length()==Anagm.length())
		{
			
		
		
		char[] chararray = word.toCharArray();
		HashMap<Character,  Integer> map = new HashMap<Character, Integer>();
	//	int count=1;
	
		
		for (char c :chararray)	
		{
			if(map.containsKey(c)) 
			{
				map.put(c, map.get(c)+1);
				//System.out.println(map.get(c));
			}
			else
			{		
				map.put(c, 1);	
			}

		}
				
		System.out.println(map);
		char[] chararray1 = Anagm.toCharArray();
		HashMap<Character,  Integer> map1 = new HashMap<Character, Integer>();
		//int count1=1;
		for (char c :chararray1)	
		{
			if(map1.containsKey(c)) 
			{
				map1.put(c, map1.get(c)+1);
				//System.out.println(map1.get(c));
			}
			else
			{		
				map1.put(c, 1);	
			}

		}
		System.out.println(map1);
		Set<Character> hs = map.keySet();	
		for (char Char:hs )

		if (map.get(Char).equals(map1.get(Char)))
		
		{
			b=true;
			
		}
		else
		{
			b=false;
			break;
			
		}

		}
		else
		{
			b=false;
			//break;
			
			
		}
		
	
		
	}

	
	public static void main(String[] args) {
		
		Anagram2 an = new Anagram2();
		
		an.checkana("Test", "Tes1t");
		System.out.println(b);
		
		
	}
}
