package com.tt.StepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateAccount {
	@Given("^I need to have an email id and a password$")
	public void i_need_to_have_an_email_id_and_a_password() throws Throwable {
		System.setProperty("webdriver.gecko.driver", "/home/mahbub/WebDrivers/geckodriver_linux64/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=usflex&ignoreAuthState=1&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Ftag%3Damazusnavi-20%26hvadid%3D261614678572%26hvpos%3D1t1%26hvnetw%3Dg%26hvrand%3D9243378340721628336%26hvpone%3D%26hvptwo%3D%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9004429%26hvtargid%3Dkwd-10573980%26ref%3Dnav_signin&prevRID=6WM4XEPHFK6Q3XP0C0BX&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	}

	@When("^I enter my valid email id, and enter my valid password, and I confirm it$")
	public void i_enter_my_valid_email_id_and_enter_my_valid_password_and_I_confirm_it() throws Throwable {
	    
	}

	@Then("^I receive a confirmation email that the account has been created$")
	public void i_receive_a_confirmation_email_that_the_account_has_been_created() throws Throwable {
	    
	}

	@When("^I enter my invalid email id, and enter my invalid password, and I confirm it$")
	public void i_enter_my_invalid_email_id_and_enter_my_invalid_password_and_I_confirm_it() throws Throwable {
	    
	}

	@Then("^I am expecting an error message saying that ‘There was a problem; we cannot find an account with that email address$")
	public void i_am_expecting_an_error_message_saying_that_There_was_a_problem_we_cannot_find_an_account_with_that_email_address() throws Throwable {
	    
	}
}
