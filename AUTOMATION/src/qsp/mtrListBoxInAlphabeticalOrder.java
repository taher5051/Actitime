package qsp;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class mtrListBoxBYFOReachLoop {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/MSP/Desktop/hotel1.html");
	WebElement mtrlistbox = driver.findElement(By.id("mtr"));
	Select S1=new Select(mtrlistbox);
	List<WebElement> alloption = S1.getOptions();
	ArrayList<String> all=new ArrayList<String>();
	for(int i=0; i<alloption.size();i++) {
     all.add(alloption.get(i).getText());
	}
	for(String i : all) {
		System.out.println(i);
		
	}
   
    }
    }
    


