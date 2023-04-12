package com.actitime.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class customermodule1 {
	@Test(priority=2)
	public void createcustomer() {
	Reporter.log("createcustomer",true);
	}
   @Test(priority=3)
   public void modifycustomer() {
   Reporter.log("modifycustomer",true);
   }
   @Test(priority=1,dependsOnMethods="createcustomer")
   public void deletecustomer() {
   Reporter.log("deletecustomer",true);
   }
}
