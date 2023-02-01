package Product_Practise;

import org.testng.annotations.Test;

import POM_Pages.Login_page;
import POM_Pages.Reports_PAge;
import Utility_Method.Base_Test;

public class Report_PAge_Test  extends Base_Test{
	@Test
	public void Test_case4() {
		Reports_PAge rp=new Reports_PAge(driver);
		Login_page lp=new Login_page(driver);
		lp.username();
		lp.password();
		lp.submit();
		rp.More_Options(driver);
		rp.click_Here();
		rp.Report();
		rp.Folder_Name();
		rp.Folder_Disc();
		rp.save_Button();
	}
	

}
