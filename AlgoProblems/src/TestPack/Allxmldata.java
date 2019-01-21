package TestPack;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Allxmldata {
	 AllData alldata = new AllData();


	
	public  void setAlldata()
	{

		alldata.setxmldata(new ArrayList<xmldata>());;
		
		xmldata obdata= new xmldata();
		obdata.setCol1(1);
		obdata.setCol2("T");
		obdata.setCol3("da");
		obdata.setCol4("fs");
		
		alldata.getData().add(obdata);

							

}
	
	public static void main(String[] args) {
		try
		{
		
		File file = new File("C:\\file.xml");
		JAXBContext jaxbContext = JAXBContext.newInstance(xmldata.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		xmldata oxmldata = (xmldata) jaxbUnmarshaller.unmarshal(file);
		System.out.println(oxmldata);
		}
	   catch (JAXBException e) {
		e.printStackTrace();
	  }
		
	}
}
