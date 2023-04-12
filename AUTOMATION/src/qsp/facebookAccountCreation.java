package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebookAccountCreation {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.findElement(By.linkText("Create new account")).click();
	Thread.sleep(5000);
	driver.findElement(By.name("firstname")).sendKeys("Ali");
	Thread.sleep(2000);
	driver.findElement(By.name("lastname")).sendKeys("Bohra");
	Thread.sleep(2000);
	driver.findElement(By.name("reg_email__")).sendKeys("taher52535@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.name("reg_email_confirmation__")).sendKeys("taher52535@gmail.com");
	driver.findElement(By.id("password_step_input")).sendKeys("QWERT123@");
	WebElement day = driver.findElement(By.name("birthday_day"));
	Select S=new Select(day);
	S.selectByIndex(0);
	WebElement month = driver.findElement(By.name("birthday_month"));
	Select S1=new Select(month);
	S1.selectByValue("11");
	WebElement Year = driver.findElement(By.name("birthday_year"));
	Select S2=new Select(Year);
	S2.selectByValue("1996");
	driver.findElement(By.xpath("//label[.='Male']")).click();
	driver.findElement(By.name("websubmit")).click();
	Thread.sleep(7000);
	driver.findElement(By.className("x6s0dn4 x78zum5 xl56j7k x1608yet xljgi0e x1e0frkt")).click();
	

	}

}
