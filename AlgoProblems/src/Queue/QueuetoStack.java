package Queue;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.testng.annotations.Test;

public class QueuetoStack extends tes {
	

	public void test(double i)
	{
		double  k=i+1;
		System.out.println(k);
	}
	public static void main(String[] args) throws IOException {
		
		String s1=new String("hello");  
		String s2="hello";  
		String s3=s1.intern();//
		System.out.println(s2==s3);
		tes h=new QueuetoStack();
		h.test(2);
		
	}
	

	}  

class tes
{

	@Test
	public void test(int i) throws IOException
	{
		File fl= new File("C://djakdj");
		BufferedReader br = new BufferedReader(new FileReader("D://Test.txt"));  
		String str;  
		while((str = br.readLine()) != null){  
		System.out.println(str);
		}
		
		

		int k=i-1;
		System.out.println(k);
	}
}
	  
	