package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class printFontSize {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	String fs = driver.findElement(By.linkText("Forgotten password?")).getCssValue("font-size")
//	String ff = driver.findElement(By.linkText("Forgotten password?")).getCssValue("font-family");
	System.out.println("font size = "+ fs);
	//System.out.println("font family = "+ ff);
}

}
