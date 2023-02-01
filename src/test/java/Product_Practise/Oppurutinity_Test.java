package Product_Practise;

import org.testng.annotations.Test;

import POM_Pages.Login_page;
import POM_Pages.Oppurtunities;
import Utility_Method.Base_Test;

public class Oppurutinity_Test extends Base_Test {
	
	@Test
	
	public  void Test_case111() {
		
		Login_page lp=new Login_page(driver);
		lp.username();
		lp.password();
		lp.submit();
		Oppurtunities op=new Oppurtunities(driver);
		op.Oppurunity_Button().click();
		op.Quick_Click(3);
		op.Save_Button().click();
	}

}
