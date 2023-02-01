package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Utility_Method.Utility_Method_Tiger;

public class Search_Tickets extends Utility_Method_Tiger {
	
	public Search_Tickets(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//Trouble_Tickets 
		@FindBy(xpath="(//a[text()='Trouble Tickets'])[1]")
		WebElement Trouble_Tickets;
		
		//Search_box
		@FindBy(xpath="//input[@class='txtBox']")
		WebElement Search_Box;
		
		//Drop_Down_Button
		@FindBy(xpath="(//select[@class='txtBox' and @id='bas_searchfield'])[1]")
		WebElement Drop_down1;
		
		//Search_Button
		@FindBy(xpath="//input[@name='submit']")
		WebElement Search_Button;
		
		
		//=============================Methods==========================
		
		public WebElement Trouble_Tickets() {
			return Trouble_Tickets;
		}
		public WebElement Search_Box() {
			return Search_Box;
		}
		
		public void Quick_Click(int i) {
			WebElement Drop=Drop_down1;
			Select select=new Select(Drop);
			select.selectByIndex(i);
			}
		public WebElement Click_Search() {
			return Search_Box;
		}

		
		
}
