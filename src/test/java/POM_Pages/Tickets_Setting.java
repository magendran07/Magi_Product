package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Utility_Method.Utility_Method_Tiger;

public class Tickets_Setting  extends Utility_Method_Tiger{
	
	public Tickets_Setting (WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	
	//Trouble_Tickets 
		@FindBy(xpath="(//a[text()='Trouble Tickets'])[1]")
		WebElement Trouble_Tickets;
	
	//Setting Icon
	@FindBy(xpath="//img[@alt='Trouble Tickets Settings']")
	WebElement Setting;
	
	//ToolTip_Management
	@FindBy(xpath="//a[contains (text(),'Tooltip Management')]")
	WebElement Tool_Tip;
	
	//Drop_Down
	@FindBy(xpath="//select[@name='pick_field']")
	WebElement Drop_down1;
	
	//==========================Methods==================
	
	public WebElement Trible_Tickets() {
		return Trouble_Tickets;
	}
	
	public WebElement Setting_Tickets() {
		return Setting;
	}
	public WebElement Tool_Tip_Suggestion() {
		return Tool_Tip;
	}
	public void Quick_Click(int i) {
		WebElement Drop=Drop_down1;
		Select select=new Select(Drop);
		select.selectByIndex(i);}

}
