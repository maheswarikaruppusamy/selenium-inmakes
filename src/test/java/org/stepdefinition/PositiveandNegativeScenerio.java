package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.sam.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class PositiveandNegativeScenerio extends BaseClass {
	@Given("user should launch the browser and maximise the window")
	public void user_should_launch_the_browser_and_maximise_the_window() {
		lauchBrowser();
		windowMaximize();
	    
	}

	@When("user should hit the url of the facebook")
	public void user_should_hit_the_url_of_the_facebook() {
		lauchUrl("https://en-gb.facebook.com/login/");
	}

	@When("user should pass the valid data{string} in email feild")
	public void user_should_pass_the_valid_data_in_email_feild(String string) {
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("mahessenthil24@gmail.com");
	}

	@When("user should pass the invalid data {string}in password feild")
	public void user_should_pass_the_invalid_data_in_password_feild(String string) {
		WebElement pass = driver.findElement(By.name("pass"));
		pass.sendKeys("1234567");
	}

	@When("User should click the login button")
	public void user_should_click_the_login_button() {
		WebElement login = driver.findElement(By.name("login"));
		login.click();
	}

	@When("user should close the entire browser")
	public void user_should_close_the_entire_browser() {
	    closeEntrireBrowser();
	}




}
