package Product_Practise;

import org.testng.annotations.Test;

import POM_Pages.New_HomePage;
import Utility_Method.Base_Test;

public class Leads_TEST extends Base_Test {
	
	@Test
	public void Test_Leads() {
		New_HomePage h1=new New_HomePage(driver);
		h1.Leads();
			
	}
}


