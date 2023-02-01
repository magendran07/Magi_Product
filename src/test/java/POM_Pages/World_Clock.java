package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Utility_Method.Utility_Method_Tiger;

public class World_Clock extends Utility_Method_Tiger {
	
	public World_Clock(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//WorldClock
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Clock.gif']")
	WebElement clock;
	
	//Region of the clockk
	@FindBy(xpath="//select[@id='clockcity']")
	WebElement Region_Clock;
	
	
	//=============================Methods==================
	
	
	
	
	public WebElement Clock() {
		return clock;
	}
	
	public void Quick_Click(int i) {
		WebElement Drop=Region_Clock;
		Select select=new Select(Drop);
		select.selectByIndex(i);}
}

