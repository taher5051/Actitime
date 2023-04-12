package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTrip {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.cleartrip.com/");
	driver.findElement(By.xpath("(//div[contains(@class,'px-1')])[3]")).click();
	driver.findElement(By.xpath("//div[.='Flights']")).click();
	driver.findElement(By.xpath("//input[@placeholder='Where from?']")).click();
	driver.findElement(By.xpath("//p[.='Bangalore, IN - Kempegowda International Airport (BLR)']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@placeholder='Where to?']")).click();
	driver.findElement(By.xpath("//p[.='Goa, IN - Dabolim Airport (GOI)']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='flex flex-middle p-relative homeCalender']")).click();
	driver.findElement(By.xpath("(//div[@class='DayPicker-Months']//diV[text()='1'])[2]")).click();
	driver.findElement(By.xpath("//div[.='Search flights']")).click();
	List<WebElement> flightname = driver.findElements(By.xpath("//div[@class='flex flex-column ms-grid-column-1 flex-center mt-4']//p[1]"));
	List<WebElement> flighdttime = driver.findElements(By.xpath("//p[@class='m-0 fs-5 fw-400 c-neutral-900']"));
	int count = flighdttime.size();
	System.out.println(count);
	for(int i=0;i<count;i++) {
		System.out.println(flightname.get(i).getText()+flighdttime.get(i).getText());
	}
	
		
		
	}
}

}
