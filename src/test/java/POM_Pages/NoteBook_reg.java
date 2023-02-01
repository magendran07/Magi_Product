package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility_Method.Utility_Method_Tiger;

public class NoteBook_reg extends Utility_Method_Tiger {
	
	public NoteBook_reg(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//Enter the register name
	@FindBy(xpath="(//input[@class='detailedViewTextBox'])[1]")
	WebElement reg_name;

		//Enter the date
		@FindBy(xpath="(//input[@value='2023-01-24'])[1]")
		WebElement date;
		
		//Select the radio-Button
		@FindBy(xpath="//input[@name='assigntype'  and @value='U']")
		WebElement radio;

		//Select the adminstration
		@FindBy(xpath="//select[@name='assigned_user_id']")
		WebElement admin;
		
		@FindBy(xpath="//img[@src='themes/softed/images/select.gif']")
		WebElement plus_button; 
		
		//=============================methods========================
		
		
		public void enter_name() {
			reg_name.sendKeys("magendran");
		}
		public void date_registe() {
			date.sendKeys("1998-02-22");
		}
		public void radio_button() {
			radio.click();
		}
		public void adminstration() {
			select_by_value(admin, " Administrator");
		}
		public void plus_button(WebDriver d) {
			Action2_clause(plus_button, d);
		}
}	
		