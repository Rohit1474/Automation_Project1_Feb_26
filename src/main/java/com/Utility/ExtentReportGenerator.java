package com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenerator {

	public static ExtentReports extent;
	public static ExtentReports getReports() {
		
		String filepath= "C:\\Users\\rohit\\eclipse-workspace\\Automation_Project1_Feb_26\\Reports\\index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(filepath);
		reporter.config().setDocumentTitle("Test Report1 Project1");
		reporter.config().setReportName("Project1 Automation Report");
		reporter.config().setTheme(Theme.DARK);
		
		
	
		 extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("ProjectName", "TestAutomationFeB");
		extent.setSystemInfo("QA", "Rohit");
		return extent;
	}
}
