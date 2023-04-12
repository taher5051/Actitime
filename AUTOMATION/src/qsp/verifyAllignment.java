package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifyAllignment {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com");
	int Xaxis1 = driver.findElement(By.id("username")).getLocation().getX();
	int Xaxis2= driver.findElement(By.name("pwd")).getLocation().getX();
	if(Xaxis1==Xaxis2) {
		System.out.println("username and passaword are properly allainged and pass");
	}
	else {
		System.out.println("username and passaword are not properly allinged and fail");
	}
	
}
}
