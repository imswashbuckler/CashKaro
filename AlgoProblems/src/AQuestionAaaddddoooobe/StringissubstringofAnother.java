package AQuestionAaaddddoooobe;

public class StringissubstringofAnother {

	public static int StringissubstringofAnotherF(String s1, String s2) {
		int l1 = s1.length();
		int l2 = s2.length();
		for (int i = 0; i < l2 - l1; i++) {
			// ram 3 sramniwas \

			for (int j = 0; j < l1; j++)
			{
				if (s2.charAt(i + j) != s1.charAt(j)) 
				{
					break;

				}
				if (j+1 == l1) {

					return i;
				}
				

			}
		
		}
		return -1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k=StringissubstringofAnotherF("abc", "defabce");
		System.out.println(k);

	}

}
