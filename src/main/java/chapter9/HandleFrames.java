package chapter9;

import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/frame");
		driver.manage().window().maximize();
		driver.switchTo().frame("firstFr");
		driver.findElementByName("fname").sendKeys("koushik");
		driver.switchTo().frame(0);
		driver.findElementByName("email").sendKeys("mail@mail.com");
		driver.switchTo().defaultContent(); 
		driver.findElementByTagName("button").click();
	
		
//		driver.quit();
		
		
		
		
		
		
		
		
	}
}
