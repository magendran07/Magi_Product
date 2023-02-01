package Example_Topics;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chromeoptions {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./src/Drivers/chromedriver.exe"); 
		ChromeOptions options =new ChromeOptions();
		
		options.addArguments("--disable-notification");
		options.addArguments("--start-maximized");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.easemytrip.com/");
		
		
	}
}
