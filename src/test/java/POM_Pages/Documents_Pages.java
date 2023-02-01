package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility_Method.Utility_Method_Tiger;

public class Documents_Pages extends Utility_Method_Tiger {
	
	public Documents_Pages (WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	
	//Documents 
	@FindBy(xpath="(//a[text()='Documents'])[1]")
	WebElement documents;
	
	//Chech_Box
	@FindBy(xpath="(//input[@type=\"checkbox\"])[2]")
	WebElement Check_box2;
	
	//delete 
	@FindBy(xpath="//input[@type='button' and @name='delete' ]")
	WebElement delete_Button;
	
	
	
	//===========================Methods==============================
	
	
	public WebElement Documents() {
		return documents;
	}
	
	public WebElement Check_Box2() {
		return Check_box2;
	}
	
	public WebElement delete_Button() {
		return delete_Button;
	}

}
