package qsp;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingExcel1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
    FileInputStream fis=new FileInputStream("./data/testScript.xlsx");
   Workbook wb = WorkbookFactory.create(fis);
   String data = wb.getSheet("sheet1").getRow(1).getCell(1).getStringCellValue();
   System.out.println(data);
	}

}
