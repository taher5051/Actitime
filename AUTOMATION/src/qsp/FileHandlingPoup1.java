package qsp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileHandlingPoup1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/MSP/Desktop/naukri.html");
	File F=new File("./data/resume.txt");
	      String absolutepath = F.getAbsolutePath();
	driver.findElement(By.id("cv")).sendKeys(absolutepath);
}

}
