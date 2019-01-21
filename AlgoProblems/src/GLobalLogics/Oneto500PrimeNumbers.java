package GLobalLogics;

import java.util.ArrayList;
import java.util.List;

public class Oneto500PrimeNumbers {

	public static List<Integer> primeNumberList(int k) {
		List<Integer> ls = new ArrayList<Integer>();
		ls.add(2);
		for (int i = 3; i < k; i++) {
			if (isPrime(i) == false) {
				ls.add(i);

			}
		}
		return ls;

	}

	public static boolean isPrime(int k) {
		boolean b = false;
		for (int i = 2; i <= k / 2; i++) {
			if (k % i == 0) {
				b = true;
			}

		}
		return b;

	}

	public static void main(String[] args) {

		List<Integer> l = primeNumberList(500);
		for (Integer k : l)
			System.out.println(k);

	}

}
