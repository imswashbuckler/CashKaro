package HTTP;

import java.util.Arrays;
import java.util.Stack;

public class BracketsBalance {

	public static void ReverseString(String str) {
		// int j = str.length() - 1;
		System.out.println(str);
		int i = 0, j = str.length() - 1;
		;
		char[] ch = str.toCharArray();
		int k = ch.length;
		while (i < ch.length / 2 && j > ch.length / 2) {

			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
			i++;
			j--;

		}

		System.out.println(ch);
		System.out.println(Arrays.toString(ch));
	}

	public boolean bracketbalance(String s) {
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);

			if (c == '[' || c == '{' || c == '(') {
				stack.push(c);

			}

			else if (c == ']') {
				if (stack.empty() || stack.pop() != '[') {
					return false;

				}
			} 
			else if (c == '}') {
				if (stack.empty() || stack.pop() != '{') {
					return false;

				}
			} else if (c == ')') {
				if (stack.empty() || stack.pop() != '(') {
					return false;

				}

			}
		}
		return stack.empty();
	}

	public static void main(String[] args) {
		BracketsBalance b = new BracketsBalance();
		boolean c = b.bracketbalance("()");
		System.out.println(c);
		String input = "Android gave new life to Java";
		boolean isFound = input.indexOf("z") != -1 ? true : false; // true
		System.out.println(isFound);
		ReverseString("abcdd");

	}

}
