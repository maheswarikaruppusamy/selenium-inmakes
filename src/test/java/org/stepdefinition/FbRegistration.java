package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.pojo.SigninPojo;
import org.sam.BaseClass;
import io.cucumber.datatable.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FbRegistration extends BaseClass {
	SigninPojo s;
	@Given("To launch the browser and maximize the window")
	public void to_launch_the_browser_and_maximize_the_window() {
	    lauchBrowser();
	    windowMaximize();
	}

	@When("To launch the url of facebook")
	public void to_launch_the_url_of_facebook() {
		lauchUrl("https://www.facebook.com/");
	  
	}

	@When("To click the create new account button")
	public void to_click_the_create_new_account_button() {
		s=new SigninPojo();
		clickBtn(s.getCreatebutton());
	   
	}

	@When("To pass the first name in the first textbox")
	public void to_pass_the_first_name_in_the_first_textbox(DataTable d) throws InterruptedException {
		Thread.sleep(3000);
		Map<String, String> m = d.asMap(String.class, String.class);
	    s=new SigninPojo();
	    passtxt(m.get("firstname2"), s.getFrstname());
	}

	@When("To pass the second name in the second textbox")
	public void to_pass_the_second_name_in_the_second_textbox() {
		s=new SigninPojo();
		passtxt("selenium", s.getSecondname());
	  
	}

	@When("To pass the mobile number and email in email textbox")
	public void to_pass_the_mobile_number_and_email_in_email_textbox() {
	
		s=new SigninPojo();
		passtxt("mahes@gmail.com", s.getEmail());
	   
	}

	@When("To pass the password in the password textbox")
	public void to_pass_the_password_in_the_password_textbox(DataTable d) {
		List<Map<String, String>> m = d.asMaps(String.class, String.class);
		s=new SigninPojo();
		passtxt(m.get(1).get("password1"), s.getPassword());
	    
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
		//closeEntrireBrowser();
	   
	}



}
