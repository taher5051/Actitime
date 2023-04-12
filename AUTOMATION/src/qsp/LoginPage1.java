package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage1 {
private WebElement untb;  //declaration
private WebElement pwdb;
private WebElement loginb;
public LoginPage1(WebDriver driver) {
	untb=driver.findElement(By.id("username")); //initialization
	pwdb=driver.findElement(By.name("pwd"));
	loginb=driver.findElement(By.xpath("//div[.='Login ']"));
}
//public void setvalue(String un) {
  //untb.sendKeys(un);	
//}
//public void setvalue1(String pwd) {
	//pwdb.sendKeys(pwd);
//}
//public void setvalue2() {
	//loginb.click();
//}
//}
  public void setvalue(String un,String pwd) {
	  untb.sendKeys(un);
	  pwdb.sendKeys(pwd);
	  loginb.click();
}
}
