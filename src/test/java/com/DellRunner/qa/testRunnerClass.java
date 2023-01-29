
package com.DellRunner.qa;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.Utility.qa.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features={"src/resource/test/Features"},
plugin = {"json:target/json.Cucumber"}, glue= "dellStepDeffPackage", tags= {"@test"})


public class testRunnerClass extends AbstractTestNGCucumberTests {
	
	@BeforeTest
	public void startURL() {
		BaseClass test= new BaseClass();
		test.initBrowser();
	}
	
	@AfterTest
	public void closedURL() {
		BaseClass test=  new BaseClass();
		test.driver.quit();
	}
	
	
}


