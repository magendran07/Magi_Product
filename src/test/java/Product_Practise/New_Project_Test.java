package Product_Practise;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import POM_Pages.Home_Page;
import POM_Pages.Login_page;
import Utility_Method.Base_Test;

public class New_Project_Test extends Base_Test {
	@Test
	public void Test_case3() {
		Home_Page hp1=new Home_Page(driver);
		Login_page lp=new Login_page(driver);
		lp.username();
		lp.password();
		lp.submit();
		hp1.dropdown_2();
		hp1.Quick_Click(3);
	}
}
