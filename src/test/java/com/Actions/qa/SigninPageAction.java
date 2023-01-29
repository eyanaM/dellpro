package com.Actions.qa;

import com.Locators.qa.SigninPageLocator;
import com.Utility.qa.BaseClass;

public class SigninPageAction extends BaseClass {
	
	SigninPageLocator signinPageLocator = new SigninPageLocator();
	
	
	
	public void enterEmailaddress() {
		signinPageLocator.enterEmailAddress.sendKeys("rozarioeyana@gmail.com");
		
		
	}
	
	public void  ebterPassword () {
		
		signinPageLocator.enterPassword.sendKeys("Dmatt123");
		
	}

	public void clicksinginbutton() {
		signinPageLocator.btnsininclick.click();
		
	}


}
