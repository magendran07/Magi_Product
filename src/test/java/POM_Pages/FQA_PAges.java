package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility_Method.Utility_Method_Tiger;

public class FQA_PAges  extends Utility_Method_Tiger{
	
	public FQA_PAges(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//More_Option 
	@FindBy(xpath="//a[text()='More']")
	WebElement more;
	
	
	@FindBy(xpath="//a[@name='FAQ']")
	WebElement faq;
	
	public WebElement more_Option() {
		return more;
	}
	public WebElement FQA_Button() {
		return faq;
	}
}
