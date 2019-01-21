package TestPack;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import au.com.bytecode.opencsv.CSVReader;

public class CmprFromxmltocsv {

	private static final String FILENAMEXML = "D:\\CSV\\fileXml.xml";
	private static final String FILENAMECSV = "D:\\CSV\\A.csv";

	static Map<String, List<String>> mapcsv = new HashMap<String, List<String>>();
	static Map<String, List<String>> mapxml = new HashMap<String, List<String>>();

	static CmprFromxmltocsv mainMethod = new CmprFromxmltocsv();

	public Map<String, List<String>> testDataCsv(String filename)
			throws IOException {

		String[] row = null;

		CSVReader csvReader = new CSVReader(new FileReader(FILENAMECSV));
		List content = csvReader.readAll();
		for (Object object : content) {
			row = (String[]) object;
			List<String> list = new ArrayList<String>();
			list.add(row[1]);
			list.add(row[2]);
			list.add(row[3]);

			mapcsv.put(row[0], list);
		}

		return mapcsv;
	}

	public Map<String, List<String>> testDataxml(String fileName)
			throws ParserConfigurationException, SAXException, IOException {
		File fXmlFile = new File(fileName);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(fXmlFile);
		doc.getDocumentElement().normalize();

		NodeList nList = doc.getElementsByTagName("col1");
		NodeList nList2 = doc.getElementsByTagName("col2");
		NodeList nList3 = doc.getElementsByTagName("col3");
		NodeList nList4 = doc.getElementsByTagName("col4");

		System.out.println(nList.getLength());

		for (int temp = 0; temp < nList.getLength(); temp++) {
			List<String> list = new ArrayList<String>();

			Element eElement = (Element) nList.item(temp);
			Element eElement2 = (Element) nList2.item(temp);
			Element eElement3 = (Element) nList3.item(temp);
			Element eElement4 = (Element) nList4.item(temp);

			list.add(mainMethod.getValue("col2", eElement2));
			list.add(mainMethod.getValue("col3", eElement3));
			list.add(mainMethod.getValue("col4", eElement4));

			mapxml.put(mainMethod.getValue("col1", eElement), list);
		}
		return mapxml;
	}

	private String getValue(String tag, Element element) {
		String nodes = element.getTextContent().trim();
		return nodes;
	}

	public static void main(String[] args) throws IOException,
			ParserConfigurationException, SAXException {

		Map<String, List<String>> testDataxml = mainMethod
				.testDataxml(FILENAMEXML);
		Map<String, List<String>> testDataCsv = mainMethod
				.testDataCsv(FILENAMECSV);

		boolean b = true;
		for (String s : testDataxml.keySet()) {
			List<String> dxml = testDataxml.get(s);
			List<String> dcsv = testDataCsv.get(s);

			if (!dxml.equals(dcsv)) {
				b = false;
				break;

			}

		}
		if (b) {
			System.out.println("data is same");
		}
		else{			System.out.println("data is not same");}

	}
}
