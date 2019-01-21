import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;



public class GroupAnagrams {

	public static void FindAnagrma(String file) throws IOException
	{
		File fl = new File(file);

	     Map<String, List<String>> map=new LinkedHashMap<String, List<String>>();
		
		FileInputStream fi=new FileInputStream(fl);
		FileReader fr = new FileReader(fl);
		BufferedReader br =new BufferedReader(fr);
		String l;
		   while((l=br.readLine())!=null)    
		{
			String str=l;
			char[] chArr=str.toCharArray();
			Arrays.sort(chArr);
			String sortedK= new String(chArr);
			
			if(map.containsKey(sortedK))
			{
				map.get(sortedK).add(l);
				
			}
			
			else
			{
			map.put(sortedK,new ArrayList<String>());
			map.get(sortedK).add(l);
				
			}
			
				
			}
			
		for(String k:map.keySet())
		{
			System.out.println(map.get(k));
			
		}
		   
		
		
		
	}
	
	public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("D://in.txt"));
        Scanner in = new Scanner(System.in);
 
        FindAnagrma("D://in.txt");
        
      /*  Map<String, Set<String>> map = new HashMap<>();
        while (in.hasNext()) {
            String word = in.nextLine();
            int[] keyArr = new int[26];
            for (char c : word.replaceAll(" ", "").toCharArray()) {
                keyArr[c - 'a'] = keyArr[c - 'a'] + 1;
            }
            String key = Arrays.toString(keyArr);
 
            if (!map.containsKey(key)) {
                map.put(key, new TreeSet<>());
            }
 
            map.get(key).add(word);
        }
 
        for (String key : map.keySet()) {
            String out = map.get(key).toString();
            System.out.println(out.substring(1, out.length() - 1));
        }
*/    }
}