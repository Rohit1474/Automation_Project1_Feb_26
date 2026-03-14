package com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Loginpom {

	@FindBy(xpath="//input[@id='user-name']")
	private WebElement Emailid;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement Password;
	
	@FindBy(xpath="//input[@id='login-button']")
	private WebElement btnlogin;

	public WebElement getEmailid() {
		return Emailid;
	}

		public WebElement getPassword() {
		return Password;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}
	
}
