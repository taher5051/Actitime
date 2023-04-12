package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class filelib {
	public  String getpropertyfile(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./data/commondata.property.txt");
		Properties p=new Properties();
		p.load(fis);
		String url = p.getProperty(key);
		return url;
		}
	public String getexcelfile(String sheet,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/testScript2.xlsx");
	    Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet("sheet1").getRow(row).getCell(cell).getStringCellValue();
	    return data;
	}
	public void setExcelFile(String sheet,int row,int cell,String data) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/testScript2.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet("sheet1").getRow(1).getCell(3).setCellValue(data);
		FileOutputStream fos=new FileOutputStream("./data/testScript2.xlsx");
		wb.write(fos);
		}
  }
