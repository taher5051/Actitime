package qsp;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class printAllHeadings {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://demo.actitime.com/");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//div[.='Login ']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class='menu_icon'])[4]")).click();
	Thread.sleep(4000);
	driver.findElement(By.linkText("About your actiTIME")).click();
	Thread.sleep(3000);
	driver.findElement(By.linkText("Read Service Agreement")).click();
	Thread.sleep(4000);
	Set<String> allwh = driver.getWindowHandles();
    for(String wh:allwh) {
    	driver.switchTo().window(wh);
    }
    List<WebElement> allheading = driver.findElements(By.xpath("//h2"));
     int count = allheading.size();
     System.out.println(count);
     for(int i=0;i<count;i++) {
    	 String text = allheading.get(i).getText();
    	 System.out.println(text);
     }
     driver.close();
 }
	}


