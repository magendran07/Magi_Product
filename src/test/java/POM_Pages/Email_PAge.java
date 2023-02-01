package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Email_PAge {
	
	public Email_PAge(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Email_Options
	@FindBy(xpath="//a[text()='Email']")
	WebElement Email_Button;
	
	//Mymail_Options
	@FindBy(xpath="//a[text()='My Mails']")
	WebElement Mymail;
	
		//Drop_Down
		@FindBy(xpath="//select[@id='_mbox_helper']")
		WebElement drop_Down;
		//Enter the Email
		@FindBy(xpath="//input[@class='detailedViewTextBox' and @name='_mbox_server']")
		WebElement Email_yahoo;
		
		@FindBy(xpath="//input[@id='_mbox_user']")
		WebElement user_Name;
		
		@FindBy(xpath="//input[@class='detailedViewTextBox' and @id='_mbox_pwd']")
		WebElement Passwords;
		//save_button
		@FindBy(xpath="//input[@class='small crmbutton save']")
		WebElement save_Button;
		
		//second dropdrown
		@FindBy(xpath="//select[@name='_mbox_refresh_timeout']")
		WebElement Drop_Down2;	
	//===================methods
		
		public void email_Search() {
			Email_Button.click();
		}
	public void my_mail() {
		Mymail.click();
	}
	public void Email_yahoo() {
		Email_yahoo.sendKeys("magendranmagi2008@gmail.com");
	}
	public void user_name() {
		user_Name.sendKeys("magendran");
	}
	public void Password() {
		Passwords.sendKeys("Mahesh2008");
	}
	public void Quick_Click(int i) {
		WebElement Drop=drop_Down;
		Select select=new Select(Drop);
		select.selectByIndex(i);}
	public void Quick_Click2(int i) {
		WebElement Drop=Drop_Down2;
		Select select=new Select(Drop);
		select.selectByIndex(i);}
	public void Save_Button() {
		save_Button.click();
	}
}
