package com.Actions.qa;

import org.testng.Assert;

import com.Locators.qa.ProfilePageLocator;
import com.Utility.qa.BaseClass;

public class ProfilePageActon extends BaseClass {
	ProfilePageLocator profilePageLocator = new ProfilePageLocator();
	
	
	public void verifyusersuccesfullysignin() {
		boolean resultverify= profilePageLocator.profiledisplay.isDisplayed();
		Assert.assertTrue(resultverify);
		
		
	}

}
