package com.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.Loginpom;
import com.Utility.BaseClass;
import com.Utility.Library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Test_001<excel> extends BaseClass {
	//WebDriverManager driver;
@Test
public void verify_001() {
	
	
	//emailid
	//pass
	//login
	Loginpom login=PageFactory.initElements(driver, Loginpom.class);
	//login.getEmailid().sendKeys("Test@123.com");
	//login.getPassword().sendKeys("Password");
	//login.getBtnlogin().click();
	
	
	
	//Step 3 getting data from an excel sheet for enter in the username & pwd field
	Library.custom_sendkeys(login.getEmailid(),excel.getStringData("Sheet1", 0, 0), "Emailid");
	Library.custom_sendkeys(login.getPassword(),excel.getStringData("Sheet1", 0, 1), "Password");
	
	
	
	//calling library class step 2
	
	//Library.custom_sendkeys(login.getEmailid(), "Test@123.com");
	//Library.custom_sendkeys(login.getPassword(), "Password");
	Library.custom_click(login.getBtnlogin(), "Login Button");
	//WebElement emailid=driver.findElement(By.xpath("//input[@id='user-name']"));
	//emailid.sendKeys("Test@123.com");
	//WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
	//password.sendKeys("Password");
	//WebElement btnlogin=driver.findElement(By.xpath("//input[@id='login-button']"));
	//btnlogin.click();
	
	
	
	
	System.out.println("I am Test_001 Method");
}

}
