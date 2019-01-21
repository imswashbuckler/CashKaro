package HTTP;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	static int d1;

	static int degreeOfArray(int[] arr) {
		int p = 0;
		// int[] arr = { 1, 1, 2, 1, 2, 2 };

		d1 = arraycontain(arr, 0, arr.length - 1);
		boolean t = false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {

				int dsub = arraycontain(arr, i, j);
				if (d1 == dsub) {
					t = true;
					p = j - i;
					break;
				}

			}
			if (t = true) {
				break;
			}
		}
		return p;
	}

	public static int arraycontain(int[] arr, int k, int length) {
		Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
		int count1 = 1;
		k = 0;
		int degree = 0;
		for (int i = k; i < length; i++) {
			if (map1.containsKey(arr[i])) {
				map1.put(arr[i], map1.get(arr[i]) + 1);

			}

			else {

				map1.put(arr[i], count1);

			}

		}

		for (int m : map1.keySet())

		{
			if (map1.get(m) > degree)

			{
				degree = map1.get(m);

			}

		}

		return degree;

	}

	public static void main(String[] args) throws IOException {

		// int[] arr = { 1, 1, 2, 1, 2, 2 };
		int[] arr = { 1, 2, 2, 3, 1 };
		Solution s = new Solution();
		int p = s.degreeOfArray(arr);
		System.out.println(p);

	}
}
