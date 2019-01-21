package AProgramsPorblems;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class __AdobeHackerEarth {
	
    public static void main(String args[] ) throws Exception {
      
    //	Q1
    //  Scanner scanner = new Scanner(System. in); 
      //  String input = scanner. nextLine(); 
      /* String input = "edcba";
        char[] chars = input.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        System.out.println(sorted);
 */
        
      // Q2
   String input1="TO BE OR NOT TO BE";     
     String[] splitted = input1.split(" ");
     Map<String, Integer> hm = new TreeMap<String, Integer>();

     for (int i=0; i<splitted.length ; i++) {
        if (hm.containsKey(splitted[i])) {
           int cont = hm.get(splitted[i]);
           hm.put(splitted[i], cont + 1);
        } else {
           hm.put(splitted[i], 1);
        }
     }
     System.out.println(hm.size());
          
     for(String s1:hm.keySet())
     {
    	 System.out.println(s1 +" "+hm.get(s1));
    	 
    	 
     }
    
}
}