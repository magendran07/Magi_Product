package Product_Practise;

import org.testng.annotations.Test;

import POM_Pages.LogOut_Pages;
import POM_Pages.Login_page;
import Utility_Method.Base_Test;

public class Log_Out_Test  extends Base_Test{
	@Test
	public void Test_Case11() {
		Login_page lp= new Login_page(driver);
		lp.username();
		lp.password();
		lp.submit();
		LogOut_Pages Lp=new LogOut_Pages(driver);
		Lp.Admin(driver);
		Lp.Log_out().click();
	}
}
