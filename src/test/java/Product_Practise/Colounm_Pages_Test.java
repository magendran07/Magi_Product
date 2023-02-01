package Product_Practise;

import org.testng.annotations.Test;

import POM_Pages.Colounm_Pages;
import POM_Pages.Login_page;
import Utility_Method.Base_Test;

public class Colounm_Pages_Test  extends Base_Test{
	
	@Test
	public void Test_case07() {
		Login_page lp=new Login_page(driver);
		lp.username();
		lp.password();
		lp.submit();
		Colounm_Pages cp=new Colounm_Pages(driver);
		cp.Colounm_Click();
		cp.Quick_Click(2);
	}

}
