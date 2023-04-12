package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EngineeringTypeWork {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://demo.actitime.com/login.do");
driver.findElement(By.id("username")).sendKeys("admin");
driver.findElement(By.name("pwd")).sendKeys("manager");
driver.findElement(By.xpath("//div[.='Login ']")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]")).click();
Thread.sleep(3000);
driver.findElement(By.linkText("Types of Work")).click();
 String text = driver.findElement(By.xpath("//a[.='engineering']/../../td[4]")).getText();
 System.out.println(text);
}
}
