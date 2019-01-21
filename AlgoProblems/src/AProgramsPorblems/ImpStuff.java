package AProgramsPorblems;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import org.apache.http.util.Args;

public class ImpStuff 
{
	
public static void main(String args[]) throws IOException {
	/*
	Set<String> st = new HashSet<String>();
	st.add("A");
	st.add("");
	st.add(null);
	System.out.println(st);
	
	Map<Integer,Integer> map1 = new LinkedHashMap<Integer, Integer>();
	map1.put(1,2);
	map1.put(5,4);
	map1.put(3,2);
	map1.put(1,5);
System.out.println(map1);
	
	int c= 4 & 2;
	int x=args.length;
	
//	FileInputStream fin=new FileInputStream(new File("D:/AAA.txt"));  
	FileInputStream fin=new FileInputStream("D:/AAA.txt");  
    
int i1;
    StringBuffer strContent = new StringBuffer("");

	while( (i1 = fin.read()) != -1)
	{
		System.out.print((char)i1);
       //   strContent.append((char)i1);	
}
	


	
	FileReader fr=new FileReader("D:/AAA.txt");  
		  int i;
		  while((i=fr.read())!=-1)  
		  {
		  System.out.print((char)i);  
		 // i=fr.read();
		    
		 }
		  
		//  File fl = new File("D:/AAA.txt"); 
		  FileReader fr2=new FileReader("D:/AAA.txt");  
			BufferedReader fr1=new  BufferedReader(fr2);  
			
				  String br=fr1.readLine();
				  while(br!=null)  
				  {
				  System.out.print(br);  
				 // i=fr.read();
				br=fr1.readLine();
				System.out.println();
				 }
			fr1.close();

*/
	

	
	
	/*StringBuffer y1= new StringBuffer("Test");
	StringBuffer z1= new StringBuffer("Test");
		
	System.out.println("buff: "+y1.equals(z1));
	System.out.println("Len: "+ x);
	
	for(int y=0;y<x;y++)
	{
		System.out.println(args[y]);
		
	}
	
		
	{
		System.out.println(c);
		
	}
	
	int a,j;
	a=5;
	j=5;
		
	{
		System.out.println((a==5)&&(++j==6));
		System.out.println(a);
		System.out.println(j);
		
	}

	
*/	
	int[] k={1,2,3,45,56,67,7,4};
    ArrayList<String> names = new ArrayList<String>();
    names.add("Chaitanya");
    names.add("Steve");
    names.add("Jack");
 
    double z =5;
    int d=(int)z;
    

	Iterator<String> it = names.iterator();
	while(it.hasNext())
	{
		String k1 =it.next();
		
		if(k1=="Chaitanya")
		{
			it.remove();
		}
		System.out.println(k1);
		
		
	}
	

		}
		}
	




