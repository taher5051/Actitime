package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class careInsurance {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("123");
		driver.findElement(By.id("dob")).click();
		WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select s = new Select(month);
		s.selectByIndex(10);
		WebElement Year = driver.findElement(By.xpath("//select[@aria-label='Select year']"));
		Select s1 = new Select(Year);
		s1.selectByVisibleText("1996");
		driver.findElement(By.id("alternative_number")).sendKeys("9845098450");
		driver.findElement(By.id("renew_policy_submit")).click();
	String text = driver.findElement(By.id("policynumberError")).getText();
	if(text.equals("Please enter valid Policy No.")) {
		System.out.println("text veryfied");
	}
		else {
			System.out.println("text not verified");
		}
	}
		
		}


