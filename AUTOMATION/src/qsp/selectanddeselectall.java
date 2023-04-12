package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectanddeselectall {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
    driver.get("file:///C:/Users/MSP/Desktop/hotel1.html");
    WebElement mtrlistbox = driver.findElement(By.id("mtr"));
    Thread.sleep(1000);
    Select S=new Select(mtrlistbox);
    List<WebElement> Alloptions = S.getOptions();
    Thread.sleep(1000);
    int count = Alloptions.size();
    System.out.println(count);
    for(int i=0;i<count;i++) {
    	S.selectByIndex(i);
    	}
    Thread.sleep(2000);
    for(int i=count-1;i>=0;i--) {
    	S.deselectByIndex(i);
    }
    driver.close();
    }

}
