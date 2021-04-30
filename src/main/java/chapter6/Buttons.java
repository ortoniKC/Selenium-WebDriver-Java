package chapter6;

import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons {

	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/");
		driver.manage().window().maximize();
		driver.get("https://letcode.in/buttons");
		// location
		WebElement btn1 = driver.findElementById("position");
		Point location = btn1.getLocation();
		System.out.println(location);
		// color
		WebElement btn2 = driver.findElementById("color");
		String color = btn2.getCssValue("background-color");
		System.out.println(color);
		// width & height
		Rectangle rect = driver.findElementById("property").getRect();
		int height = rect.getHeight();
		int width = rect.getWidth();
		System.out.println("Tall "+ height + " Fat "+width);
		
		boolean enabled = driver.findElementById("isDisabled").isEnabled();
		System.out.println(enabled);
		
		
		
		
		
		
		
		
		
		
		
		
		
		driver.quit();
	}
}
