package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import Utility_Method.Base_Test;
import org.openqa.selenium.support.PageFactory;

import Utility_Method.Utility_Method_Tiger;

public class Login_page  extends Utility_Method_Tiger{
	
	public Login_page (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	//username for credentials
	@FindBy(name="user_name")
	WebElement username;
	
	//passwords for credentials
	@FindBy(name="user_password")
	WebElement passwords;
	
	//login_Button
	@FindBy(id="submitButton")
	WebElement submit;
	
	//=================================methods implementations================================
	//=========================================================================================
	//==========================================================================================
	
	public void username() {
		username.sendKeys("admin");
	}
	public void password() {
		passwords.sendKeys("admin");
	}
	public void submit() {
		submit.click();
	}
	
	
}
