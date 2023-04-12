package qsp;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllOptionsWithoutDuplicate {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/MSP/Desktop/hotel1.html");
	WebElement mtrlistbox = driver.findElement(By.id("mtr"));
	Select S=new Select(mtrlistbox);
	List<WebElement> allOptions = S.getOptions();
	int count = allOptions.size();
	TreeSet<String> all=new TreeSet<String>();
	for(int i=0;i<count;i++) {
		 all.add(allOptions.get(i).getText());
	}
	System.out.println(all.size());
	for(String i:all) {
		System.out.println(i);
	}
	driver.close();

	}

}
