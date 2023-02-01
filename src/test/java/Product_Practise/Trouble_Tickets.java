package Product_Practise;

import org.testng.annotations.Test;

import POM_Pages.Login_page;
import POM_Pages.Train_Tickets;
import Utility_Method.Base_Test;

public class Trouble_Tickets extends Base_Test {
	@Test
	public void Testcase_11() {
		Login_page lp=new Login_page(driver);
		lp.username();
		lp.password();
		lp.submit();
		Train_Tickets tt=new Train_Tickets(driver);
		tt.Trible_Tickets().click();
		tt.Create_Tickets().click();
		tt.Enter_Tittle().sendKeys("helloo");
		tt.Quick_Click(0);
		tt.Quick_Click2(2);
		tt.Quick_Click3(3);
		tt.Quick_Click4(2);
		tt.Quick_Click5(2);
		tt.Save_Button();
				
	}

}
