package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class WiproJobs1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.switchTo().activeElement().sendKeys("Wipro Jobs"+ Keys.ENTER);
	List<WebElement> link = driver.findElements(By.xpath("//a"));
	int count = link.size();
	System.out.println(count);
//	for(int i=0;i<count;i++) {
	//	String allurl = link.get(i).getAttribute("href");
		//System.out.println(allurl);
	//}
	for(WebElement url:link) {
		String allurl = url.getAttribute("href");
		System.out.println(allurl);
	}
}
}
