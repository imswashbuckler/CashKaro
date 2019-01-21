public class DuplicateChar {
	static final int NO_OF_CHARS = 256;
	static char count[] = new char[NO_OF_CHARS];

	static void getCharCountArray(String str) {
		
		for (int i = 0; i < str.length(); i++)
		{
			char c = str.charAt(i);
			count[c]++;
		}
	}
	static int firstNonRepeating(String str) {
		getCharCountArray(str);
		
		
		for (int p = 0; p < count.length; p++)
		{
			System.out.println(count[p]);
		}
	
		
		int index = -1, i;

		for (i = 0; i < str.length(); i++) {
			if (count[str.charAt(i)] == 1) {
				index = i;
				break;
			}
		}

		return index;
	}

	
	public static void getChar(String str)
	{
		char[] char1 = new char[256];
		for(int i=0;i<char1.length;i++)
		{
			char1[i]=0;
			
		}
		for(int i=0;i<str.length();i++)
		{
			char k=str.charAt(i);
			char1[k]++;
			
		}
	
		
		for(int i=0;i<char1.length;i++)
		{
			char k=str.charAt(i);
			if(char1[k]<2)
			{
				System.out.println(k);
				break;
			}
			
			
			
		}
		
		
		
		
	}
	
	
	public static void firstNonRep(String str)
	{
		char[] chaAr= new char[256];
		for(int i=0;i<chaAr.length;i++)
		{
			chaAr[i]=0;
			
		}
		
		for(int i=0;i<str.length();i++)
		{
			chaAr[str.charAt(i)]++;
			
		}
		
		for(int i=0;i<str.length();i++)
		{
			if(chaAr[str.charAt(i)]<2)
			{
			System.out.println(str.charAt(i));
			break;
			}
		
		
	}
	}
	public static void main(String[] args) {
		String str = "aaaadladsfsfa";
		firstNonRep(str);
		//getChar(str);
		/*int index = firstNonRepeating(str);
		System.out.println(str.charAt(index));

		for (int i = 0; i < count.length; i++) {
			System.out.println(i + " " + (int) count[i]);
		}

		// System.out.println((int)count['a']);
		System.out.println(str.charAt(index));
		
		 * System.out.println(index == -1 ?
		 * "Either all characters are repeating or string " + "is empty" :
		 * "First non-repeating character is " + str.charAt(index));
		 */
		 }
}
