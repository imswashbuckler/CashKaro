package ADeafult;

import java.util.LinkedHashSet;
import java.util.Set;


public class LongestSubstringWithoutRepeatingCharacters {

	public static Set<Character> st = new LinkedHashSet<Character>();
	String sr = "";

	public static void getUniqueSubstr(String str) {//String k = "abblmlini";
		int leng=0;
		char[] chrA = str.toCharArray();
		int l = 0;
		int j = 0;
		for (int i = 0; i < chrA.length; i++) {
			char ch = chrA[i];
			if (!st.contains(ch)) {
				st.add(ch);

			}

			else {
				
				l = st.size();
				if(l>leng)
				{
					leng=l;
				}
				 while(j<i){
		                if(str.charAt(j)==ch)
		                {
		                    j++;
		                    break;
		                }else{
		                    st.remove(str.charAt(j));
		                    j++;
		                }
		            }
				
				

			}

		}
		System.out.println(leng);
	}

	/*
	 * public static void lengthOfLongestSubstring5(String s) { int j=0; int
	 * i=0; int lenght = 0; while(j<s.length()) { if(!st.contains(s.charAt(j)))
	 * { st.add(s.charAt(j)); j++;
	 * 
	 * } else {
	 * 
	 * if(s.charAt(j)!=s.charAt(i)) { st.remove(s.charAt(i)); i++; }
	 * //st.remove(s.charAt(i));
	 * 
	 * 
	 * }
	 * 
	 * }
	 * 
	 * System.out.println(st.size()); }
	 * 
	 * public static String subString(String input){ HashSet<Character> set =
	 * new HashSet<Character>(); String longestOverAll = ""; String
	 * longestTillNow = "";
	 * 
	 * for (int i = 0; i < input.length(); i++) { char c = input.charAt(i);
	 * 
	 * if (set.contains(c)) { longestTillNow = ""; set.clear(); } longestTillNow
	 * += c; set.add(c); if (longestTillNow.length() > longestOverAll.length())
	 * { longestOverAll = longestTillNow; } }
	 * 
	 * return longestOverAll; }
	 */
	/*
	 * public static int lengthOfLongestSubstring(String s) { // if
	 * (s.length()==0) return 0; HashMap<Character, Integer> map = new
	 * HashMap<Character, Integer>(); int max=0; for (int i=0, j=0;
	 * i<s.length(); ++i) { if (map.containsKey(s.charAt(i))) { j =
	 * Math.max(j,map.get(s.charAt(i))+1); } else { map.put(s.charAt(i),i); max
	 * = Math.max(max,i-j+1); }} return max; }
	 */
	public static void lengthOfLongestSubstring3(String s) {
		int n = s.length();// abblmlini
		Set<Character> set = new LinkedHashSet<>();
		int ans = 0, i = 0, j = 0;
		while (j < n) {// abblmlini
			// try to extend the range [i, j]
			if (!set.contains(s.charAt(j))) {
				set.add(s.charAt(j));
				j++;
				ans = Math.max(ans, j - i);
			} else {
				set.remove(s.charAt(i));
				i++;
			}
		}
		System.out.println(ans);
		System.out.println(set.toString());
	}

	/*
	 * public static int lengthOfLongestSubstringByMap(String s) { // if
	 * (s.length()==0) return 0; HashMap<Character, Integer> map = new
	 * HashMap<Character, Integer>(); int max=0; for (int i=0, j=0;
	 * i<s.length(); ++i) { if (map.containsKey(s.charAt(i))) { j =
	 * Math.max(j,map.get(s.charAt(i))+1); } else//aaaaaaaaaaabblmlini {
	 * map.put(s.charAt(i),i); max = Math.max(max,i-j+1); }
	 * 
	 * } return max; }
	 */public static void main(String[] args) {

		String k = "hdkahcdlajdlaj";
		// lengthOfLongestSubstring5(k);
		// System.out.println(j);
		// System.out.println(st.toString());
		// String input = "substringfindout";
		// System.out.println(subString(k));

		// System.out.println(lengthOfLongestSubstringByMap(k));
		lengthOfLongestSubstring3(k);
		// System.out.println(lengthOfLongestSubstring3(k));
		getUniqueSubstr(k);

	}
}
