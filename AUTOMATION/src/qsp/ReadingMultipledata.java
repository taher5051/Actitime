package qsp;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingMultipledata {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
    FileInputStream fis=new FileInputStream("./data/testScript3.xlsx");
    Workbook wb = WorkbookFactory.create(fis);
    int rawcount = wb.getSheet("sheet1").getLastRowNum();
    for(int i=1;i<=rawcount;i++) {
    String un = wb.getSheet("sheet1").getRow(i).getCell(0).getStringCellValue();
    System.out.println(un);
    }
}
}