package qsp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLoginByPropertyfile {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
    public static void main(String[] args) throws IOException {
    WebDriver driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    driver.manage().window().maximize();
    FileInputStream fis=new FileInputStream("./data/commondata.property.txt");
    Properties p=new Properties();
    p.load(fis);
    String ur = p.getProperty("url");
    String un = p.getProperty("username");
    String ps = p.getProperty("password");
    driver.get(ur);
    driver.findElement(By.id("username")).sendKeys(un);
    driver.findElement(By.name("pwd")).sendKeys(ps);
    driver.findElement(By.xpath("//div[text()='Login ']")).click();
	}
}
