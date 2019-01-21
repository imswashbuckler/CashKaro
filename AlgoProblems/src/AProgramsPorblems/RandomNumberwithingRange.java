package AProgramsPorblems;

import java.util.Random;

public class RandomNumberwithingRange {
	public static void main(String[] args) {
		int maximum=10;
		int minimum=5;
		Random rn = new Random();
		int range = maximum - minimum + 1;
		int n =  rn.nextInt(range) + minimum;

		System.out.println(n);

	}

}
