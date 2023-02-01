package Product_Practise;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import POM_Pages.Login_page;
import POM_Pages.New_HomePage;
import Utility_Method.Base_Test;

public class More_Test extends Base_Test {
	@Test
	public void Test_More() {
		
			New_HomePage h1=new New_HomePage(driver);
			Login_page lp=new Login_page(driver);
			lp.username();
			lp.password();
			lp.submit();
			Actions action =new Actions(driver);
				action.moveToElement(h1.More()).build().perform();
			
		}
	
	}


