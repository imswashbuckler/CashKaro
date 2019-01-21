package AProgramsPorblems;

public class AnagramsAll {

	static int count=1;
	public static void permutate(String str, int i, int l) {
		//count++;

		if (i == l) {
			 System.out.println(str);
		}

		else {
			for (int k = i; k <= l; k++) {
				
				str = switchD(str, i, k);
				permutate(str, i + 1, l);
				switchD(str, i, k);

			}
		}

	}

	public static String switchD(String str, int x, int y) {
		char[] st = str.toCharArray();
		char temp = st[x];
		st[x] = st[y];
		st[y] = temp;
		return String.valueOf(st);

	}

	public static void main(String[] args) {
		String str = "ABCDEFG";
	
		int k = 0;
		int n = str.length() - 1;
		 permutate( str, k, n);
	}
}