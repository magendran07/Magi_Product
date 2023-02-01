package Utility_Method;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;



public class Base_Test {
	  public WebDriver driver;
	@BeforeClass
	public void BrowserSetup() throws IOException {
		System.setProperty("webdriver.chrome.driver","./src/Drivers/chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 String URL="http://elftestingserver:8888/index.php?action=index&module=Home";  
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
	}
	@AfterClass
	public void Shutdown() {
		driver.close();
	}

}
