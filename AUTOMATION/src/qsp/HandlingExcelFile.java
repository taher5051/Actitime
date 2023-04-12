package qsp;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\MSP\\Desktop\\testScript.xlsx");
		String data = WorkbookFactory.create(fis).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println(data);
		}
}
