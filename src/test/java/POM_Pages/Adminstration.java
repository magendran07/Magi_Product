package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility_Method.Utility_Method_Tiger;

public class Adminstration  extends Utility_Method_Tiger{

	public Adminstration(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//Adminstration
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	WebElement Admnistration;
	
	//my_Preference
	@FindBy(xpath="//a[@id='_my_preferences_']")
	WebElement My_Preference;
	
	//Edit
	@FindBy(xpath="//a[@class='link' and  @align='right']")
	WebElement Edit_Button;
	
	@FindBy(xpath="//input[@name='email1']")
	WebElement Email;
	
	
	//save_Button
		@FindBy(xpath="//input[@class='crmbutton small save' and @name='button_Email' ]")
		WebElement Save_button;
		
	//Firstname
	@FindBy(xpath="//td[@class='dvtCellInfo' and @id='mouseArea_First Name']")
	WebElement firstname;
	
	//Firstname_credentials
	@FindBy(xpath="//input[@id=\"txtbox_First Name\"]")
	WebElement Firstname_Crendentials;
	
	//Save_Button_Firstname
	@FindBy(xpath="//input[@name='button_First Name']")
	WebElement Save_Firstname;
	
	//methods
	
	
	public void Admin(WebDriver d) {
		
	 Action_clause(Admnistration,d);
	}
	public  WebElement My_Preference_ICon() {
		return My_Preference;
	}
	public void  Email_Edit(WebDriver d) {
	Action_clause(Edit_Button, d);
	}
	public  WebElement Email_Credentials() {
		return Email;
	}
	public WebElement Save_Button() { 
	return Save_button;
}
	public void  Firstname(WebDriver d) {
		Action_clause(firstname,d);
	}
	public WebElement Firstname_give() {
		return Firstname_Crendentials;
	}
	public WebElement Save_Firstname() {
		return Save_button;
	}
	
}