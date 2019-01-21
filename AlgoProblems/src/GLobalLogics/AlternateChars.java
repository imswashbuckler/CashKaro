package GLobalLogics;

public class AlternateChars {
	
public static String PrintAlternateChars(String a,String b)
{
	String result="";
for(int i=0;i<a.length();i++)
{
	result=result+a.charAt(i);
	result=result+b.charAt(i);
	
	
}
return result;
}
public static void main(String[] args) {
	
	String res=PrintAlternateChars("abcd","efh");
	System.out.println(res);
	
}
}