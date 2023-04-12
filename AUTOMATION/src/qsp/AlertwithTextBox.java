package qsp;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertwithTextBox {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	    Scanner Sc=new Scanner(System.in);
	    System.out.println("text entered in prompt box :");
	    String name = Sc.nextLine();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		String promtbox = driver.switchTo().alert().getText();
		System.out.println(promtbox);
		 driver.switchTo().alert().sendKeys(name);
		 Thread.sleep(2000);
		 driver.switchTo().alert().accept();
	

	}

}
