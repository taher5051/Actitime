package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class careinsurance1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		Thread.sleep(1000);
		driver.findElement(By.id("policynumber")).sendKeys("123");
		Thread.sleep(1000);
		driver.findElement(By.id("dob")).click();
		WebElement month = driver.findElement(By.xpath("//select[@aria-label='Select month']"));
		Select s = new Select(month);
		s.selectByVisibleText("Nov");
		Thread.sleep(1000);
		WebElement year = driver.findElement(By.xpath("//select[@data-handler='selectYear']"));
        Select S=new Select(year);
        S.selectByValue("1996");
        Thread.sleep(1000);
        driver.findElement(By.id("alternative_number")).sendKeys("85408540");
        Thread.sleep(1000);
        driver.findElement(By.id("renew_policy_submit")).click();
        Thread.sleep(1000);
        String text = driver.findElement(By.id("policynumberError")).getText();
        if(text.equals("Please enter valid Policy No.")) {
        	System.out.println("text is verified");
        }
        	else {
        		System.out.println("text is not verified");
        }
        driver.close();
        
	}

}
