package ADeafult;

public class BinaryToDecimal {
	
	static double k=0;
	public static void BinToDecimalCOn(String str)//111101
	{
		for(int i=str.length()-1;i>=0;i--)
		{
			char c=str.charAt(i);
			int l=Character.getNumericValue(c);
			double num=Math.pow(2, str.length()-i-1);
			 k=k+l*num;
			}
		System.out.println(k);
		}
	
	public static void main(String[] args) {
		BinToDecimalCOn("11101");
		
	}

}
