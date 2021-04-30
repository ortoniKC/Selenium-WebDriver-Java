package chapter14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {


	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		// RemoteNavigation
		Navigation navigate = driver.navigate();
		navigate.to("https://letcode.in/buttons");
		System.out.println("Expecting buttons : " +driver.getCurrentUrl() );
		driver.findElement(By.id("home")).click();	
		System.out.println("Expecting letcode.in: " +driver.getCurrentUrl() );
		navigate.back();
		System.out.println("Expecting buttons : " +driver.getCurrentUrl() );
		navigate.forward();
		System.out.println("Expecting letcode.in: " +driver.getCurrentUrl() );
		navigate.refresh();
		
//		driver.get("https://letcode.in/buttons");
			
	}
}








