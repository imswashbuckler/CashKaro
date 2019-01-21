package comperator;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StartwithVowelEndsWithConstant {


 		static boolean isVowel(char c)
    {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o'
                                              || c == 'u');
    }
 
    static boolean isConsonant(char c)
    {
        return !(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }
    static HashSet<String> st1=new HashSet<String>();

public static HashSet<String> printSub(String s)
{  
	 HashSet<String> st = new HashSet<String>();

    for (int i = 0; i < s.length(); i++) {
        if (isVowel(s.charAt(i))) {
      for (int j = (s.length() - 1); j >= i; j--) {
          if (isConsonant(s.charAt((j)))) {
              String str_sub = s.substring(i, j + 1);
              st.add(str_sub);
             // System.out.println(str_sub);
              for (int k = 1; k < str_sub.length() - 1; k++) {
                  StringBuffer sb = new StringBuffer(str_sub);
                  sb.deleteCharAt(k);
                  findSubstrings(sb.toString());
              }
          }
      }
  }
}

return st;

	}

public static void  findSubstrings(String s) 
{
 st1=printSub(s);
	
	
    }

public void HashSet()
{
	
	for(String str1 :st1 ){
		   System.out.println(str1);
		}

}

public static void main(String[] args) {
	
	findSubstrings("aab	");
	
}
}

