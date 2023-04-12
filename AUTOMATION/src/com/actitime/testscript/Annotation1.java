package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation1 {
	@AfterMethod
	   public void logout() {
		   Reporter.log("logout",true);
	   }
	 @BeforeMethod
	   public void login() {
		   Reporter.log("login",true);
	   }
	@Test
	public void createccustomer() {
		Reporter.log("createccustomer",true);
	}
   @Test
   public void modifycustomer() {
	   Reporter.log("modifycustomer",true);
   }
   @Test
   public void deletecustomer() {
	   Reporter.log("deletecustomer",true);
   }
  
}
