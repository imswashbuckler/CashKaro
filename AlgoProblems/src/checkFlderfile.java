import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class checkFlderfile {

	public static boolean checkPath(String path) {

		boolean b = false;
		File file = new File(path);
		if (file.isDirectory()) {
			
			int l=file.list().length;
			if (l > 0) {
				System.out.println("Directory is not Empty");
				b = true;
				return b;

			} else {
				System.out.println("Directory is  Empty");

			}

		} else {
			System.out.println("Its not path of a directory");

		}
		return b;

	}

	public static boolean checkTextInFile(String directory,
			String file,String givenfline)
			throws IOException {
		
		boolean c=false;
		if (checkPath(directory) == true) {

			File Dfiles = new File(directory);
			File[] files =Dfiles.listFiles();
			

			for (File gfile : files) {

				{
					String f=gfile.getName();
					if (f.equals(file))

					{
						// System.out.println();
						String fline = null;

						String filepath=directory+"\\"+file;
						BufferedReader brTest = new BufferedReader(
								new FileReader(filepath));
						 fline = brTest.readLine();
						if(fline.equals(givenfline))
						{
							 c=true;
							 break;
							
						}
  }

						

					}

				}
			}
		return c;

		}

	
public static boolean checkData(String filepath) throws IOException
{
	BufferedReader br = new BufferedReader(new FileReader("D:\\abc.txt"));
	String line = br.readLine();
	String[] columns = line.split(" ");
	 String strLine;
	 boolean b=true;
     while ((strLine = br.readLine()) != null)  
     {
    	 String[] tokens = strLine.split(",");
    	 if(tokens[0]=="" || tokens[1]=="" )
    	 {
    		  b=false;
    		 break;
    	 }

     }
	return b;


	
	
}

	public static void main(String[] args) throws IOException {

		boolean b = checkPath("D:\\Automation");
		System.out.println(b);
		boolean c=checkTextInFile( "D:\\Automation", "abc.txt","Name, Website, Rank, Address, City, State, PinCode, Country");
		System.out.println(c);
		/*	boolean d=checkData("D:\\Automation\\abc.txt"); 
		System.out.println(d);*/


	}

}
