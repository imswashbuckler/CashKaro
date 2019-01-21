package AProgramsPorblems;

public class StringReverseByRecusrsion {

	public static void main(String[] args) {
		String str = "MEGHA";
		int i = 0;
		int j = str.length() - 1;
		String k = reverseString(str, i, j);
		System.out.println(k);

	}

	public static String reverseString(String str1, int i, int j) {
		if (i > j) {
			return str1;

		}
		str1 = Swap(str1, i, j);
		str1 = reverseString(str1, i + 1, j - 1);

		return str1;

	}

	public static String Swap(String str, int l, int k) {
		char[] st = str.toCharArray();
		char temp = st[l];
		st[l] = st[k];
		st[k] = temp;

		return String.valueOf(st);

	}

}
