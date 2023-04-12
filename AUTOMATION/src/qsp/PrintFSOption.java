package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintFSOption {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/MSP/Desktop/hotel1.html");
     WebElement checkpostbox = driver.findElement(By.id("cp"));
     Thread.sleep(5000);
     Select S=new Select(checkpostbox);
     String text = S.getFirstSelectedOption().getText();
     System.out.println(text);
     driver.close();
	}

}
