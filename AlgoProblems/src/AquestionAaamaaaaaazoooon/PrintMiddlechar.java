package AquestionAaamaaaaaazoooon;

public class PrintMiddlechar {
	
	
	public static void printMiddle(String str)
	{
		if(str.length()%2==0)
		{
			int l=str.length();
			System.out.print(str.charAt((l-1)/2));
			System.out.print(str.charAt(l/2));
			
		}
		else
		{
			System.out.println(str.charAt(str.length()/2));
			
		}
		
	}
	public static void main(String[] args) {
		
		printMiddle("Amazon");
	}

}
