package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ProjectModule {
	@Test(priority=1)
	public void createmodule() {
	Reporter.log("createmodule",true);
	}
	@Test(priority=1)
	public void modifymodule(){
		Reporter.log("modifymodule",true);
	}
	public void deletemodule() {
		Reporter.log("deletemodule",true);
	}
}
