package com.Utility;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listeners extends BaseClass implements ITestListener {

ExtentReports extent =	ExtentReportGenerator.getReports();
//Sare test cases single report attach threadlocal 
ThreadLocal<ExtentTest> extenttest=new ThreadLocal<ExtentTest>();	
	@Override
	public void onTestStart(ITestResult result) {
		Library.test=extent.createTest(result.getTestClass().getName()+"=="+result.getMethod().getMethodName());
		extenttest.set(Library.test);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		extenttest.get().log(Status.PASS, "Test Case Pass");
		extenttest.get().addScreenCaptureFromBase64String(getCapture());
	}

	@Override
	public void onTestFailure(ITestResult result) {
	extenttest.get().log(Status.FAIL, "Test Case Fail");
	extenttest.get().addScreenCaptureFromBase64String(getCapture());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		extenttest.get().log(Status.SKIP, "Test Case Skipped");
	}

	@Override
	public void onFinish(ITestContext context) {
	extent.flush();
	}
	
public String getCapture() {

	TakesScreenshot ts =(TakesScreenshot) driver;
	return ts.getScreenshotAs(OutputType.BASE64);
}
}
