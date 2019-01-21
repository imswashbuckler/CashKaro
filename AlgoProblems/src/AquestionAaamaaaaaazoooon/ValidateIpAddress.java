package AquestionAaamaaaaaazoooon;

public class ValidateIpAddress {
    
    static boolean ischar(String s){
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>='a' && s.charAt(i)<='z') || s.charAt(i)>='A' && s.charAt(i)<='Z')
            return true;
        }
        return false;
    }
    
	public static boolean isValidIP(String s){
	   
	   String[] a=s.split("\\.");
	   
	   if(a.length!=4 || s.charAt(s.length()-1)=='.') 
		   {return false;}
	 
	   for(int i=0;i<a.length;i++){
	       
	       if(a[i]!= null && !a[i].isEmpty())
	       {
	       if((a[i].charAt(0)=='0' && a[i].length()>1) || ischar(a[i]))
	       {
	    	   return false;
	       }
	       int x=Integer.valueOf(a[i]);
	       if(x>=0 && x<=255) continue;
	       else return false;
	       }
	       else return false;
	       }
	   
	   return true;
	}
	public static void main(String[] args) {
			boolean k=isValidIP("1.1.1.1");
		System.out.println(k);
	}
}