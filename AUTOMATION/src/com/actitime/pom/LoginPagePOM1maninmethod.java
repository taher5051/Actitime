package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPagePOM1maninmethod {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
@Test
public void login1() throws InterruptedException{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/");
	LoginPagePOM1 l1=new LoginPagePOM1();
	PageFactory.initElements(driver, l1);
	l1.setvalue("admin1","manager1");
	Thread.sleep(4000);
	l1.setvalue("admin","manager");
}
}
