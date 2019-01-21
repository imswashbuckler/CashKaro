package Palindrome;

import org.eclipse.jdt.internal.compiler.parser.Scanner;

public class PalindromeInteger {

	int sum = 0;

	public void checkPalindromebychangingIntToStr(int x) {

		Scanner scn = new Scanner();
		String b = Integer.toString(x);
		String s = "";
		char[] c = b.toCharArray();
		for (int i = b.length() - 1; i >= 0; i--) {
			s = s + b.charAt(i);

		}
		if (s.equals(b)) {
			System.out.println("palindrome");

		} else {
			System.out.println("Not a palindrome");
		}

	}

	// 676
	public void checkPalindrome(int m) {
		int n = m;
		while (n > 0) {
			int remainder = n % 10;
			// int sum=0;;
			sum = sum * 10 + remainder;
			n = n / 10;

		}

		System.out.println(sum);

		if (sum == m) {
			System.out.println("palindrme");

		}

		else {
			System.out.println("not a palindrme");

		}

	}

	public static void main(String[] args) {
		PalindromeInteger pr = new PalindromeInteger();
		pr.checkPalindrome(190091);

	}
}
