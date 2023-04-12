package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginEnabled {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	boolean button = driver.findElement(By.name("login")).isEnabled();
		Thread.sleep(4000);
	if(button==true) {
		System.out.println("login button enabled successfully");
	}
else
{
	System.out.println("login button is not enabled successfully");
}
	driver.close();
}
}
