package com.actitime.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.actitime.pom.ActiProjecthomepage;
import com.actitime.pom.ActiProjectlogin;

public class ActiProjectBaseClass {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public WebDriver driver;
@BeforeClass
public void openBrowser() {
	Reporter.log("openBrowser",true);
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();
}
@AfterClass
public void closebrowser() {
	Reporter.log("closebrowser",true);
	driver.close();
}
@BeforeMethod
public void login() throws IOException {
	Reporter.log("login",true);
	ActiProjectfileLib l=new ActiProjectfileLib();
	String ur = l.getpropertydata("url");
	String un = l.getpropertydata("username");
	String pw = l.getpropertydata("password");
	driver.get(ur);
	ActiProjectlogin lo=new ActiProjectlogin(driver);
	lo.setlogin(un, pw);
}
@AfterMethod
public void logout() {
	Reporter.log("logout",true);
	ActiProjecthomepage lg=new ActiProjecthomepage(driver);
	lg.setlogout();
	
}
}
