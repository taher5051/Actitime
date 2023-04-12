package com.actitime.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ActiProjectfileLib {
	public String getpropertydata(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./data/commondata.property.txt");
		Properties p=new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
		}
	public String getExceldata(String SheetName,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fes=new FileInputStream("./data/testScript.xlsx");
		Workbook wb = WorkbookFactory.create(fes);
		String data1 = wb.getSheet(SheetName).getRow(row).getCell(cell).getStringCellValue();
		return data1;
		}
}
