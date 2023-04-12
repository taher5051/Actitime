package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyPaste2 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/MSP/Desktop/sample.html");
	driver.findElement(By.xpath("(//input[@value='A'])[1]")).sendKeys(Keys.CONTROL+"a");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@value='A'])[1]")).sendKeys("taher");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@value='A'])[1]")).sendKeys(Keys.CONTROL+"c");
	Thread.sleep(2000);
    driver.findElement(By.xpath("(//input[@value='B'])[1]")).sendKeys(Keys.CONTROL+"a");
    Thread.sleep(2000);
    driver.findElement(By.xpath("(//input[@value='B'])[1]")).sendKeys(Keys.CONTROL+"v");
	}
}
