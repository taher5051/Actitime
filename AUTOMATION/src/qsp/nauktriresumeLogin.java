package qsp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nauktriresumeLogin {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.findElement(By.id("login_Layer")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("taher52535@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Liggog5253@");
		driver.findElement(By.xpath("//button[.='Login']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[.='UPDATE PROFILE'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='crossIcon chatBot chatBot-ic-cross']")).click();
		File F = new File("./data/reasume.doc");
		String absolute = F.getAbsolutePath();
		driver.findElement(By.id("attachCV")).sendKeys(absolute);

	}

}
