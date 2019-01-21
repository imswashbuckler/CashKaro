import java.io.PrintStream;


public class NumbertoStringArrayIndex {

	public static int reverseNumber(int k) {
		int rev = 0;
		while (k > 0) {
			int rem = k % 10;
			k = k / 10;

			rev = rev * 10 + rem;

		}
		return rev;

	}

	public static void IndexNo(int no, String[] str1) {
		String str = "";
		int s = no;
		int k = reverseNumber(no);
		int no1 = k;
		while (k > 0) {
			int i = k % 10;
			k = k / 10;
			if (!str.contains(str1[i])) {
				str = str + str1[i];

			}
		}
		while (no1 > 0) {
			int i = no1 % 100;

			String b = String.format("%02d", i);	
			StringBuilder input1 = new StringBuilder();
			input1.append(b);
			input1 = input1.reverse();
			String myString = input1.toString();
			int l = Integer.parseInt(myString);
			no1 = no1 / 100;
			if (!str.contains(str1[l])) {
				str = str + str1[l];

			}
		}

		System.out.println(str);
	}

	public static int revNumber(int n)
	{
		int rev=0;
		while(n>0)
		{
			int r=n%10;
			rev=rev*10+r;
			n=n/10;
	
		}
		return rev;
		
		
		
	}
	
	public static int revNumber1(int n)
	{
		int rev=0;
		while(n>0)
		{
			int r=n%10;
		
			rev=rev*10+r;
			n=n/10;
	
		}
		return rev;
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		 int k =revNumber(1000);
		String[] str = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K",
				"L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W",
				"X", "Y", "Z" };
		//IndexNo(123, str);
		
		//char str1[] ="hello";
		//char str1[] ="world";
		//str1=str2;
		System.out.println(k);
		
		
		
	}
}