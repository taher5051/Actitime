package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrame3 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/MSP/Desktop/page1.html");
		Thread.sleep(2000);
		driver.findElement(By.id("t1")).sendKeys("a");
		Thread.sleep(2000);
		driver.switchTo().frame("f1");
		Thread.sleep(2000);
		driver.findElement(By.id("t2")).sendKeys("b");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.id("t1")).sendKeys("c");
		Thread.sleep(2000);
		WebElement e = driver.findElement(By.xpath("//iframe[@src=\"page2.html\"]"));
		driver.switchTo().frame(e);
		driver.findElement(By.id("t2")).sendKeys("d");
		Thread.sleep(2000);
}

}
