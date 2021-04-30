package chapter5;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Inputs {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/");
		driver.manage().window().maximize();
		driver.get("https://letcode.in/edit");
		// TC001
		driver.findElementById("fullName").sendKeys("koushik Chatterjee");
		// TC002
		driver.findElementById("join").sendKeys(" Youtuber", Keys.TAB);
		// TC003
		String attribute = driver.switchTo()
				.activeElement().getAttribute("value");
		System.out.println(attribute);
		// TC004
		driver.findElementById("clearMe").clear();
		boolean enabled = driver.findElementById("noEdit").isEnabled();
		System.out.println(enabled);
		String isReadOnly = driver.findElementById("dontwrite").getAttribute("readonly");
		
		System.out.println(isReadOnly);
		
		driver.quit();
		
		
		
		
		
		
		
		
		
	}
}
