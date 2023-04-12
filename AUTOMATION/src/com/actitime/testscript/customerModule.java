package com.actitime.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.Baseclass;

public class customerModule extends Baseclass {
	@Test
	public void creatcustomer() {
		Reporter.log("creatcustomer",true);
	}
	@Test
	public void modifycustomer(){
		Reporter.log("modifycustomer",true);
		}
	@Test
	public void deletecustomer(){
		Reporter.log("deletecustomer",true);
	}
}
