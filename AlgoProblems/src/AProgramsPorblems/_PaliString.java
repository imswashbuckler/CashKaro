package AProgramsPorblems;

import java.util.Arrays;

import concepts.Substrings;

public class _PaliString {
	 public static void dispay2darray1(boolean[][] arr)
	 {
		 int r=arr.length-1;
		 int c=arr[0].length-1;
		 		for (int i = 0; i <= r; i++)
			{	for (int j = 0; j <= c; j++) {
				//System.out.print(arr[i][j] + " ");
				}
				System.out.println();}
	 }

	public static void main(String[] args) {
		String str = "abcacba";
		int length = str.length();
		char[] chars = new char[length];
		String pali = "";
		int palindromeength = 0;

		boolean[][] strtable = new boolean[length][length];
		for (int i = 0; i < length; i++) 
		{
			for (int j =0; j < length; j++)

			{
				strtable[i][j] = false;

			}

		}
		dispay2darray1(strtable);
		//System.out.println(strtable);

		int j;
		for (int k = 2; k < length; k++) {
			for (int i = 0; i < length-k; i++)

			{
				j = i + k;

				if (str.charAt(k) == str.charAt(j)	&& strtable[i + 1][j - 1] == true) {
					if (str.substring(i, j).length() > palindromeength) 
					{

						pali = str.substring(i, j);
						palindromeength = pali.length();
					}
					
					strtable[i][j]=true;

				}
			}

		}
		System.out.println(pali);

	}

	
}