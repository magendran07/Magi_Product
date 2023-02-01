package Product_Practise;

import org.testng.annotations.Test;

import POM_Pages.Login_page;
import POM_Pages.Setting_Pages;
import Utility_Method.Base_Test;

public class Sharing_Pages_TEst extends Base_Test{
	
	@Test
	public void Test_case10() {
		Login_page lp=new Login_page(driver);
		lp.username();
		lp.password();
		lp.submit();
		Setting_Pages sp=new Setting_Pages(driver);
		sp.Setting_Option(driver);
		sp.Option_Select().click();
		sp.Sharing_Options().click();
		sp.Recalculate_Button().click();
		sp.Yes_Option();
	}

}
