package com.actitime.generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
  
	@Override
	public void onTestStart(ITestResult result) {
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
			}

	@Override
	public void onTestFailure(ITestResult result) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		TakesScreenshot t=(TakesScreenshot) driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dst=new File("./screenk/st.png");
		try {
			FileUtils.copyFile(src, dst);
		} catch (IOException e) {
			e.printStackTrace();
		}
			}
    @Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
			}

	@Override
	public void onStart(ITestContext context) {
			}

	@Override
	public void onFinish(ITestContext context) {
		
	}

}