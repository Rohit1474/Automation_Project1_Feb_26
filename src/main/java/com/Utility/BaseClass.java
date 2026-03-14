package com.Utility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static ConfigDataProvider config;
	 public static ExcelDataProvider excel;
	@BeforeSuite
	public void BS() throws IOException {
    config=new ConfigDataProvider();
    excel=new ExcelDataProvider();
	}
	
	@Parameters({"BrowserName"})
@BeforeMethod
public void OpenBrowser(String BrowserName) {
	//browser open
	if(BrowserName.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
	}
	else if(BrowserName.equalsIgnoreCase("Edge")) {
		WebDriverManager.edgedriver().setup();
		 driver=new EdgeDriver();
	}
	//We have created an object of congog data provider hence we wre removing the hardcoded url 
	 //driver.get("https://www.saucedemo.com/");
	driver.get(config.getBaseUrl_stage());
	 driver.manage().window().maximize();
	
}
@AfterMethod
public void TearDown() {
	driver.quit();
	
}
}
