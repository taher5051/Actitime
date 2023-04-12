package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class printAllOption {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/MSP/Desktop/hotel1.html");
	Thread.sleep(2000);
    WebElement cplistbox = driver.findElement(By.id("cp"));
    Thread.sleep(2000);
    Select S=new Select(cplistbox);
    List<WebElement> alloptions = S.getOptions();
    int count = alloptions.size();
    System.out.println(count);
    //for(int i=0;i<count;i++) {
    	//String Text = alloptions.get(i).getText();
    	//System.out.println(Text);
    	//}
    //driver.close();
    for(WebElement all:alloptions) {
    	String text = all.getText();
        System.out.println(text);
    }
	}

}
