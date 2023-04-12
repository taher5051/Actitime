package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiselectedListBox {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/MSP/Desktop/hotel1.html");
	WebElement mtrlistbox = driver.findElement(By.id("mtr"));
	Select S=new Select(mtrlistbox);
	S.selectByIndex(0);
    Thread.sleep(1000);
	S.selectByValue("d");
	Thread.sleep(1000);
	S.selectByVisibleText("vada");
	Thread.sleep(1000);
	S.deselectByIndex(2);
	Thread.sleep(1000);
	S.deselectByValue("d");
	Thread.sleep(1000);
    S.deselectByVisibleText("idly");
    Thread.sleep(1000);
    S.isMultiple();
    driver.close();
    }

}
