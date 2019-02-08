package utils;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	FileInputStream fi;
	FileOutputStream fo;
	XSSFSheet s;
	XSSFWorkbook w;
	XSSFWorkbook wo;
	Properties prop;
	

	public void testDataFile(String file) throws IOException {

	fi = new FileInputStream(file);
		w = new XSSFWorkbook(fi);
	}

	public String readFromColumn(String sheetname, int row, int column)
			throws IOException // To
	
	{

		s = w.getSheet(sheetname);
		String data = null;
		XSSFRow r = s.getRow(row);
		if (r.getCell(column).getCellType() == XSSFCell.CELL_TYPE_NUMERIC) {
			r.getCell(column).setCellType(Cell.CELL_TYPE_STRING);
			data = r.getCell(column).getStringCellValue();
			data = data.trim();
			System.out.println(data);


		} else if (r.getCell(column).getCellType() == XSSFCell.CELL_TYPE_STRING) {
			data = r.getCell(column).getStringCellValue();
			data = data.trim();
			System.out.println(data);
		}

		return data;
	}



		
	public void closeFile() throws IOException // Closes the opened excel file.
	{
		fi.close();

	}
}
