package TestPack;

public class PatternMatch {
	
	static String str="abcdfgabcllabcdjkfababc";
	static	String patte="abc";

	static int count=0;
	public static void main(String[] args) 
	{
		
		for(int i=0;i<str.length()-2;i++)
		{
			String subs=str.substring(i, i+3);
			
			if(subs.equals(patte))
			{
				count=count+1;
				System.out.println("index= "+i);
			}
			
			
			
		}
		
		System.out.println(count);

	}
	

	
		
	
}