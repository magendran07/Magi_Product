package Product_Practise;

import org.testng.annotations.Test;

import POM_Pages.Email_PAge;
import POM_Pages.Login_page;
import Utility_Method.Base_Test;

public class Email_Search_Test extends Base_Test {
	@Test
	public void Test_case06() {
		Email_PAge ep=new Email_PAge(driver);
		Login_page lp=new Login_page(driver);
		lp.username();
		lp.password();
		lp.submit();
		ep.email_Search();
		ep.email_Search();
		ep.my_mail();
		ep.Quick_Click(2);
		ep.Email_yahoo();
		ep.user_name();
		ep.Password();
		ep.Quick_Click2(2);
		ep.Save_Button();
		
	}

}
