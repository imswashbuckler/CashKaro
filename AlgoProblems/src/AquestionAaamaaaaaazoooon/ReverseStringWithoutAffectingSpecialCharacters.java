package AquestionAaamaaaaaazoooon;

public class ReverseStringWithoutAffectingSpecialCharacters {

	public static String ReversString(String str)
	{
		int i=0;
		int l=str.length()-1;
		
		char strA[]=str.toCharArray();
		while(i<l)
		{
			
			if(Character.isAlphabetic(strA[i])!=true)
			{
				i++;
				
			}
			
			else if(Character.isAlphabetic(strA[l])!=true)
			{
				l--;
				
			}
			else
			{
				char c=strA[i];
				strA[i] = strA[l];
				strA[l] = c;
				i++;
				l--;
				
				
			}
		}
	//	String str1=strA.toString();
		return 	String.valueOf(strA);
	}

	public static void main(String[] args) {
		
		String str2=ReversString("a@bcadd%%%%");
		System.out.println(str2);

	}

}
