package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility_Method.Utility_Method_Tiger;

public class Setting_Pages  extends Utility_Method_Tiger{
	
	public Setting_Pages (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	
	///Setting_Pages
	@FindBy(xpath="//img[@src='themes/softed/images/mainSettings.PNG']")
	WebElement Setting_pages;
	
	//Setting Option
	@FindBy(xpath="//a[text()='CRM Settings']")
	WebElement Setting_option;
	
	//Sharing Access
	@FindBy(xpath="(//a[@href=\"index.php?module=Settings&action=OrgSharingDetailView&parenttab=Settings\"])[2]")
	WebElement Sharing_access;
	
	//Recalculate
	@FindBy(xpath="//input[@name='recalculate']")
	WebElement Recalculate;
	
	//Yes_Option
	@FindBy(xpath="//input[@value='Yes']")
	WebElement Yes_option;
	
	
	//===========================MEthods
	
	public void Setting_Option(WebDriver d) {
		 Action_clause(Setting_pages, d);
		 }
	public WebElement  Option_Select() {
		return Setting_option;
	}
	public WebElement Sharing_Options() {
		 return Sharing_access;
	}
	public WebElement Recalculate_Button() {
		return Recalculate;
	}
	public WebElement Yes_Option() {
		return Yes_option;
	}
}
