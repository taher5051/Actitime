package com.actitime.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.actitime.generic.Listener.class)
public class CustomerModuleL {
@Test
public void createcustomer(){
	Reporter.log("createcustomer",true);
	Assert.fail();
}
}
