package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkedUnchecked {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		Thread.sleep(4000);
		boolean select = driver.findElement(By.id("keepLoggedInLabel")).isSelected();
        if(select==true) {
        	System.out.println("checked button is selected");
        }
        else {
        	System.out.println("checked button is not selected");
        }
        driver.close();
	}

}
