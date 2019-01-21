package AProgramsPorblems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class AllAnagram {
	static int  count=0;

	/*
	 * public static char[] charArray;
	 * 
	 * public A_AllAnagram2(String word) { charArray = word.toCharArray();
	 * doAnagram(charArray.length); }
	 * 
	 * public void changeOrder(int newsize) { int j; int pointAt =
	 * charArray.length - newsize; char temp = charArray[pointAt];
	 * 
	 * for (j = pointAt + 1; j < charArray.length; j++) { charArray[j - 1] =
	 * charArray[j]; }
	 * 
	 * charArray[j - 1] = temp;
	 * 
	 * }
	 * 
	 * public void doAnagram(int newsize) { if (newsize == 1) { return; } for
	 * (int i = 0; i < newsize; i++) { doAnagram(newsize - 1); if (newsize == 2)
	 * { display(); } changeOrder(newsize); } }
	 * 
	 * public void display() { for (int i = 0; i < charArray.length; i++) {
	 * System.out.print(charArray[i]); } System.out.println(); }
	 * 
	 * public static void main(String args[]) {
	 * 
	 * A_AllAnagram2 test1 = new A_AllAnagram2("Love");
	 * 
	 * 
	 * 
	 * }
	 */
	/*
	 * String str = "ABC"; public void printpemu(char[] inputs, int currfocus) {
	 * if (currfocus == inputs.length - 1) { System.out.println(inputs); return;
	 * } printpemu(inputs, currfocus + 1); for (int i = currfocus + 1; i <
	 * inputs.length; i++) { char temp = inputs[currfocus]; inputs[currfocus] =
	 * inputs[i]; inputs[i] = temp; printpemu(inputs, currfocus + 1); } } public
	 * static void main(String[] args) { String str = "SAHU"; int currentfocus =
	 * 0; A_AllAnagram2 am = new A_AllAnagram2();
	 * am.printpemu(str.toCharArray(), currentfocus); }
	 */
	/*
	 * public static void main(String[] args) {
	 * 
	 * String word = "java"; if (word.length() < 1) { return; }
	 * 
	 * // String word=args[0]; ArrayList<Integer> indices = new
	 * ArrayList<Integer>(); ArrayList<String> permutations =
	 * A_AllAnagram2.getPermu(word, indices);
	 * 
	 * System.out.println(permutations.size()); Set<String> st = new
	 * HashSet<String>(permutations); System.out.println(st.size()); for (String
	 * str1 : st) { System.out.println(str1);
	 * 
	 * } return;
	 * 
	 * }
	 * 
	 * public static ArrayList<String> getPermu(String word, ArrayList<Integer>
	 * indices) { int length = word.length(); ArrayList<String> toreturn = new
	 * ArrayList<String>(); if (indices.size() == length) { toreturn.add("");
	 * return toreturn; }
	 * 
	 * for (int i = 0; i < length; i++)
	 * 
	 * { if (indices.contains(i)) {
	 * 
	 * continue; }
	 * 
	 * ArrayList<Integer> newindices = new ArrayList<Integer>();
	 * 
	 * for (int index : indices) { newindices.add(index); }
	 * 
	 * newindices.add(i); ArrayList<String> permutation =
	 * A_AllAnagram2.getPermu(word, newindices); for (String str : permutation)
	 * {
	 * 
	 * toreturn.add(word.charAt(i) + str); }
	 * 
	 * } return toreturn; }
	 */
	/*
	 * public static void permutation4(String s) { perm1("", s); } private static void
	 * perm1(String prefix, String s) { int n = s.length(); if (n == 0) {
	 * System.out.println("PRE:"+prefix); } else { for (int i = 0; i < n; i++) {
	 * perm1(prefix + s.charAt(i), s.substring(0, i) + s.substring(i+1, n)); } }
	 * 
	 * }
	 * 
	 * public static void perm2(String s) { int n = s.length(); char[] a = new
	 * char[n]; for (int i = 0; i < n; i++) a[i] = s.charAt(i); perm2(a, n); }
	 * 
	 * private static void perm2(char[] a, int n) { if (n == 1) { //
	 * System.out.println(a); return; } for (int i = 0; i < n; i++) { swap(a, i,
	 * n-1); perm2(a, n-1); swap(a, i, n-1); } } private static void swap(char[]
	 * a, int i, int j) { char c = a[i]; a[i] = a[j]; a[j] = c; }
	 * 
	 * public static void main(String[] args) { // int n =
	 * Integer.parseInt(args[0]); String alphabet = "abcdefg"; int n
	 * =alphabet.length(); perm1(alphabet); System.out.println();
	 * perm2(alphabet); }
	 */

	public static Set<String> permutation3(String str) {
		Set<String> perm = new HashSet<String>();
		if (str == null) {
			return null;
		} else if (str.length() == 0) {
			perm.add("");
			return perm;
		}
		char initial = str.charAt(0); // first character
		String rem = str.substring(1); // Full string without first character
		Set<String> words = permutation3(rem);
		for (String strNew : words) {
			System.out.println(words.size());
			for (int i = 0; i <= strNew.length(); i++) {
				perm.add(charInsert(strNew, initial, i));

			}
		}
		return perm;
	}

	public static String charInsert(String str, char c, int j) {
		String begin = str.substring(0, j);
		String end = str.substring(j);
		return begin + c + end;
	}

	// Java program to print all permutations of a
	// given string.

	/*
	 * public void permute2(String str1,int k,int n ) { if(k==n) {
	 * System.out.println(str1);
	 * 
	 * } else {
	 * 
	 * char[] str=str1.toCharArray();
	 * 
	 * for (int i=k;i<str.length;i++) { char temp=str[k]; str[k]=str[i];
	 * str[i]=temp; permute2(str1,k+1,n); char temp1=str[k]; str[k]=str[i];
	 * str[i]=temp;
	 * 
	 * 
	 * 
	 * 
	 * 
	 * }
	 * 
	 * }
	 */

		
	private static void permutation2(String perm, String word) {
		

		if (word.isEmpty()) {
			System.err.println(perm + word);
		} else {
			for (int i = 0; i < word.length(); i++) 
			{
				//System.out.println(word.substring(0, i));
				System.out.println(perm+word.charAt(i)+" "+word.substring(0, i)+ word.substring(i + 1, word.length()));
				permutation2(perm + word.charAt(i),word.substring(0, i)+ word.substring(i + 1, word.length()));
			}
		}
	}
	
	private void permute1(String str, int i, int l) {
		if (i == l) {
			System.out.println(str);
		} else {
			for (int j = i; j <= l; j++) {
				System.out.println("Before A swap  "+i+" "+j+"  "+str );
				
				str = swap(str, i, j);
				
				permute1(str, i + 1, l);	
				
				System.out.println("After Permu:"+i+" "+j);
				
				str = swap(str, i, j);
				
				System.out.println("after S swap  "+i+" "+j+"  "+str);
			}
		}
	}

	public String swap(String a, int i, int j) {
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		// System.out.println("SWAP:"+String.valueOf(charArray));
		return String.valueOf(charArray);
	}
	
	public void myPermu(String str, int i,int l)
	{
		if(i==l)
		{
			System.out.println(str);
			
		}
		else
		{
			for(int j=i;j<=l;j++)
			{
				str=swapStringChar(str, i, j);//13
				myPermu(str, i+1, l);//2,4
				str=swapStringChar(str, i, j);
				
			}
			
		}
		
		
		
	}
	
	public String swapStringChar(String str,int i,int j)
	{
		char[] chars = str.toCharArray();
		char temp=chars[i];
		chars[i]=chars[j];
		chars[j]=temp;
		
		return String.valueOf(chars);
		
		
	}

	
	public static void main(String[] args) {

		AllAnagram obj = new AllAnagram();
		String s = "ABC";
		/*
		 * System.out.println("\nPermutations for " + s + " are: \n" +
		 * permutationFinder(s));
		 */String str = "ABC";
		int n = str.length();
		// obj.permute(str, 0, n-1);
		 obj.permute1(str, 0, n-1);
		//obj.permutation("", "ABC");
		// obj.myPermu(str, 0, n-1);
		 
		
	}
}
