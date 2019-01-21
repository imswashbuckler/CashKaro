package SortingandMerging;

import java.util.Arrays;

public class SortCharArrayInJava {
	public static void main(String[] args) {
		String input="5hello";
		char[] charArray = input.toCharArray();
		int length = charArray.length;

		for(int i=0;i<length;i++){
		   for(int j=i+1;j<length;j++){
		      if (charArray[j] < charArray[i]) {
		          char temp = charArray[i];
		          charArray[i]=charArray[j];
		          charArray[j]=temp;
		      }
		   }
		}
		System.out.println(Arrays.toString(charArray));
	}

}
