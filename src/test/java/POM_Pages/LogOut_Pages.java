package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility_Method.Utility_Method_Tiger;

public class LogOut_Pages extends Utility_Method_Tiger{

	
	public LogOut_Pages(WebDriver driver) {
		PageFactory.initElements(driver ,this);
	}
	//Adminstration
		@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
		WebElement Admnistration;
		
		
		//Signout 
		@FindBy(xpath="//a[text()='Sign Out']")
		WebElement Sing_Out;
		
		//================MEthods====================
		public void Admin(WebDriver d) {
			
			 Action_clause(Admnistration,d);
			}
		
		public WebElement Log_out() {
		return Sing_Out;
		}
}


