package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility_Method.Utility_Method_Tiger;


public class Products_Page  extends Utility_Method_Tiger{
	
	
	public Products_Page(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
		@FindBy(xpath="//a[@href='index.php?module=Products&action=index']")
		WebElement products;

	
		@FindBy(xpath="//input[@class=\"txtBox\"]")
		WebElement products1;
		
		//===========================METHODS================
		
		public void products() {
			products.click();	
}

		public void products1(String value) {
			products1.sendKeys(value);
		}
}

