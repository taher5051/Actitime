package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dateofbirth {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		WebElement listbox1 = driver.findElement(By.id("day"));
		Select s = new Select(listbox1);
		s.selectByIndex(18);
		Thread.sleep(2000);
		WebElement listbox2 = driver.findElement(By.id("month"));
		Select S1 = new Select(listbox2);
		S1.selectByValue("11");
		Thread.sleep(2000);
		WebElement listbox3 = driver.findElement(By.id("year"));
		Select S2 = new Select(listbox3);
		S2.selectByVisibleText("1996");
		Thread.sleep(2000);
		driver.close();

	}

}
