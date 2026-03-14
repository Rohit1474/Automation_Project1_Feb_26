package com.Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Library {

	 public static ExtentTest test;
	 //public ExtentTest extent;
	public static void custom_sendkeys(WebElement element, String value, String fieldname) {
		try {
		element.sendKeys(value);
		test.log(Status.PASS, fieldname + "=> Values Sucessfully send => "+value);		
		//System.out.println("Value pass");
	}catch(Exception e) { 
		test.log(Status.FAIL,fieldname + "=> Value unable to send => "+e);
		//System.out.println("Unable to send value "+e);
	}
}
	public static void custom_click(WebElement element, String fieldname) {
		try {
			element.click();
			test.log(Status.PASS, fieldname + " => Clicked successfully=>" );
		}catch(Exception e) {
			test.log(Status.FAIL,fieldname + "Unable to click=>" +fieldname);
			//System.out.println("Unable to click  "+e);
		}
		
	}
		public static void custom_handlwDropDown(WebElement element, String text, String fieldname) {
			try {
				Select select =new Select(element);
				select.selectByVisibleText(text);
			}
			catch(Exception e) {
				System.out.println("Unable to handle DropDown  "+e);
			}
			
		}
	}

