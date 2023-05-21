package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sam.BaseClass;

public class SigninPojo extends BaseClass {
	public SigninPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Create new account']")
	private WebElement createbutton;
	@FindBy(name = "firstname")
	private WebElement frstname;
	@FindBy(xpath = "(//input[@type='text'])[3]")
	private WebElement secondname;
	@FindBy(name = "reg_email__")
	private WebElement email;
	@FindBy(xpath = "(//input[@type='password'])[2]")
	private WebElement password;
	public WebElement getCreatebutton() {
		return createbutton;
	}
	public WebElement getFrstname() {
		return frstname;
	}
	public WebElement getSecondname() {
		return secondname;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}

}
