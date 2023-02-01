package POM_Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Utility_Method.Base_Test;
import Utility_Method.Utility_Method_Tiger;

public class Vtiger_Pages extends Utility_Method_Tiger {
	
	public class vtiger_page extends Base_Test{
		public vtiger_page(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		
		
		//================Web elements or Property================
		@FindBy(xpath="(//img[@border='0'])[6]")
		WebElement Home_button;
		
		@FindBy(xpath = "//input[@name='user_name']") 
		WebElement username;
		
		@FindBy(xpath = "//input[@name='user_password']") 
		WebElement password;
		
		
		@FindBy(xpath = "//input[@id='submitButton']") 
		WebElement login_button;
		
		@FindBy(xpath="//input[@name='query_string']")
		WebElement search_text_field;
		
		@FindBy(xpath="//input[@class='searchBtn' and @title='Find']")
		WebElement search_icon;
		
		@FindBy(xpath="(//a[text()='Contacts'])[1]")
		WebElement contacts_tab;
		
		@FindBy(xpath="//input[@class='txtBox']")
		WebElement contacts_search_textfield;
		
		@FindBy(xpath="(//a[text()='Email'])[1]")
		WebElement Email_tab;
		
		@FindBy(xpath="//input[@name='search_text']")
		WebElement Email_Textfield;
		
		@FindBy(xpath="//input[@class='crmbutton small create']")
		WebElement Find_button;
		
		@FindBy(xpath="(//select[@id='bas_searchfield'])[1]")
		public WebElement Contacts_In_dropdown;
		
		@FindBy(xpath="//img[@title='Show World Clock...']")
		WebElement World_clock_icon;
		
		@FindBy(xpath="(//img[@align='absmiddle'])[1]")
		WebElement cancel_World_clock_icon;
		
		@FindBy(xpath="//img[@title='Open Calculator...']")
		WebElement calculator_icon;
		
		@FindBy(xpath="//input[@name='calc6']")
		WebElement number6;
		
		@FindBy(xpath="(//img[@align='absmiddle'])[1]")
		WebElement calculator_cancel_button;
		
		@FindBy(xpath="//select[@id='qccombo']")
		public WebElement quick_dropdown;
		
		@FindBy(xpath="(//a[text()='Trouble Tickets'])[1]")
		WebElement Trouble_tickets_tab;
		
		@FindBy(xpath="//img[@title='Find Duplicates']")
		WebElement Find_Duplicates;
		
		@FindBy(xpath="//input[@name='cancel']")
		WebElement cancel_button;
		
		@FindBy(xpath="(//img[@border='0'])[3]")
		WebElement Administrator_icon;
		
		@FindBy(xpath="//a[text()='Sign Out']")
		WebElement signout;
		
		@FindBy(xpath="//a[text()='More']")
		WebElement More_Tab;
		
		@FindBy(xpath="//a[text()='Reports']")
		WebElement Reports_option;
		
		@FindBy(xpath="(//img[@border='0'])[5]")
		WebElement settings;
		
		@FindBy(xpath="//a[text()='CRM Settings']")
		WebElement CRM_setting;
		
		@FindBy(xpath="//input[@name='accountname']")
		WebElement organization_name_textfield;
		
		@FindBy(xpath="//input[@name='phone']")
		WebElement phone_textfield;
		
		@FindBy(xpath="(//input[@name='button'])[1]")
		WebElement save_button;
		
		@FindBy(xpath="//input[@name='subject']")
		WebElement subject_textfield;
		
		@FindBy(xpath="//select[@name='taskstatus']")
		WebElement status_dropdown;
		
		@FindBy(xpath="//input[@name='campaignname']")
		WebElement camapign_name_textfield;
		
		@FindBy(xpath="//select[@name='campaigntype']")
		WebElement campaign_type_dropdown;
		
		@FindBy(xpath="//select[@name='salutationtype']")
		WebElement Firstname_dropdown;
		
		@FindBy(xpath="//input[@name='firstname']")
		WebElement Firstname_testfield;
		
		@FindBy(xpath="//input[@name='lastname']")
		WebElement Lastname_testfield;
		
		@FindBy(xpath="//input[@name='email']")
		WebElement Email_textfield;
		
		@FindBy(xpath="//input[@name='notes_title']")
		WebElement Title_textfield;
		
		@FindBy(xpath="//input[@name='subject']")
		WebElement Subject_textfield;
		
		@FindBy(xpath="//textarea[@name='ticket_title']")
		WebElement Text_area;
		
		@FindBy(xpath="//input[@name='bookname']")
		WebElement Bookname_textfield;
		
		@FindBy(xpath="//input[@name='active']")
		WebElement Active_checkBox;
		
		@FindBy(xpath="//input[@name='productname']")
		WebElement Productname_Testfield;
		
		@FindBy(xpath="//input[@name='unit_price']")
		WebElement UnitPrice_Testfield;
		
		@FindBy(xpath="//input[@id='qtyinstock']")
		WebElement Qty_in_stock_textfield;
		
		@FindBy(xpath="//input[@name='discontinued']")
		WebElement Product_Active_checkBox;
		
		@FindBy(xpath="//input[@name='projectname']")
		WebElement Project_name;
		
		@FindBy(xpath="//img[@id='jscal_trigger_targetenddate']")
		WebElement calender_icon;
		
		@FindBy(xpath="//td[text()='31']")
		WebElement date_of_calender_31;
		
		@FindBy(xpath="//input[@name='projectmilestonename']")
		WebElement Milestone_name;
		
		@FindBy(xpath="//img[@id='jscal_trigger_projectmilestonedate']")
		WebElement calender_icon_MilestoneDate;
		
		@FindBy(xpath="(//td[@class='day selected']")
		WebElement date_of_calender_31_Milestonedate;
		
		@FindBy(xpath="//img[@title='Select']")
		WebElement select_button;
		
		@FindBy(xpath="//input[@name='subject']")
		WebElement Subject_textfie_ld;
				
				
		
		//================Getters or Public services================
		public void username(String name) {
			username.sendKeys(name);
		}
		
		public void password(String name) {
			password.sendKeys(name);
		}
		
		public void login_button() {
			login_button.click();
		}
		
		public void search_text_field(String text) {
			search_text_field.sendKeys(text);
		}
		
		public void Search_icon() {
			search_icon.click();
		}
		
		public void contacts_tab() {
			contacts_tab.click();
		}
		
		public void contacts_search_text_field(String text) {
			contacts_search_textfield.sendKeys(text);
		}
		
		public void Email_tab() {
			Email_tab.click();
		}
		
		public void Email_Textfield(String email) {
			Email_Textfield.sendKeys(email);
		}
		
		public void Find_button() {
			Find_button.click();
		}
		
		public void World_clock_icon() {
			World_clock_icon.click();
		}
		
		public void cancel_World_clock_icon() {
			cancel_World_clock_icon.click();
		}
		
		public void calculator() {
			calculator_icon.click();
		}
		
		public void number6() {
			number6.click();
		}
		
		public void calculator_cancel_button() {
			calculator_cancel_button.click();
		}
		
		public void Trouble_tickets_tab() {
			Trouble_tickets_tab.click();
		}
		
		public void Find_Duplicates() {
			Find_Duplicates.click();
		}
		
		public void cancel_button() {
			cancel_button.click();
		}
		
		public void Home_button() {
			Home_button.click();
		}
		
		public WebElement Administrator_icon() {
			return Administrator_icon;
		}
		
		public WebElement signout() {
			return signout;
		}
		
		public WebElement More_Tab() {
			return More_Tab;
		}
		
		public WebElement Reports_option() {
			return Reports_option;
		}
		
		public WebElement settings() {
		return	settings;
		}
		
		public WebElement CRM_setting() {
			return  CRM_setting;
		}
		
		public void organization_name_textfield(String name) {
			organization_name_textfield.sendKeys(name);;
		}
		
		public void phone_textfield(String phone_number) {
			phone_textfield.sendKeys(phone_number);
		}
		
		public void save_button() {
			save_button.click();
		}
		
		public void subject_textfield(String text) {
			subject_textfield.sendKeys(text);
		}

		public WebElement status_dropdown() {
			return  status_dropdown;
		}
		
		public void camapign_name_textfield(String text) {
			camapign_name_textfield.sendKeys(text);;
		}
		
		public WebElement campaign_type_dropdown() {
			return  campaign_type_dropdown;
		}
		
		public WebElement Firstname_dropdown() {
			return  Firstname_dropdown;
		}
		
		public void Firstname_testfield(String text) {
			Firstname_testfield.sendKeys(text);
		}
		
		public void Lastname_testfield(String text) {
			Lastname_testfield.sendKeys(text);
		}
		
		public void Email_textfield(String text) {
			Email_textfield.sendKeys(text);
		}
		
		public void Title_textfield(String text) {
			Title_textfield.sendKeys(text);
		}
		
		public void Subject_textfield(String text) {
			Subject_textfield.sendKeys(text);
		}
		
		public void Text_area(String text) {
			Text_area.sendKeys(text);
		}
		
		public void Bookname_textfield(String text) {
			Bookname_textfield.sendKeys(text);
		}
		
		public void Active_checkBox() {
			Active_checkBox.click();;
		}
		
		public void Productname_Testfield(String text) {
			Productname_Testfield.sendKeys(text);
		}
		
		public void UnitPrice_Testfield(String text) {
			UnitPrice_Testfield.sendKeys(text);
		}
		
		public void Qty_in_stock_textfield(String text) {
			Qty_in_stock_textfield.sendKeys(text);
		}
		
		public void Product_Active_checkBox() {
			Product_Active_checkBox.click();;
		}
		
		public void Project_name(String text) {
			Project_name.sendKeys(text);
		}
		
		public void calender_icon() {
			calender_icon.click();
		}
		
		public void date_of_calender_31() {
			date_of_calender_31.click();
		}
		
		public void Milestone_name(String name) {
			Milestone_name.sendKeys(name);;
		}
		
		public void calender_icon_MilestoneDate() {
			calender_icon_MilestoneDate.click();
		}
		
		public void date_of_calender_31_Milestonedate() {
			date_of_calender_31_Milestonedate.click();
		}
		
		public void select_button() {
			select_button.click();
		}
		
		public void subject(String name) {
			subject_textfield.sendKeys(name);;
		}

		
		
		//======================== methods ============================
		public void login() {
			username("admin");
			password("admin");
			login_button();
		}
		
		public void contacts_dropdown(WebElement element) {
			WebElement dropdown= element;
			Select select=new Select(dropdown);
			List<WebElement> dropdowns=select.getOptions();
			for(int i=0;i<dropdowns.size();i++) {
				System.out.println(dropdowns.get(i).getText());
			}
			
		}
		
		public void Quick_dropdown(int i,WebElement element) {
			WebElement dropdown=element;
			Select select=new Select(dropdown);
	        select.selectByIndex(i);
		}
		
	}


}
