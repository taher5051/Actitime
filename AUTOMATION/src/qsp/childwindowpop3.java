package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childwindowpop3 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://secure.indeed.com/");
	String address = driver.getWindowHandle();
	System.out.println(address);
	driver.findElement(By.id("login-google-button")).click();
	driver.findElement(By.id("apple-signin-button")).click();
	driver.findElement(By.id("login-facebook-button")).click();
	Set<String> allWh = driver.getWindowHandles();
	int count = allWh.size();
	System.out.println(count);
	for(String wh:allWh) {
		driver.switchTo().window(wh);
		System.out.println(wh);
		}
	driver.quit();
}
}
