package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyPste3 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/MSP/Desktop/sample.html");
	driver.findElement(By.xpath("//input[@type='text' and @value='A']")).sendKeys(Keys.CONTROL+"a");
	driver.findElement(By.xpath("//input[@type='text' and @value='A']")).sendKeys("taher");
	driver.findElement(By.xpath("//input[@type='text' and @value='A']")).sendKeys(Keys.CONTROL+"a");
    driver.findElement(By.xpath("//input[@type='text' and @value='A']")).sendKeys(Keys.CONTROL+"c");
	driver.findElement(By.xpath("//input[@type='text' and @value='B']")).sendKeys(Keys.CONTROL+"a");
	driver.findElement(By.xpath("//input[@type='text' and @value='B']")).sendKeys(Keys.CONTROL+"v");
    
	
	

	}

}
