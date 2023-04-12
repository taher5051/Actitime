package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllTheTitle {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("login-google-button"));
		Thread.sleep(2000);
		driver.findElement(By.id("apple-signin-button")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("login-facebook-button")).click();
		Set<String> allwh = driver.getWindowHandles();
		int count = allwh.size();
		System.out.println(count);
		for (String wh : allwh) {
			Thread.sleep(1000);
			driver.switchTo().window(wh);
			String title = driver.getTitle();
			System.out.println(title);
		}
		driver.quit();
	}
}
