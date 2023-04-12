package qsp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class naukriresumeUpload {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.naukri.com/");
	driver.findElement(By.id("register_Layer")).click();
	driver.findElement(By.id("name")).sendKeys("Taher ALI BOHRA");
	driver.findElement(By.id("email")).sendKeys("taher52535@gmail.com");
	driver.findElement(By.id("password")).sendKeys("Liggog5253@");
	driver.findElement(By.id("mobile")).sendKeys("8319502181");
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//div[@class='focusable optionWrap  '])[1]")).click();
	File f=new File("./data/reasume.doc");
	String Ap = f.getAbsolutePath();
	driver.findElement(By.id("resumeUpload")).sendKeys(Ap);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[.='Register Now']")).click();
	

	}

}
