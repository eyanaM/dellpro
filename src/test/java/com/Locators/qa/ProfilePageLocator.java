package com.Locators.qa;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utility.qa.BaseClass;

public class ProfilePageLocator extends BaseClass {
	
	public ProfilePageLocator() {
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy(id = "um-si-label")
	public WebElement profiledisplay;

}
