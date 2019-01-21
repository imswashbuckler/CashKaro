package AquestionAaamaaaaaazoooon;

public class SumOfIntegrsInString {

	public static int SumOfIntinStrings(String str) {
		char charA[] = str.toCharArray();

		String dig = "";
		int res = 0;

		for (int i = 0; i < charA.length; i++) {

			if (Character.isDigit(charA[i])) 
			{
				dig = dig + charA[i];

			} else {
				if (dig.length() > 0) {
					int k = Integer.parseInt(dig);
					res = res + k;
					dig = "";
				}
			}
			if(dig.length()>0 && i==charA.length-1)
			{
				res=res+Integer.parseInt(dig);
			}
		}
		
		return res;

	}

	public static void main(String[] args) {

		int res = SumOfIntinStrings("71n2");
		System.out.println(res);
	       DateFormat df = new SimpleDateFormat("dd/MM/yyyy");


	}
}
