package com.Utility.qa;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
 public BaseClass() {
	 
	 try {
		FileInputStream fls = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\com\\Config\\qa\\DellconfigFile.properties");
		 prop= new Properties();
		 prop.load(fls);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	
}
 
  public void initBrowser() {	  
	 String Browserset= prop.getProperty("Browser1");
	 
	 if(Browserset.equals("ChromeDriver")) {
	  
	  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestData.ImplicitlyWait));
	  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestData.pageLoadTimeOut));
	}
	 else if (Browserset.equals("FireFox")) {
	  
	  
 }
 }
 public static void LaunchURL(String URL) {
	  driver.get(prop.getProperty("URL"));	  
 }  
}