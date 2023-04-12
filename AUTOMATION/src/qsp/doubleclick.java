package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclick {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.vtiger.com/");
		WebElement e = driver.findElement(By.partialLinkText("Resources"));
		Actions a = new Actions(driver);
		a.moveToElement(e).perform();
		driver.findElement(By.partialLinkText("Customers")).click();
		WebElement login = driver.findElement(By.partialLinkText("Login"));
		a.doubleClick(login).perform();
		String title = driver.getTitle();
		if (title.equals("Login - Vtiger")) {
			System.out.println("verified");
		} else {
			System.out.println("not verified");
		}
		driver.close();
		}
}
