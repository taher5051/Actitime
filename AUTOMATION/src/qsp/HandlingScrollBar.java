package qsp;

import java.rmi.Remote;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HandlingScrollBar {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.bbc.com/");
	RemoteWebDriver r=(RemoteWebDriver) driver;
	r.executeScript("window.scrollBy(0,3000)");
	}

}
