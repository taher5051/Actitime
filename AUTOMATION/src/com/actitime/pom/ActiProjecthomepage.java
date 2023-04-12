package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiProjecthomepage {
	@FindBy(id="logoutLink")
	private WebElement lgoutbx;
	@FindBy(xpath="//div[text()='Tasks']")
	private WebElement taskbx;
    public ActiProjecthomepage(WebDriver driver) {
    	PageFactory.initElements(driver, this);
    }
    public void setlogout() {
    	lgoutbx.click();
    	}
    public void tasktab() {
    	taskbx.click();
    }
}
