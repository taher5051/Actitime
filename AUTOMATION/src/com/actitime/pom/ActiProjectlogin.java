package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiProjectlogin {
	@FindBy(id="username")
	private WebElement untbx;
	@FindBy(name="pwd")
	private WebElement pwtbx;
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement lgbx;
	public ActiProjectlogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	public void setlogin(String un,String pwd) {
		untbx.sendKeys(un);
		pwtbx.sendKeys(pwd);
		lgbx.click();
	}
}
