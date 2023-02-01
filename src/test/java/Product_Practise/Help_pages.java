package Product_Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility_Method.Utility_Method_Tiger;

public class Help_pages extends Utility_Method_Tiger {
	
	public Help_pages(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//information button
	@FindBy(xpath="//img[@src='themes/softed/images/info.PNG']")
	WebElement info;
	
	//FeedBack
			@FindBy(xpath="//a[text()='Feedback']")
			WebElement Feedback;
			
			
			public WebElement info_Button() {
				return info;
			}
			public WebElement FeedBack_Button() {
				
				return Feedback;
			}

}
