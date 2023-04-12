package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiProjectTasktab {
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement newbuttonbx;
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newcustomerbx;
	@FindBy(xpath="//input[@placeholder='Enter Customer Name' and @autocomplete='off']")
	private WebElement EnterCustNamebx;
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement enterdiscripbx;
	@FindBy(xpath="(//div[text()='- Select Customer -'])[1]")
	private WebElement selectcustomerbx;
	@FindBy(xpath="(//div[text()='abcd'])[2]")
	private WebElement customername;
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createnewcustomerbx;
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[1]")
	private WebElement actualtitle;

	public ActiProjectTasktab(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getNewbuttonbx() {
		return newbuttonbx;
	}
	public WebElement getNewcustomerbx() {
		return newcustomerbx;
	}
	public WebElement getEnterCustNamebx() {
		return EnterCustNamebx;
	}
	public WebElement getEnterdiscripbx() {
		return enterdiscripbx;
	}
	
	public WebElement getSelectcustomerbx() {
		return selectcustomerbx;
	}
	
	public WebElement getCreatenewcustomerbx() {
		return createnewcustomerbx;
	}
	public WebElement getCustomername() {
		return customername;
	}
	public WebElement getActualtitle() {
		return actualtitle;
	}
}
