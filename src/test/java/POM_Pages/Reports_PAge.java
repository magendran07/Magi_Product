package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility_Method.Utility_Method_Tiger;

public class Reports_PAge extends Utility_Method_Tiger {
	static WebDriver driver;
	public Reports_PAge (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//More Options
	@FindBy(xpath="//a[text()='More']")
	WebElement More_options;
	
	//Reports_PAge
	@FindBy(xpath="//a[@name='Reports']")	
	WebElement Reports_Page;
	
	//click_here_Text
	@FindBy(xpath="(//a[contains(@onclick,'fnvshob')])[3]")
	WebElement click_here;
	
	//foldername
	@FindBy(xpath="//input[@name='folderName']")
	WebElement foldername;
	
	//folder description
	@FindBy(xpath="//input[@name='folderDesc']")
	WebElement folderdisc;
	
	//save Button
	@FindBy(xpath="//input[@class='crmbutton small save']")
	WebElement save_Button;
	
	//=====================================methods implementations============================
	
	
	public void More_Options(WebDriver d) {
		Action_clause(More_options,d);
	}
	public void Report() {
		Action_clause(Reports_Page,driver );
	}
	
	public void click_Here() {
		click_here.click();
	}
	public void Folder_Name() {
		foldername.sendKeys("Banking");
	}
	public void Folder_Disc() {
		folderdisc.sendKeys("adding ");
	}
	public void save_Button() {
		save_Button.click();
	}

}
