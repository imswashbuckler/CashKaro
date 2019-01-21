package AquestionAaamaaaaaazoooon;

import java.util.Arrays;
import java.util.HashMap;

public class AnaGram {

	static boolean areAnagram(String str1, String str2) {
		
		int n1 = str1.length();
		int n2 = str2.length();
		if (n1 != n2)
			return false;
		
		char[] strA1=str1.toCharArray();
		char[] strA2=str2.toCharArray();
		Arrays.sort(strA1);
		Arrays.sort(strA2);

		for (int i = 0; i < n1; i++)
		{
			if (strA1[i] != strA2[i])
			{
				return false;
			}
	
	}
		return true;
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
		
		boolean b=areAnagram("abcd","cbad");
		boolean b1=isAnagram("abcd","cbad");
		System.out.println(b);
		System.out.println(b1);
		

	}

}
