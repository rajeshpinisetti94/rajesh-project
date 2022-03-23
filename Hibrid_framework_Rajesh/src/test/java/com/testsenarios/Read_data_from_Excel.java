package com.testsenarios;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Read_data_from_Excel {
  @Test
  public void f() throws Exception {
	  FileInputStream fis = new FileInputStream("./src/test/resources/td.xlsx ");
	  Workbook wi= new XSSFWorkbook(fis);
	  Sheet s = wi.getSheet("Sheet1");
	  Row r = s.getRow(2);
	  System.out.println(r.getCell(1));
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
