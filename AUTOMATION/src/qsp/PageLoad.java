package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoad {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);
	try {
		driver.get("https://demo.actitime.com");
		System.out.println("page is loaded and pass");
	}
    catch(Exception e){
    	System.out.println("page is not loaded and pass");
    }
	driver.close();
	}

}
