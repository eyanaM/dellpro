package com.Locators.qa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utility.qa.BaseClass;

public class SigninPageLocator extends BaseClass {
	
	
	
	public SigninPageLocator() {
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy(id = "SignInModel_EmailAddress")
	public WebElement enterEmailAddress;
	
	@FindBy(id = "userPwd_UserInputSecret")
	public WebElement enterPassword;
	
	@FindBy(xpath = "//input[@value='Sign In']")
	public WebElement btnsininclick;
	
	
	
	
	

}
