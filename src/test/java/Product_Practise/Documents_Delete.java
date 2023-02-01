package Product_Practise;

import org.testng.annotations.Test;

import POM_Pages.Documents_Pages;
import POM_Pages.Login_page;
import Utility_Method.Base_Test;

public class Documents_Delete extends Base_Test {
	
	@Test
	public void Testcase_0011() {
	Login_page lp=new Login_page(driver);
		lp.username();
		lp.password();
		lp.submit();
	Documents_Pages dp=new Documents_Pages(driver);
		dp.delete_Button().click();
		dp.Check_Box2().click();
		dp.delete_Button().click();
	}

}
