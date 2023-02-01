package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Utility_Method.Utility_Method_Tiger;

public class Colounm_Pages extends Utility_Method_Tiger {
	
	public Colounm_Pages(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Element
	@FindBy(xpath="//img[@src='themes/images/orgshar.gif']")
	WebElement Colounm;
	
	//DropDown Button
	@FindBy(xpath="//select[@class='small' and @id='layoutSelect']")
	WebElement Drop_down;
	
	//======================Methods======================
	
	public void Colounm_Click() {
		Colounm.click();
	}
	public void Quick_Click(int i) {
		WebElement Drop=Drop_down;
		Select select=new Select(Drop);
		select.selectByIndex(i);}
}
	
