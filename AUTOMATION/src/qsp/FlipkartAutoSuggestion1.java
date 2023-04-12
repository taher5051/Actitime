package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAutoSuggestion1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//button[.='✕']")).click();
	Thread.sleep(4000);
	driver.findElement(By.name("q")).sendKeys("iphone 14 pro max");
    Thread.sleep(3000);
    List<WebElement> autosuggestion = driver.findElements(By.xpath("//span[contains(.,'iphone 14 pro max')]/.."));
    int count = autosuggestion.size();
    System.out.println(count);
    for(int i=0;i<count;i++) {
    	String text = autosuggestion.get(i).getText();
    	System.out.println(text);
    	}
}
}
