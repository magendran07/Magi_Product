package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DashBoards_Page {
	
	public  DashBoards_Page (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//Dashboard
	@FindBy(xpath="//a[text()='Dashboard']")
	WebElement Dashboard;
	
	//dropdown
	@FindBy(xpath="(//select[@name='dashordlists'])[2]")
	WebElement dropdown;
	
	//
	
	//======================Methods======================
	
	public void DashBoard() {
		Dashboard.click();
	}
	public void Quick_Click(int i) {
		WebElement Drop=dropdown;
		Select select=new Select(Drop);
		select.selectByIndex(i);}
}
