package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TaskModule {
    @Test
	public void cratetask() {
    	Reporter.log("cratetask",true);
    }
    @Test
    public void modifytask(){
    	Reporter.log("modifytask",true);
    }
    @Test
    public void deletetask() {
    	Reporter.log("deletetask",true);
    }

}
