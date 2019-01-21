package AProgramsPorblems;

import java.util.Arrays;

public class ___NoofBinaryTreeProgram {

	static int sum = 0;
	static int[] bin;
	public static int binarytree(int n) {
		int[] bin = new int[n + 1];
		bin[0] = 1;
		bin[1] = 1;

		for (int i = 2; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				bin[i] += bin[j] * bin[i - j - 1];
			}
		}
		return bin[n];
	}

	public static void main(String[] args) {

		System.out.println(binarytree(6));
		System.out.println(Arrays.toString(bin));
		
		String k="sakjkd";
		
		
	}
}
