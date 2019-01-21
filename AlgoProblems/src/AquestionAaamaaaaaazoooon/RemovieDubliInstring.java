package AquestionAaamaaaaaazoooon;

public class RemovieDubliInstring {

	public static void RemString(String str)

	{
		String str1 = "";
		for (int i = 0; i < str.length()-1; i++) {
			if (str.charAt(i) != str.charAt(i + 1)) 
			{
				str1 = str1 + str.charAt(i);

			}

		}
		str1=str1+str.charAt(str.length()-1);
		System.out.println(str1);
	}

	public static void main(String[] args) {
		RemString("aaaaabbbbbccccddddeeee");

	}
}
