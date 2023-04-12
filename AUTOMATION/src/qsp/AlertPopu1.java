package qsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopu1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Alerts.html");
	driver.findElement(By.xpath("(//button)[2]")).click();
	Thread.sleep(3000);
	Alert a = driver.switchTo().alert();
	String text = a.getText();
    System.out.println(text);
    Thread.sleep(3000);
    a.dismiss();
    Thread.sleep(3000);
    driver.close();
	}
}
