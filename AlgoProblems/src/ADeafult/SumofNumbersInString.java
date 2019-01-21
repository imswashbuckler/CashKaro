package ADeafult;

public class SumofNumbersInString {

	public static boolean checkDigit(char c) {
		boolean b = false;
		int asciCheck = (int) c;

		if (asciCheck > 47 & asciCheck < 58) {
			b = true;
		}
		return b;
	}

	/*public static void main(String[] args)
	{  
		String chStr = "";
		int sum = 0;
		String s = "l566t5a";
		int c = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (checkDigit(ch) == true) {
				chStr = chStr + ch;

			} else
			{
				if (chStr != "") 
				{
					int k = Integer.parseInt(chStr);
					sum = sum + k;
					chStr = "";
				}
			}
		}
		System.out.println(sum);
	}
*/
	
	public static void main(String[] args) {
		
		String str="a727492";
		String num="";
		int sum=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				num=num+str.charAt(i);
				
			}
			else
			{
				if(!num.equals(""))
				{
					sum=sum+Integer.parseInt(num);
					num="";
				}
				
			}
			
			
			
		}
		
		System.out.println(sum);
		
	}
}
