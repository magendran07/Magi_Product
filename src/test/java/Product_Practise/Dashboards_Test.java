package Product_Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import POM_Pages.DashBoards_Page;
import POM_Pages.Login_page;
import Utility_Method.Base_Test;

public class Dashboards_Test extends Base_Test {
	
	@Test
	public void Test_case5() throws InterruptedException {
		DashBoards_Page dp=new DashBoards_Page(driver);
		Login_page lp=new Login_page(driver);
		lp.username();
		lp.password();
		lp.submit();
		Thread.sleep(2000);
		dp.DashBoard();
		WebElement page=driver.findElement(By.xpath("(//select[@name='dashordlists'])[2]"));
		Actions actions=new Actions (driver);
		actions.moveToElement(page).click().perform();
		
		dp.Quick_Click(5);
	}

}
