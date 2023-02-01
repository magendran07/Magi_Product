package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility_Method.Utility_Method_Tiger;

public class Leads_PAge extends Utility_Method_Tiger {
	public Leads_PAge(WebDriver driver) {

		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[@href='index.php?module=Leads&action=index']")
	WebElement Leads;
	 
	public void Leads() {
		Leads.click();
	}
	@FindBy(xpath="//input[@class=\"txtBox\"]")
	WebElement Search;
	
	public void Search(String value) {
		Search.sendKeys(value);
	}
}