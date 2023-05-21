package org.stepdefinition;
//
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.sam.BaseClass;
//
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class FBLogin extends BaseClass{
	@Given("To launch the browser and maximise the window.")
	public void to_launch_the_browser_and_maximise_the_window() {
		lauchBrowser();
		windowMaximize();
	    
	}
//
	@When("To lanch the url of the facebook.")
	public void to_lanch_the_url_of_the_facebook() {
		lauchUrl("https://en-gb.facebook.com/login/");
	   
	}

	@When("To pass the valid username and valid password.")
	public void to_pass_the_valid_username_and_valid_password() {
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("mahessenthil24@gmail.com");
		WebElement pass = driver.findElement(By.name("pass"));
		pass.sendKeys("1234567");
	    
	}
//
	@When("To click the login button.")
	public void to_click_the_login_button() {
		WebElement login = driver.findElement(By.name("login"));
		login.click();
	    
	}

	@When("To check whether page is navigate to home page or not.")
	public void to_check_whether_page_is_navigate_to_home_page_or_not() {
		System.out.println("your home page is");
//	    
	}
//
	@When("To close the entire browser.")
	public void to_close_the_entire_browser() {
	    closeEntrireBrowser();
	}
//
//
	
}
