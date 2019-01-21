import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static int n;

/*	public static void removeDuplciates(char[] arr) {
		n = arr.length;
		for (int i = 0; i < n; i++) {
			// char[] c={'a','a','b','f','b','r','d','k','k','l'};
			// char[] c={'a','a','b','l','b'};
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					char temp = arr[j];
					arr[j] = arr[n - 1];
					arr[n - 1] = temp;
					n--;

				}

			}

		}

	}

	public static void removeDuplciates1(char[] arr) {
		n = arr.length;
		int i = 0;
		int j = arr.length - 1;

		Set<Character> st = new LinkedHashSet<Character>();

		String str = "";
		for (char c : arr) {
			st.add(c);

		}
		System.out.println(st.toString());
		for (char c : st) {
			str = str + c;

		}
		System.out.println(str);

	}

	public static String removeDuplicatesFromString(String input) {
		boolean[] ASCII = new boolean[256];
		char[] characters = input.toCharArray();
		System.out.println(input.charAt(0));
		ASCII[input.charAt(0)] = true;

		int j = 1;
		for (int i = 1; i < input.length(); i++) {
			if (!ASCII[input.charAt(i)]) {
				characters[j] = characters[i];
				++j;
				ASCII[characters[i]] = true;
			} else {
				characters[j] = 0;
				++j;
			}
		}
		return toUniqueString(characters);
	}

	public static String toUniqueString(char[] letters) {
		StringBuilder sb = new StringBuilder(letters.length);
		for (char c : letters) {
			if (c != 0) {
				sb.append(c);
			}
		}
		return sb.toString();
	}
*/
	static void removeDuplicates(char[] arrd) {

		int leng = arrd.length;
		System.out.println(Arrays.toString(arrd));

		for (int i = 0; i < leng; i++) {
			for (int j = i + 1; j < leng; j++) {
				if (arrd[i] == arrd[j]) {
					arrd[j] = arrd[leng - 1];
					leng--;
					j--;
				}
			}
		}

		for (int i = 0; i < leng; i++) {
			System.out.print(arrd[i] + "\t");
		}

	}


	public static void main(String[] args) {
		// char[] c={'a','a','b','l','b'};
		char[] c = { 'a', 'a', 'b', 'f', 'b', 'r', 'd', 'k', 'k', 'l' };

		// removeDuplciates(c);

		for (int i = 0; i < n; i++) {
			// System.out.print(c[i]);
		}

		// removeDuplciates1(c);
		// String k= removeDuplicatesFromString("aabfbrdkklmnh");
		// System.out.println(k);
/*
		removeDuplciates(c);
		String b = new String(c);
		System.out.println(b);
		String k = "";

		for (int i = 0; i < n; i++) {
			k = k + c[i];
		}
		System.out.println(k);
*/		removeDuplicates(c);

	}

}
