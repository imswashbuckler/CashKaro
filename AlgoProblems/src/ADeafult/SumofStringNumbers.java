package ADeafult;

public class SumofStringNumbers {

	public static void main(String[] args) {
		String str = "dda1aa23da4e60";
		String temp = "";
		int fin = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (Character.isDigit(c)) 
			{
				temp = temp + c;

			} 
			else {
				if (temp.length() > 0) 
				{
					int pa = Integer.parseInt(temp);
					fin = fin + pa;

				}
				temp = "";

			}
			if (i == str.length() - 1 && temp.length() > 0) {
				int pa = Integer.parseInt(temp);
				fin = fin + pa;

			}

		}
		System.out.println(fin);
	}
}
