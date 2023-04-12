package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutClose {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://secure.indeed.com/");
	driver.findElement(By.id("apple-signin-button")).click();
	driver.findElement(By.id("login-facebook-button")).click();
	Set<String> wh = driver.getWindowHandles();
	for(String Allwh:wh) {
		Thread.sleep(4000);
	driver.switchTo().window(Allwh);
	driver.close();
	}
}
}
