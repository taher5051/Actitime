package com.actitime.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.TestInstance;

public class DemoAssertion1 {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
@Test
public void VerifyTitle1() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	String etitle = "Google";
	String title = driver.getTitle();
	Assert.assertEquals(title,etitle);
	driver.close();
	
}
}
