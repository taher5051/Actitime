package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RemoveText {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
 public static void main(String[] args) throws InterruptedException {
	 WebDriver driver= new ChromeDriver();
	 driver.get("http://vtiger-demo.it-solutions4you.com/");
	 Thread.sleep(4000);
	 driver.findElement(By.id("username")).clear();
	 }

}
