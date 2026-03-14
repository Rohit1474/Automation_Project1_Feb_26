package com.Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	XSSFWorkbook wb;
	public ExcelDataProvider() throws IOException {
		String path="C:\\Users\\rohit\\eclipse-workspace\\Automation_Project1_Feb_26\\TestData\\Data.xlsx" ;
		FileInputStream fis= new FileInputStream(path);
		 wb=new XSSFWorkbook(fis);
		
	}
	
	public String getStringData(String sheetname, int row, int cell) {
		return wb.getSheet(sheetname).getRow(0).getCell(0).getStringCellValue();
	}
}
