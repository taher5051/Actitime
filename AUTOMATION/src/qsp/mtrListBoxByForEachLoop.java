package qsp;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class mtrListBoxByForEachLoop {
	private static final String ArrayList = null;
	static {
		System.setProperty("webdriver.chrome.driver","/driver/chromedriver.exe");
	}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/MSP/Desktop/hotel1.html");
	WebElement mtrlistbox = driver.findElement(By.id("mtr"));
	Select s1=new Select(mtrlistbox);
	List<WebElement> alloption = s1.getOptions();
	ArrayList<String> all = new ArrayList<String>(); 

	}

}
