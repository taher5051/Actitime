package qsp;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
public static void main(String[] args) throws AWTException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/");
	WebElement link = driver.findElement(By.linkText("actiTIME Inc."));
	Actions a=new Actions(driver);
    a.contextClick(link).perform();
    Robot r=new Robot();
    r.
    
    

	}

}
