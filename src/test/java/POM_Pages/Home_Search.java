package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Utility_Method.Utility_Method_Tiger;

public class Home_Search  extends Utility_Method_Tiger{
	
	public Home_Search(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	////Search _Eelements 
	@FindBy(xpath="//input[@name='query_string']")
	WebElement search;
	
	//Drop_Down
	@FindBy(xpath="//select[@name='global_search_module']")
	WebElement Drop_Down;
	
	//===========================methods=========================
	
	
	
	public WebElement Search_Box() {
		return search;
	}
	public void Quick_Click(int i) {
		WebElement Drop=Drop_Down;
		Select select=new Select(Drop);
		select.selectByIndex(i);}

}
