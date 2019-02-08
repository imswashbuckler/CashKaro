package concepts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import jdk.nashorn.internal.ir.ForNode;

public class ExceptionWIthoutANybody {
	

	public static void main(String[] args) {
		 try
		 {
			/* 	File fl =new File("C://Ram.txt");
			 	FileInputStream fp=new FileInputStream(fl);
			 	
			 	int k=10;
			 	Integer a=k;// Autoboxing
			 	
			 	Integer o=new Integer(10);
			 	int l=o.intValue();
			 	int m=o;// unboxing line only
		*/	 	
			 String str1=null;
			 String str2=null;
		String str=str1 + str1;
		 System.out.println(str);
		 }
		 
		 catch(NullPointerException Fn)
		 {
			 System.out.println("ad");
			 
		 }
		
		
	/*	 catch(SQLException Fn)
		 {
			 System.out.println("ad");
			 
		 }*/
		 catch(Exception Fn)
		 {
			 System.out.println("ad");
			 
		 }
		
		
	}

}




