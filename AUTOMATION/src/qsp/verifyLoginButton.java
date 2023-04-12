package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifyLoginButton {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		boolean lbutton = driver.findElement(By.name("login")).isDisplayed();
		if(lbutton==true) {
			System.out.println("login button is displayed and pass");
		}
		else {
			System.out.println("login button is not displayed and fail");
		}
	    driver.quit();
		
		
     
	}

}
