package Product_Practise;

import org.testng.annotations.Test;


import POM_Pages.Login_page;
import POM_Pages.World_Clock;
import Utility_Method.Base_Test;

public class World_Clock_Test extends Base_Test {
	
	@Test
	public void Testcase_009() {
		Login_page lp=new Login_page(driver);
		lp.username();
		lp.password();
		lp.submit();
		World_Clock wc=new World_Clock(driver);
		wc.Clock().click();
		wc.Quick_Click(6);
		
	}

}
