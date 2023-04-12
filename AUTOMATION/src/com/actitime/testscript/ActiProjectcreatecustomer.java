package com.actitime.testscript;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.ActiProjectBaseClass;
import com.actitime.generic.ActiProjectfileLib;
import com.actitime.pom.ActiProjectTasktab;
import com.actitime.pom.ActiProjecthomepage;

public class ActiProjectcreatecustomer extends ActiProjectBaseClass  {
	@Test
	public void createcustomer() throws EncryptedDocumentException, IOException, InterruptedException {
		Reporter.log("createcustomer",true);
		ActiProjectfileLib f=new ActiProjectfileLib();
		String cusname = f.getExceldata("Sheet1", 1, 2);
		String cusdesc = f.getExceldata("Sheet1", 1, 3);
		ActiProjecthomepage h=new ActiProjecthomepage(driver);
		h.tasktab();
		ActiProjectTasktab t=new ActiProjectTasktab(driver);
		t.getNewbuttonbx().click();
		t.getNewcustomerbx().click();
		t.getEnterCustNamebx().sendKeys(cusname);
		t.getEnterdiscripbx().sendKeys(cusdesc);
		t.getSelectcustomerbx().click();
		t.getCustomername().click();
		t.getCreatenewcustomerbx().click();
		Thread.sleep(4000);
		String acctualtitle = t.getActualtitle().getText();
		Assert.assertEquals(acctualtitle, cusname);
		}

}
