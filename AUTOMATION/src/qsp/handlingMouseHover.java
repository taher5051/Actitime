package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class handlingMouseHover {
	c
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 	
    driver.get("https://www.vtiger.com/");
    WebElement resource = driver.findElement(By.partialLinkText("Resources"));
    Actions a=new Actions(driver);
    Thread.sleep(2000);
    a.moveToElement(resource).perform();
    driver.findElement(By.partialLinkText("Contact Us")).click();
    String text = driver.findElement(By.xpath("//p[contains(.,' Bengaluru, India')]/../p[2]")).getText();
    System.out.println(text);
	}

}
