package qsp;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingMultipleData4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
    FileInputStream fis=new FileInputStream("./data/testScript3.xlsx");
    Workbook wb = WorkbookFactory.create(fis);
    int rowcount = wb.getSheet("sheet1").getLastRowNum();
    short cellcount = wb.getSheet("sheet1").getRow(0).getLastCellNum();
    System.out.println(rowcount);
    System.out.println(cellcount);
    for(int i=1;i<=rowcount;i++) {
      for(int j=0;j<cellcount;j++){
    	Row un = wb.getSheet("sheet1").getRow(i);
    	String pwd = un.getCell(j).getStringCellValue();
    	System.out.println(pwd);
    }
	}
}
}
