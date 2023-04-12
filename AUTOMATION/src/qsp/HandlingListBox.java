package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingListBox {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.findElement(By.linkText("Create new account")).click();
	Thread.sleep(5000);
	WebElement monthListBox = driver.findElement(By.id("month"));
	Select s=new Select(monthListBox);
	s.selectByIndex(10);
	Thread.sleep(5000);
	s.selectByValue("12");
	Thread.sleep(5000);
	s.selectByVisibleText("Jun");
	driver.close();
	}
}
