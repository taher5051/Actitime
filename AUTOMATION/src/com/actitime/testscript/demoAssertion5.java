package com.actitime.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class demoAssertion5 {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
@Test
public void verifytTitle() {
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com");
String etitle = "moogle";
String atitle = driver.getTitle();
SoftAssert as=new SoftAssert();
as.assertEquals(atitle,etitle);
Reporter.log("hi",true);
as.assertAll();
Reporter.log("bye",true);
}
}
