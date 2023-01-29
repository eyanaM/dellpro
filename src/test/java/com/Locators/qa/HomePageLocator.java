package com.Locators.qa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utility.qa.BaseClass;

public class HomePageLocator extends BaseClass {
 public HomePageLocator() {
	 PageFactory.initElements(driver,this);
 }
 @FindBy(xpath = "//span[text()='Products']")
 public WebElement mouseoverProduct;

 @FindBy(linkText = "Servers")
 public WebElement clickserver;
 
 @FindBy(id = "um-si-label")
 public WebElement mouseoveronsignin;
 
 @FindBy(xpath = "//a[@href='//www.dell.com/Identity/global/LoginOrRegister/98254675-AC6F-47D9-A7E4-4537724F135D?c=us&l=en&r=us&s=corp&redirectUrl=']")
 public WebElement signinclick;
 

}
