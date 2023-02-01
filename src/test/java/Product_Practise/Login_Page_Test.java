package Product_Practise;

import org.testng.annotations.Test;


import POM_Pages.Login_page;
import Utility_Method.Base_Test;

public class Login_Page_Test  extends Base_Test{
	@Test
	public void Test_case1(){
		Login_page lp=new Login_page(driver);
		lp.username();
		lp.password();
		lp.submit();
	}
}
