package AQuestionAaaddddoooobe;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import au.com.bytecode.opencsv.CSVReader;

public class ReadCSVFile {
	public static void readDataLineByLine(String file) 
	{ 
	  
	    try { 
	  
	             FileReader filereader = new FileReader(file); 
	 
	        CSVReader csvReader = new CSVReader(filereader); 
	        String[] nextRecord; 
	  
	        // we are going to read data line by line 
	        while ((nextRecord = csvReader.readNext()) != null) { 
	            for (String cell : nextRecord) { 
	                System.out.print(cell + "\t"); 
	            } 
	            System.out.println(); 
	        } 
	    } 
	    catch (Exception e) { 
	        e.printStackTrace(); 
	    } 


}

	
	public static void readcsvR(String csvFile) throws IOException
	{
		String line="";
		BufferedReader br = new BufferedReader(new FileReader(new File(csvFile)));
		while ((line = br.readLine()) != null) {
		    // use comma as separator
		    String[] cols = line.split(",");
		    System.out.println("Coulmn = " + cols[0] + " , Column 1=" + cols[1]+ " , Column 1=" + cols[1]);
		}
		
	}
public static void main(String[] args) throws IOException {
	
//	readDataLineByLine("D://ReadCSV.csv");
	// System.out.println();
	readcsvR("D://ReadCSV.csv");
	
}	
}