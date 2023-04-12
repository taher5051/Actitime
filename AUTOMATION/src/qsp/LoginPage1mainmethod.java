package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage1mainmethod {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
    driver.get("https://demo.actitime.com/");
    LoginPage1 p=new LoginPage1(driver);
   // p.setvalue("admin");
   // p.setvalue1("manager");
   // p.setvalue2();
      p.setvalue("admin1","manager1");
      Thread.sleep(4000);
      p.setvalue("admin","manager");
	}

}
