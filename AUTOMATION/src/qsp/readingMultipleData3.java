package qsp;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readingMultipleData3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
    FileInputStream fis=new FileInputStream("./data/testScript3.xlsx");
    Workbook wb = WorkbookFactory.create(fis);
    Sheet s = wb.getSheet("sheet1");
    Row r = s.getRow(1);
    Cell c = r.getCell(0);
    String data = c.toString();
    System.out.println(data);
    }
}
