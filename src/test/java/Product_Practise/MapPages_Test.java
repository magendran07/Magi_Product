package Product_Practise;

import org.testng.annotations.Test;

import POM_Pages.Login_page;
import POM_Pages.Map_Pages;
import Utility_Method.Base_Test;

public class MapPages_Test  extends Base_Test{
	@Test
	public void Test_Case_Map() {
		Login_page lp= new Login_page(driver);
		lp.username();
		lp.password();
		lp.submit();
		Map_Pages mp=new Map_Pages(driver);
		mp.MapPages(driver);
		
		
	}

}
