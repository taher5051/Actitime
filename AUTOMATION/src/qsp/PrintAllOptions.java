package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllOptions {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/MSP/Desktop/hotel1.html");
	WebElement checkpostlistbox = driver.findElement(By.id("cp"));
	Select S=new Select(checkpostlistbox);
	 List<WebElement> allsoption = S.getAllSelectedOptions();
	 int count = allsoption.size();
	 System.out.println(count);
	for(int i=0;i<count;i++) {
		String Text = allsoption.get(i).getText();
		System.out.println(Text);
	}
		driver.close();
		
	

	}

}
