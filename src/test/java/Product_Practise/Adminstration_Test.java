package Product_Practise;

import org.testng.annotations.Test;

import POM_Pages.Adminstration;
import POM_Pages.Login_page;
import Utility_Method.Base_Test;

public class Adminstration_Test extends Base_Test {
	
	@Test
	public void Testcase_08() {
		Login_page lp=new Login_page(driver);
		lp.username();
		lp.password();
		lp.submit();
		Adminstration ad=new Adminstration(driver);
		ad.Admin(driver);
		ad.My_Preference_ICon().click();
		ad.Email_Edit(driver);
		ad.Email_Credentials().sendKeys("magendranmagi2008@gmail.com");
		ad.Save_Button().click();
		ad.Firstname(driver);
		ad.Firstname_give().sendKeys("magendran");
		ad.Save_Button().click();
	}

}
