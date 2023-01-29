package com.Actions.qa;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.Locators.qa.ContactusLocatorPage;
import com.Utility.qa.BaseClass;

public class ContactusActionPage extends BaseClass{
	
	ContactusLocatorPage contactusLocatorPage= new ContactusLocatorPage();
	
	 public void mverifycontactuspagedisplay() {
		 
		 boolean contactusverify=contactusLocatorPage.verifyContactus.isDisplayed();
		 Assert.assertTrue(contactusverify);
		 
		 
	 }
	 
	 
	 
}
