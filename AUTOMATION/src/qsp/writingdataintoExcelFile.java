package qsp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class writingdataintoExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
    FileInputStream fis=new FileInputStream("./data/testScript2.xlsx");
    Workbook wb = WorkbookFactory.create(fis);
    wb.getSheet("sheet1").getRow(1).getCell(3).setCellValue("fail");
    FileOutputStream fos=new FileOutputStream("./data/testScript2.xlsx");
    wb.write(fos);
    wb.close();
	}

}
