package qsp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLoginByUsingExcelFile {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	FileInputStream fis=new FileInputStream("./data/testScript2.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	String url = wb.getSheet("sheet1").getRow(1).getCell(0).getStringCellValue();
	String un = wb.getSheet("sheet1").getRow(1).getCell(1).getStringCellValue();
	String pw = wb.getSheet("sheet1").getRow(1).getCell(2).getStringCellValue();
    driver.get(url);
	driver.findElement(By.id("username")).sendKeys(un);
	driver.findElement(By.name("pwd")).sendKeys(pw);
	driver.findElement(By.partialLinkText("Login")).click();
	}
}
