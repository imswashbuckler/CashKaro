package AQuestionAaaddddoooobe;

public class sumOfNumbersnString {

	public static void getSum(String str) {
		char[] charA = str.toCharArray();
		int result = 0;
		String temp = "";
		for (int i = 0; i < charA.length; i++) {
			char c = charA[i];

			if (Character.isDigit(c)) {
				temp = temp + c;

			} else if (temp != "") {
				int tempInt = Integer.parseInt(temp);
				result = result + tempInt;
				temp = "";
			}

			if (i == str.length() - 1 && temp != "") {
				int tempInt = Integer.parseInt(temp);
				result = result + tempInt;

			}

		}
		System.out.println(result);

	}

	public static void main(String[] args) {
		getSum("m23k4dks40");
		// System.out.println(k);
	}
}
