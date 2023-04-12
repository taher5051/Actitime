package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeightandWidthComparasion {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com");
	int height1 = driver.findElement(By.id("username")).getSize().getHeight();
	int width1 = driver.findElement(By.id("username")).getSize().getWidth();
	int height2 = driver.findElement(By.name("pwd")).getSize().getHeight();
	int width2 = driver.findElement(By.name("pwd")).getSize().getWidth();
	if((height1==height2) && (width1==width2) ) {
		System.out.println("height of username and passaword is equal");
	}
	else {
		System.out.println("height of username and passaword is not equal");
	}
	driver.close();
	}

	}


