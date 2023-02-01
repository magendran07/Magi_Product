package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Utility_Method.Utility_Method_Tiger;

public class Oppurtunities extends Utility_Method_Tiger{
	
	public Oppurtunities(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//Oppurtunities
	@FindBy(xpath="(//a[text()='Opportunities'])[1]")
	WebElement Oppurunity;
	
	@FindBy(xpath="//select[@name=\"search_field\"]")
	WebElement Drop_Down;
	
	@FindBy(xpath="//input[@name=\"submit\"]")
	WebElement Save_Buttton;

	//================================Methods==========================
	
	public WebElement Oppurunity_Button() {
		return Oppurunity;
	}
	
	public void Quick_Click(int i) {
		WebElement Drop=Drop_Down;
		Select select=new Select(Drop);
		select.selectByIndex(i);}
	
	public WebElement Save_Button() {
		return Save_Buttton;
	}
}




