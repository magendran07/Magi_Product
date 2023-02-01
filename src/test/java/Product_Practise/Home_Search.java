package Product_Practise;

import POM_Pages.Home_Page;
import POM_Pages.Login_page;
import Utility_Method.Base_Test;

public class Home_Search  extends Base_Test{
	
	public void Test_Case000() {
		Login_page lp=new Login_page(driver);
		lp.username();
		lp.password();
		lp.submit();
		
		Home_Page hp=new Home_Page(driver);
		hp.search_box();
		hp.Quick_Click(4);
	}
	
	
}
	
	