package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Utility_Method.Utility_Method_Tiger;

public class New_HomePage extends Utility_Method_Tiger {
	
	
		public New_HomePage (WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		@FindBy(xpath="//a[@href='index.php?module=Calendar&action=index']")
		WebElement Calendar;

		public void Calendar() {
			Calendar.click();
		}
		@FindBy(xpath="//a[@href='index.php?module=Leads&action=index']")
		WebElement Leads;
		 
		public void Leads() {
			Leads.click();
		}

		@FindBy(xpath="//a[@href='index.php?module=Accounts&action=index']")
		WebElement org;

		public void org() {
			org.click();
		}

		@FindBy(xpath="//a[@href='index.php?module=Contacts&action=index']")
		WebElement contact;

		public void contact() {
			contact.click();
		}

		@FindBy(xpath="//a[@href='index.php?module=Potentials&action=index']")
		WebElement opportunity;

		public void opportunity() {
			opportunity.click();
		}
		@FindBy(xpath="//a[@href='index.php?module=Products&action=index']")
		WebElement products;

		public void products() {
			products.click();
		}
		@FindBy(xpath="//a[@href=\"index.php?module=Documents&action=index\"]")
		WebElement Document;

		public void Document() {
			Document.click();
		}
		@FindBy(xpath="//a[@href=\"index.php?module=Emails&action=index\"]")
		WebElement Email;

		public void Email() {
		Email.click();
		}
		@FindBy(xpath="//a[@href=\"index.php?module=HelpDesk&action=index\"]")
		WebElement Trouble;

		public void Trouble() {
			Trouble.click();
		}
		@FindBy(xpath="//a[@href=\"index.php?module=Dashboard&action=index\"]")
		WebElement Dash;

		public void Dash() {
			Dash.click();
		}
		@FindBy(xpath="//img[@src=\"themes/softed/images/menuDnArrow.gif\"]")
		WebElement More;

		public WebElement More() {
			return More;
		}
		@FindBy(xpath="//select[@id='qccombo']")
		public WebElement quick;

		public void Quick_Click(int i) {
			WebElement Drop=quick;
			Select select=new Select(Drop);
			select.selectByIndex(i);}

		@FindBy(xpath="//input[@name='accountname']")
		WebElement quick1;

		public void quick1(String value) {
			quick1.sendKeys(value);
		}
		@FindBy(xpath="//input[@id=\"phone\"]")
		WebElement quick2;

		public void quick2(String value) {
			quick2.sendKeys(value);
		}
		@FindBy(xpath="//input[@name=\"website\"]")
		WebElement quick3;

		public void quick3(String value) {
			quick3.sendKeys(value);
		}
		@FindBy(xpath="//input[@onclick=\"this.form.action.value='Save';  if(getFormValidate())AjaxDuplicateValidate('Accounts','accountname',this.form);\"]")
		WebElement quick4;

		public void quick4() {
			quick4.click();
		}
		@FindBy(xpath="//img[@src=\"themes/softed/images/user.PNG\"]")
		WebElement Logout;

		public WebElement Logout() {
			return Logout;
		}
		@FindBy(xpath="//a[@href=\"index.php?module=Users&action=Logout\"]")
		WebElement Logout1;

		public  WebElement Logout1() {
		 return Logout1;
		}

}
