package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class enterUrlWithoutGet {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
    ChromeDriver driver=new ChromeDriver();
    driver.get("https://www.google.com");
    driver.navigate().to("https://www.gmail.com");
    driver.navigate().forward();
    driver.navigate().back();
    driver.navigate().refresh();
    driver.close();
     }
}
