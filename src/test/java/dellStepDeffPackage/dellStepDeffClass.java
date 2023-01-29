package dellStepDeffPackage;

import com.Actions.qa.ContactusActionPage;
import com.Actions.qa.HomePageAction;
import com.Actions.qa.ProfilePageActon;
import com.Actions.qa.ServerPageAction;
import com.Actions.qa.SigninPageAction;
import com.Utility.qa.BaseClass;
import com.Utility.qa.Utility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class dellStepDeffClass extends BaseClass {
	
	  HomePageAction homePageAction= new HomePageAction();
	  ServerPageAction serverPageAction = new ServerPageAction();
	  ContactusActionPage contactusActionPage = new ContactusActionPage();
	  SigninPageAction signinPageAction = new SigninPageAction();
	  ProfilePageActon profilePageActon = new ProfilePageActon();
	
	@Given("^launch application <\"([^\"]*)\">$")
	public void launch_application(String URL) throws Throwable {
		LaunchURL(URL);
		Utility.takeMyScreenshot(driver, "Home page");
	   
	}

	@Then("^MouseOver on Product to get Server$")
	public void mouseover_on_Product_to_get_Server() throws Throwable {
		
		homePageAction.mouseoveronProducttogetServer();
		
		
	}

	@Then("^click Server$")
	public void click_Server() throws Throwable {
		homePageAction.clickServer();
	    
	}

	@Then("^Verify Server page dispaly$")
	public void verify_Server_page_dispaly() throws Throwable {
		
		serverPageAction.verifyServerpagedispaly();
		Utility.takeMyScreenshot(driver, "Server Page");
	}

	@Then("^click contact us link$")
	public void click_contact_us_link() throws Throwable {
		serverPageAction.clickcontactuslink();
	  
	}

	@Then("^verify contact us page display$")
	public void verify_contact_us_page_display() throws Throwable {
		contactusActionPage.mverifycontactuspagedisplay();
		Utility.takeMyScreenshot(driver, "Contact us Page");
	   
	}

	@Then("^MouseOver on sign in link$")
	public void mouseover_on_sign_in_link() throws Throwable {
		homePageAction.mouseoveronsigninlink();
		
	}

	@Then("^click sign in$")
	public void click_sign_in() throws Throwable {
		homePageAction.clicksignin();
	    
	}

	@Then("^enter Email address$")
	public void enter_Email_address() throws Throwable {
		signinPageAction.enterEmailaddress();
	   
	}

	@Then("^ebter Password$")
	public void ebter_Password() throws Throwable {
		signinPageAction.ebterPassword();
		
		Utility.takeMyScreenshot(driver,"sign in page");
	  
	}
	
	@Then("^click singin button$")
	public void click_singin_button() throws Throwable {
		signinPageAction.clicksinginbutton();
		
	}

	@Then("^Verify user succesfully sign in$")
	public void verify_user_succesfully_sign_in() throws Throwable {
		profilePageActon.verifyusersuccesfullysignin();
		
		
		
	}



}
