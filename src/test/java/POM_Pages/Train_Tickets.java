package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Utility_Method.Utility_Method_Tiger;

public class Train_Tickets extends Utility_Method_Tiger {

	public Train_Tickets (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//Trouble_Tickets 
	@FindBy(xpath="(//a[text()='Trouble Tickets'])[1]")
	WebElement Trouble_Tickets;
	
	//Create a Tickets
	@FindBy(xpath="//img[@alt='Create Ticket...']")
	WebElement Create_tickets;
	
	//Tittle_Text
	@FindBy(name="ticket_title")
	WebElement Tittle;
	
	//Radio Button
	@FindBy(xpath="(//input[@name=\"assigntype\"])[1]")
	WebElement Radio;
	
	//dropDown_1
	@FindBy(xpath="//select[@name='assigned_user_id']")
	WebElement Drop_Down1;
	
	//Drop_Down2
	@FindBy(xpath="//select[@name='ticketpriorities']")
	WebElement  Drop_Down2;
	
	//Drop_Down3
	@FindBy(xpath="//select[@name='ticketseverities']")
	WebElement Drop_Down3;
	
	//Drop_Down4
	@FindBy(xpath="//select[@name='ticketcategories']")
	WebElement Drop_Down4;
	
	//Status
	@FindBy(xpath="//select[@name='ticketstatus']")
	WebElement Drop_Drop5;
	
	//save_the_Tickets
	@FindBy(xpath="//input[@name='button' and @class='crmButton small save' ]")
	WebElement Save_Button;
	
	//===============================Methods==============================
	
	
	public WebElement Trible_Tickets() {
		return Trouble_Tickets;
	}
	public WebElement Create_Tickets() {
		return Create_tickets;
	}
	public WebElement Enter_Tittle() {
		return Tittle;
	}
	
	public WebElement Radio_Button() {
		return Radio_Button();
	}
	public void Quick_Click(int i) {
		WebElement Drop=Drop_Down1;
		Select select=new Select(Drop);
		select.selectByIndex(i);}

public void Quick_Click2(int i) {
	WebElement Drop=Drop_Down2;
	Select select=new Select(Drop);
	select.selectByIndex(i);
	}
public void Quick_Click3(int i) {
	WebElement Drop=Drop_Down3;
	Select select=new Select(Drop);
	select.selectByIndex(i);}

public void Quick_Click4(int i) {
	WebElement Drop=Drop_Down4;
	Select select=new Select(Drop);
	select.selectByIndex(i);}

public void Quick_Click5(int i) {
	WebElement Drop=Drop_Drop5;
	Select select=new Select(Drop);
	select.selectByIndex(i);}

public WebElement Save_Button() {
	return Save_Button;
}
}