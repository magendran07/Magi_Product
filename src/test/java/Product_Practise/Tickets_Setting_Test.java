package Product_Practise;

import org.testng.annotations.Test;

import com.google.common.base.Ticker;

import POM_Pages.Login_page;
import POM_Pages.Tickets_Setting;
import Utility_Method.Base_Test;

public class Tickets_Setting_Test  extends Base_Test{
	@Test
	public void Testcase_12() {
		Login_page lp=new Login_page(driver);
		lp.username();
		lp.password();
		lp.submit();
		Tickets_Setting ts=new Tickets_Setting(driver);
		ts.Trible_Tickets().click();
		ts.Setting_Tickets().click();
		ts.Tool_Tip_Suggestion().click();
		ts.Quick_Click(4);
		
	}

}
