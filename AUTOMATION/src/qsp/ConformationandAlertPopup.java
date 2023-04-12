package qsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConformationandAlertPopup {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://demo.automationtesting.in/Alerts.html");
	 driver.findElement(By.linkText("Alert with OK & Cancel")).click();
	 driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	 Thread.sleep(3000);
	 Alert a = driver.switchTo().alert();
	 a.dismiss();
	 String text = driver.findElement(By.id("demo")).getText();
	 System.out.println(text);
	 if(text.equals("You Pressed Cancel")) {
		 System.out.println("text is verified");
	 }
	 else {
		 System.out.println("text is not verified");
	 }
	 driver.close();
	 }
}
