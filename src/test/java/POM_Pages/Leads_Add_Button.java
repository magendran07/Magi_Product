package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility_Method.Utility_Method_Tiger;

public class Leads_Add_Button extends Utility_Method_Tiger {

	public Leads_Add_Button (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//Add 
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	WebElement Add_Button;
	
	//salution
	@FindBy(xpath="//select [@name='salutationtype']")
	WebElement saluation;

	//firstname
	@FindBy(xpath="@FindBy(xpath=\"//select [@name='salutationtype']\")")
	WebElement Firstname;
}
