package com.Locators.qa;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utility.qa.BaseClass;

public class ServerPageLocator extends BaseClass {
	
	public ServerPageLocator() {
		PageFactory.initElements(driver, this);
			
		
	}
	
	@FindBy(xpath = "//div[@class='cat-banner-text']")
	public WebElement verfyServerPage;
	
	
	@FindBy(xpath = "//span[@class='mh-icon']")
	public WebElement clickontactus;
}
