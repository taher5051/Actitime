package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionOfFlipkart {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//body[@class='fk-modal-visible']"));
	driver.findElement(By.name("q")).sendKeys("iphone14promax");
	Thread.sleep(5000);
	driver.findElements(By.xpath(null))
	}

}
