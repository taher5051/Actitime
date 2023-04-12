package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingListBox1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(5000);
		WebElement listbox = driver.findElement(By.id("month"));
		Select s = new Select(listbox);
		s.selectByIndex(0);
		Thread.sleep(5000);
		s.selectByValue("3");
		Thread.sleep(5000);
		s.selectByVisibleText("Nov");
		driver.close();
	}

}
