package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPagePOMmainmethod {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
@Test
public void login1page() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/");
	LoginPagePOM l=new LoginPagePOM(driver);
	l.setvalue("admin1","manager1");
	Thread.sleep(4000);
	l.setvalue("admin","manager");
}


}
