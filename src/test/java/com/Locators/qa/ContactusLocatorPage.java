package com.Locators.qa;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utility.qa.BaseClass;

public class ContactusLocatorPage extends BaseClass {
	
	public ContactusLocatorPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//h2[text()='We’re here to help']")
	public WebElement verifyContactus;
	
	

}
