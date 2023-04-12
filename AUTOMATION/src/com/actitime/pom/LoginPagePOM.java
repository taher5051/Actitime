package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOM {
	@FindBy(id="username")
	private WebElement untbx;
	@FindBy(name="pwd")
	private WebElement pwdbx;
	@FindBy(xpath="//div[.='Login ']")
	private WebElement lgbx;
	public LoginPagePOM(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void setvalue(String un,String pwd) {
		untbx.sendKeys(un);
		pwdbx.sendKeys(pwd);
		lgbx.click();
}
}
