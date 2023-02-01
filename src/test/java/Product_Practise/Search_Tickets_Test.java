package Product_Practise;

import org.testng.annotations.Test;

import POM_Pages.Login_page;
import POM_Pages.Search_Tickets;
import Utility_Method.Base_Test;

public class Search_Tickets_Test extends Base_Test {
	
	@Test
	public void Testcase_13() {
		Login_page lp=new Login_page(driver);
		lp.username();
		lp.password();
		lp.submit();
		Search_Tickets st=new Search_Tickets(driver);
		st.Trouble_Tickets().click();
		st.Search_Box().sendKeys("iii");
		st.Quick_Click(2);
		st.Click_Search().click();
	}
	

}
