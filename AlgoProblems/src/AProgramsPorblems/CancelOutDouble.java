/*
 * package ProgramsPorblems; public class CancelOutDouble { public static void
 * main(String[] args) { String s ="aaabbbeebbb"; String result = s;
 * while(hasRepeated(result)) { result = cancelDouble(result);
 * System.out.println(result); }
 * 
 * 
 * }
 * 
 * private static String cancelDouble(String s) { StringBuilder sb = new
 * StringBuilder(); if(s == null || s.isEmpty()) return s;
 * 
 * int i = 0; while(i < s.length()) { if((i+1) < s.length() && s.charAt(i) ==
 * s.charAt(i+1)) { i = i+2; } else { sb.append(s.charAt(i)); i++; }
 * 
 * } return sb.toString(); }
 * 
 * private static boolean hasRepeated(String s) { if(s.length()==1) return
 * false; int i = 0; while(i < s.length()) { if((i+1) < s.length() &&
 * s.charAt(i) == s.charAt(i+1)) return true; i++; } return false; } }
 */

package AProgramsPorblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.sun.xml.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class CancelOutDouble {
	
	public void method1(String str)
	
	{
		//String str = "aaabbacccddcaabbbaaa";//aacdcb,cdcb
		char[] ch = str.toCharArray();
		int count = 1;
		String result="";
		for (int i = 1; i < ch.length; i++)

		{
		
			if(ch[i-1]== ch[i])
			{
				ch[i-1]=' ';
				ch[i]=' ';
			}


		}
        char [] copy = new char[ch.length];
        int counter = 0;

		 for (char c : ch)
	        {
	            if(c != ' ')
	            {
	                copy[counter] = c;
	                counter++;
	            }
	        }
		 System.out.println(Arrays.toString(copy));
	        System.out.println(new String(ch));

	        char[] result1 = Arrays.copyOf(copy, counter);
	        System.out.println(new String(result1));
	}

		
		
	
	public static void main(String[] args) {
		
		CancelOutDouble obj = new CancelOutDouble();
		obj.method1("aaacccbbcbaaaa");
		
					}
		}

	





















