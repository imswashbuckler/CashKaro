package Serializable;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.Properties;

public class DeserializationClass {
	  public static void main(String[] args) throws IOException {
	  /*  Employee emp = null;
	    try {
	      FileInputStream fileIn = new FileInputStream("./employee.txt");
	      ObjectInputStream in = new ObjectInputStream(fileIn);
	      emp = (Employee) in.readObject();
	      in.close();
	      fileIn.close();
	    } catch (IOException i) {
	      i.printStackTrace();
	      return;
	    } catch (ClassNotFoundException c) {
	      System.out.println("Employee class not found");
	      c.printStackTrace();
	      return;
	    }
	    System.out.println("Deserializing Employee...");
	    System.out.println("First Name of Employee: " + emp.firstName);
	    System.out.println("Last Name of Employee: " + emp.lastName);
	    System.out.println("Company Name: "+emp.companyName);
	    System.out.println("Company CEO: "+emp.companyCEO);
	    System.out.println("Company Address: "+emp.address);
*/	 
		  
		  Properties prop = new Properties();
			String propFileName = " C://New folder (2)//config.properties";
			FileInputStream fs = new FileInputStream(propFileName);
			prop.load(fs);
			for(Object str:prop.keySet())
			{
			
				System.out.println((String)str);
				
			}


		  	  FileReader fr=new FileReader("./file.txt"); 
		  	int i;
		  	  while((i=fr.read())!=-1)  
		  	  {
		  	  System.out.print((char)i);  	  	  
		  	  
  
	  
	  }
	  }
}
