package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class closeSpecificTitle {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.id("apple-signin-button")).click();
		driver.findElement(By.id("login-facebook-button")).click();
		String atitle = "Facebook";
		Set<String> allwh = driver.getWindowHandles();
		for(String wh:allwh)
			driver.switchTo().window(wh);
		String etitle = driver.getTitle();
		if(atitle.equals(etitle)) {
			driver.close();
}
		else {
					}
	

	}

}
