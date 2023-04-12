package qsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAndConformation1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Alerts.html");
	Thread.sleep(2000);
	driver.findElement(By.linkText("Alert with OK & Cancel")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	Thread.sleep(1000);
    Alert Alert1 = driver.switchTo().alert();
    Alert1.dismiss();
    Thread.sleep(1000);
    String text = driver.findElement(By.id("demo")).getText();
    System.out.println(text);
    if(text.equals("You Pressed Cancel")) {
    	System.out.println("text verified");
    }
    else {
    	System.out.println("text is not verified");
    }
    Thread.sleep(1000);
    driver.close();
   }
}
