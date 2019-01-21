package comperator;

public class FirstDulicateChar {
	
	public static void DupliChar(String str)
	{
		int[] cArr = new int[256];
		for(int i=0;i<cArr.length;i++)
		{
			
			cArr[i]=0;;
			
		}
	
		
	//	int count=0;
		for(int i=0;i<str.length();i++)
		{
			
			cArr[str.charAt(i)]++;
			
		}
		
		for(int i=0;i<str.length();i++)
		{
			
			if(cArr[str.charAt(i)]>1)
			{
				System.out.println(str.charAt(i));
				break;
			}
			
		}
		
		
		
	}

	public static void main(String[] args) 
	{
		
		DupliChar("Ramniwas");
		
		
	}
}
