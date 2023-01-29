package com.Actions.qa;

import org.openqa.selenium.interactions.Actions;

import com.Locators.qa.HomePageLocator;
import com.Utility.qa.BaseClass;

public class HomePageAction extends BaseClass {
	
	HomePageLocator homePageLocator = new HomePageLocator();
	
	 public void mouseoveronProducttogetServer() {
		 Actions ac= new Actions(driver);
		 ac.moveToElement(homePageLocator.mouseoverProduct).build().perform();
		 
	 }
	 
	 public void clickServer() {
		 homePageLocator.clickserver.click();
		 
	 }
	 
public void mouseoveronsigninlink() {
		 
		 Actions ac= new Actions(driver);
		 ac.moveToElement(homePageLocator.mouseoveronsignin).build().perform();
		 
		 
	 }
 public void clicksignin() {
	homePageLocator.signinclick.click();
	
}

	
}
