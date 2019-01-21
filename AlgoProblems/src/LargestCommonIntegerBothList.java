import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LargestCommonIntegerBothList {

	public static void getMaxCommon(Integer[] a, Integer[] b) {

		Arrays.sort(a);
		Arrays.sort(b);
		for (int i = a.length - 1; i >= 0; i--) {
			int no = a[i];
			// System.out.println(Arrays.asList(b).contains(no));
			if (Arrays.asList(b).contains(no) == true) {
				System.out.println(no);
				break;
			}
		}

	}

	public static int biggestCommonInteger(List<Integer> a, List<Integer> b) {
		Set<Integer> set = new HashSet<Integer>();
		int biggestNum = Integer.MIN_VALUE;

		for (Integer i : a) {
			set.add(i);
		}
		for (Integer j : b) {
			if (set.contains(j)) {
				if (j > biggestNum) {
					biggestNum = j;
				}
			}
		}
		return biggestNum;
	}

	public static void biggestCommonInteger1(int[] a, int[] b) {

		Set<Integer> st1 = new TreeSet<Integer>();
		Set<Integer> st2 = new TreeSet<Integer>();
		int x = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			st1.add(a[i]);
		}

		for (int i = 0; i < b.length; i++) {
			st2.add(b[i]);
		}

		for (int b1 : st1) {
			if (st2.contains(b1) == true) {
				// System.out.println(b1);

				if (x < b1) {
					x = b1;

				}

			}
		}
		System.out.println(x);
	}

	public static void biggestCommonInteger2(List<Integer> a, List<Integer> b) {
		int k = Integer.MIN_VALUE;
		boolean bo = false;
		for (int i = 0; i < b.size(); i++) {
			int p = b.get(i);
			if (a.contains(p)) {
				if (p >= k) {
					k = p;
					bo = true;	}
			}

		}

		if (bo == true) {
			System.out.println(k);
		} else {
			System.out.println("No common Integers");
		}
	}

	public static void main(String[] args) {

		Integer[] k = { -2, -331, -2, 13, -14, -5, -6, 0 };
		Integer[] l = { -19, 113, -331, -16, -15, -36, 10 };
		/*
		 * getMaxCommon(k, l); // System.out.println(Arrays.toString(k));
		 * 
		 * List<Integer> ls1 = new ArrayList<Integer>(Arrays.asList(k));
		 * List<Integer> ls2 = new ArrayList<Integer>(Arrays.asList(l));
		 * 
		 * int m = biggestCommonInteger(ls1, ls2); System.out.println(m);
		 */
		// biggestCommonInteger1(k, l);
		List<Integer> ls1 = new ArrayList<Integer>(Arrays.asList(k));
		List<Integer> ls2 = new ArrayList<Integer>(Arrays.asList(l));
		biggestCommonInteger2(ls1, ls2);

	}

}
