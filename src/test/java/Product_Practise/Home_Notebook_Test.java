package Product_Practise;

import org.testng.annotations.Test;

import POM_Pages.Home_Page;
import POM_Pages.Login_page;
import POM_Pages.NoteBook_reg;
import Utility_Method.Base_Test;

public class Home_Notebook_Test extends Base_Test {
	
	@Test
	public void Test_Case2(){
		Home_Page hp=new Home_Page(driver);
		Login_page lp=new Login_page(driver);
		NoteBook_reg hn=new NoteBook_reg(driver);
		lp.username();
		lp.password();
		lp.submit();
		hp.add_Button(driver);
		hn.adminstration();
		hn.date_registe();
		hn.radio_button();
		hn.enter_name();
		hn.plus_button(driver);
		
	}
}
