package day32;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//File-->WorkBook-->Sheets-->Rows-->Cells
public class ReadingExcel {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file=new FileInputStream("C:\\Automation\\WorkSpaceEclipse\\seleniumproject\\TestData\\Classeur.xlsx");
		//FileInputStream file=new FileInputStream("System.getProperty("user.dir")+"\\TestData\\Classeur.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);

	}

}
