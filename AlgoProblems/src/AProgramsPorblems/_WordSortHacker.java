package AProgramsPorblems;

import java.util.Scanner;

public class _WordSortHacker {

	public static void main(String[] args) {
    	String input="RRRAM RRRAAGD RRAAM RAM RPRDF RRMNB";
	    System.out.println("INPUT:"+input.length());
         String[] str=input.split(" ");
        int numberOfWords=str.length;
        System.out.println(numberOfWords);
        
        for (int i = 0; i < str.length - 1; i++) {
            for (int j = i+1; j < str.length -1; j++) {
                if (str[i].compareTo(str[j])> 0) {
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        
        
        // Print words
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + " ");
        }
    }
}


