package ADeafult;

public class RvrsStrngWidoutAffetcingSpclChars {

	public static String reverseString(String str) {
		int i = 0;
		int j = str.length() - 1;

		while (i < j) {

			char i1 = str.charAt(i);
			char j1 = str.charAt(j);

			if (Character.isAlphabetic(i1) && Character.isAlphabetic(i1)) {
				char temp = i1;
				i1 = j1;
				j1 = temp;
				i++;
				j--;

			}
			if (Character.isAlphabetic(i1) == true
					&& Character.isAlphabetic(i1) == false)

			{

				j--;

			}

			if (Character.isAlphabetic(i1) == false
					&& Character.isAlphabetic(i1) == true)

			{
				i++;

			}

			if (Character.isAlphabetic(i1) == false
					&& Character.isAlphabetic(i1) == false)

			{
				i++;
				j--;

			}

		}
		return str;

	}

	public static void main(String[] args) {
		
		System.out.println("Test");
		String str1=reverseString("q!kfo@uo");
		System.out.println(str1);
	}
	
}
