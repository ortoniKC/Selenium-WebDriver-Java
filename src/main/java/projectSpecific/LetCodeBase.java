package projectSpecific;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import base.SeleniumBase;

public class LetCodeBase extends SeleniumBase{
	
	@BeforeMethod
	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://letcode.in/");
	}
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
	
	

}
