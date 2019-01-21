package ADeafult;

public class FirstDuplicateChar {

	public static void fDuplicateChar(String str) {
		char[] c = new char[256];
		for (int i = 0; i < c.length; i++) {
			c[i] = 0;
		}
		char[] chr = str.toCharArray();

		for (int i = 0; i < chr.length; i++) {
			c[chr[i]]++;

		}
		
		for (int i = 0; i < chr.length; i++)
		{
			if(	c[chr[i]]>1)
			{
			System.out.println(chr[i]);	
			break;
			}

		
		}
	}

	public static void main(String[] args) {
		fDuplicateChar("ghjkjoiuye");
	
	
	}

}
