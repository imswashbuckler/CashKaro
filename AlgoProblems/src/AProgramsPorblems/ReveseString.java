package AProgramsPorblems;

public class ReveseString {

	String rev = "";

	public static void Strinstr(String str)
	{
				char[] chartemp=str.toCharArray();
			for(int i=0;i<chartemp.length;i++)
			{
			for(int j=i+1;j<chartemp.length;j++)
			{
			
			if(chartemp[i]==chartemp[j])
			{
			
			}
			
			else
			{
			
			System.out.println(chartemp[i]);
			}
			}
			}}

	public void reversString1(String str) {
		char[] temparray = str.toCharArray();
		int left = 0, right = 0;
		right = temparray.length - 1;
		/*
		 * for (left=0; left < right ; left++ ,right--) {
		 */while (left < right) {
			// Swap values of left and right
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

	public void ReveseStringMe2(String Word)

	{
		char[] ch = Word.toCharArray();
		int low = 0;
		int high = ch.length - 1;
		while (low < high) {
			char temp = ch[low];
			ch[low] = ch[high];
			ch[high] = temp;
			low++;
			high--;

		}

		for (char c : ch)
			System.out.print(c);
		System.out.println();

	}

	public static void main(String[] args) {
		ReveseString rev = new ReveseString();
		// rev.ReveseStringMe("RAMNIWSahu");
		// rev.ReveseStringMe1("RAMNIW Sahu");

		String str = "Be in present";

		// rev.ReveseStringMe2("RamSahu");

		rev.reversString1(str);
		
		Strinstr("Hellp");
	}

}
