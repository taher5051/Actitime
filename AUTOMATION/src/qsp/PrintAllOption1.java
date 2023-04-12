package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllOption1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/MSP/Desktop/hotel1.html");
	WebElement mtrlistbox = driver.findElement(By.id("mtr"));
	Select S=new Select(mtrlistbox);
	//WebElement alloptions = S.getWrappedElement();
	//String text = alloptions.getText();
	//System.out.println(text);
	//driver.close();
	String text = S.getWrappedElement().getText();
	System.out.println(text);
	driver.close();
	
			
	

	}

}
