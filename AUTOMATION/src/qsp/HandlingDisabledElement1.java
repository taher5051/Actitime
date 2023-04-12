package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HandlingDisabledElement1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/MSP/Desktop/disabled.html");
	driver.findElement(By.id("d1")).sendKeys("admin");
	RemoteWebDriver r=(RemoteWebDriver) driver;
	Thread.sleep(3000);
	r.executeScript("document.getElementById('d2').value='manager'");
	Thread.sleep(3000);
	//r.executeScript("document.getElementById('d2').value=' '");
	r.executeScript("document.getElementById('d3').click()");


	}

}
