import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoAssertion2 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	@Test
	public void verifytitle2() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String etitle = "moogle";
		String atitle = driver.getTitle();
		SoftAssert as=new SoftAssert();
		as.assertEquals(atitle,etitle);
		driver.close();
        as.assertAll();
			}
	}
