package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPagePOM1 {
	@FindBy(id="username")
	private WebElement untbx;
	@FindBy(name="pwd")
	private WebElement pwdbx;
	@FindBy(xpath="//div[.='Login ']")
	private WebElement lgbx;
	public void setvalue(String un,String pwd) {
		untbx.sendKeys(un);
		pwdbx.sendKeys(pwd);
		lgbx.click();
		}
}
