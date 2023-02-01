package Product_Practise;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import POM_Pages.New_HomePage;
import Utility_Method.Base_Test;

public class Calender_Test  extends Base_Test{
@Test
public void Tc02() {

	New_HomePage h1=new New_HomePage(driver);
	h1.Calendar();
}
}