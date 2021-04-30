package chapter10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UIValidations {


	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/radio");
		// Find if the checkbox is selected?
		WebElement rem = driver.findElement(By.xpath("//label[text()=' Remember me ']/input"));
		boolean selected = rem.isSelected();
		System.out.println(selected);
		WebElement butn = driver.findElement(By.tagName("button"));
		System.out.println(butn.isDisplayed());
		driver.quit();
	}
}








