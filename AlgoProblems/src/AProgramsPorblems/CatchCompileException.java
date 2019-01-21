package AProgramsPorblems;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CatchCompileException {
	
	public static void main(String[] args) throws IOException {
		
		//File fl = new File("D:\\AAA.txt");
		try {
			FileReader fl1 = new FileReader("D:\\AAA.txt");
			int i;
	        while ((i=fl1.read()) != -1)
	        {
	            System.out.print((char) i);
	        }
	    
	
			
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}
		
		
		
		
	}

}
