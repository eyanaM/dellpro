package com.Actions.qa;

import org.testng.Assert;

import com.Locators.qa.ServerPageLocator;
import com.Utility.qa.BaseClass;

public class ServerPageAction extends BaseClass{
	ServerPageLocator serverPageLocator = new ServerPageLocator();
	
	
	 public void verifyServerpagedispaly() {
		boolean serverresult= serverPageLocator.verfyServerPage.isDisplayed();
		Assert.assertTrue(serverresult);
		 
		 
	 }
	 public void clickcontactuslink() {
		 serverPageLocator.clickontactus.click();
		 
	 }
}
