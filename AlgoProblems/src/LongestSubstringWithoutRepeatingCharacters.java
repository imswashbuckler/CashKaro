import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;


public class LongestSubstringWithoutRepeatingCharacters {
	public static HashSet<Character> st = new HashSet<Character>();

	public static int lengthOfLongestSubstringNew(String s) {
		int i = 0;
		int j = 0;
		int l = 0;
		while (i < s.length()) {
			if (!st.contains(s.charAt(i)))
			{
				st.add(s.charAt(i));
				i++;

			} else {
				
				if (st.size() > l) 
				{
					l = st.size();
				}
				  {
					  Iterator<Character> tr=st.iterator();
					  while(tr.hasNext())
					  {
						  char c = (Character)tr.next(); 
				           
				                tr.remove(); 
					  }
					st.add(s.charAt(i));

				}
					i++;


			}

		}
return l;
	}

	public static int lengthOfLongestSubstring5(String s) {
		int i = 0;
		int j = 0;
		int length = 0;
		while (j < s.length())// bacabd
		{
			if (!st.contains(s.charAt(j))) {
				st.add(s.charAt(j));
				j++;
				length = Math.max(length, j - i);
			}

			else {
				st.remove(s.charAt(i));
				i++;

			}

		}
		return length;

	}

	public static void main(String[] args) {

		String k = "aaDSS";
		int j = lengthOfLongestSubstringNew(k);
		System.out.println(j);
		//System.out.println(st.toString());

		// LinkedList<String> ll = new LinkedList<String>();

		/*
		 * ll.add("A"); ll.add("java2s.com"); ll.add("B"); ll.add("C");
		 * ll.add("java2s.com");
		 */

		// String str = ll.pop();
		// System.out.println(str);
		// System.out.println(ll);

	}
}
