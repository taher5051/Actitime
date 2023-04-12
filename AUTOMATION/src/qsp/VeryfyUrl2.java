package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VeryfyUrl2 {
	static {
	System.setProperty(webdriver.chrome.driver,"./driver/chromedriver.exe");
	}

public static void main(Stri""ng[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://www.seleniumhq.org/");
String expectedUrl = "https://www.selenium.dev";
String url = driver.getCurrentUrl();
if(url.equals(expectedUrl)) {
	System.out.println("pass");
}
else
{
	System.out.println("fail");
}

	}

}
