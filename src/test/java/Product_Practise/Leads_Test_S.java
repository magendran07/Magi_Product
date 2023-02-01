package Product_Practise;

import org.testng.annotations.Test;

import POM_Pages.Leads_PAge;
import POM_Pages.Login_page;
import Utility_Method.Base_Test;

public class Leads_Test_S extends Base_Test {
	
		@Test
		public void Test_case5() throws InterruptedException {
			Login_page lp=new Login_page(driver);
			lp.username();
			lp.password();
			lp.submit();
			Leads_PAge dp=new Leads_PAge(driver);
			dp.Leads();
			Thread.sleep(2000);
			dp.Search("magi");
	}
	}


