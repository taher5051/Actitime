package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DemoB1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("WebDriver.gecko.driver","./driver/geckodriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		demoA1.testA(driver);
		WebDriver driver1=new FirefoxDriver();
		demoA1.testA(driver1);
		}

}
