package POM_Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility_Method.Utility_Method_Tiger;

public class Map_Pages  extends Utility_Method_Tiger{
	
	public Map_Pages(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//MapPAGes
	@FindBy(xpath="//img[@src='cache/images/vert_']")
	WebElement MapPages;
	
	//
	
	
	public void MapPages(WebDriver d) {
		Action_clause(MapPages, d);
	}
}
