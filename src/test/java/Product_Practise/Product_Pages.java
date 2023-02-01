package Product_Practise;

import org.testng.annotations.Test;

import POM_Pages.Login_page;
import POM_Pages.Products_Page;
import Utility_Method.Base_Test;

public class Product_Pages extends Base_Test{
	
		@Test
		public void Test_Case_111() {
			Login_page lp=new Login_page(driver);
			lp.username();
			lp.password();
			lp.submit();
			Products_Page p1 =new Products_Page(driver);
			p1.products();
			p1.products1("magi");
	}
	}

