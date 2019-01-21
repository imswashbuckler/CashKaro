package IMPProgrmas;

public class ReveseString {

	String rev = "";

	public void reversString1(String str) {
		char[] temparray = str.toCharArray();
		int left = 0, right = 0;
		right = temparray.length - 1;
		while (left < right) {
			char temp = temparray[left];
			temparray[left] = temparray[right];
			temparray[right] = temp;
			left++;
			right--;
		}
		str = String.valueOf(temparray);

		System.out.println(str);
		for (char c : temparray)
			System.out.print(c);
		System.out.println();
	}

	public void ReveseStringMe(String Word)

	{
		char[] ch = Word.toCharArray();

		for (int i = ch.length - 1; i >= 0; i--) {
			rev = rev + ch[i];

		}
		System.out.println(rev);
	}

	public void ReveseStringMe1(String Word)

	{
		String S = "";
		for (int i = Word.length() - 1; i >= 0; i--)

		{
			S = S + Word.charAt(i);

		}

		System.out.println(S);

	}

	public static void main(String[] args) {
		ReveseString rev = new ReveseString();
		// rev.ReveseStringMe("RAMNIWSahu");
		// rev.ReveseStringMe1("RAMNIW Sahu");

		String str = "Be in present";

		// rev.ReveseStringMe2("RamSahu");

		rev.reversString1(str);
	}

}
