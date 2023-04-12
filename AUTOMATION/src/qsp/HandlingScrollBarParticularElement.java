package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollBarParticularElement {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.bbc.com/");
	int y = driver.findElement(By.partialLinkText("The greatest monster film ever made")).getLocation().getY();
	JavascriptExecutor r=(JavascriptExecutor) driver;
	r.executeScript("window.scrollBy(0,"+y+")");
	

	}

}
