package AquestionAaamaaaaaazoooon;

public class consecutiVteDulicates_a2b3c4d1 {

	public static void findStringchrCount(String str) {
		int count = 0;
		int j = 0;
		String str1 = "";

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(j) == str.charAt(i)) {
				count++;
			} else {
				String k = String.valueOf(count);
				str1 = str1 + "" + str.charAt(j) + k;
				count = 0;
				j = i;
				i = i - 1;

			}

		}
		if (count > 0) {
			str1 = str1 + str.charAt(str.length() - 1) + count;
		}
		System.out.println(str1);
	}

	public static void main(String[] args) {
		findStringchrCount("adadadadadadaa");

	}
}
