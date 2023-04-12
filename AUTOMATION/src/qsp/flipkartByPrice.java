package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartByPrice {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='✕']")).click();
        driver.findElement(By.name("q")).sendKeys("iphone 14 pro max");
        driver.findElement(By.xpath("//button[@type='submit']"));
        List<WebElement> productname = driver.findElements(By.xpath("//span[contains(.,'iphone 14'nna)]"));
        Thread.sleep(3000);
        String Text = productname.get(1).getText();
        System.out.println(Text);
 }

}
