package chapter11;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {


	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/windows");
		driver.findElement(By.id("home")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(windowHandles);
		for (String winId : list) {
			System.out.println(winId);
		}
		int size = list.size();
		System.out.println("No.of windows: "+size);
		driver.switchTo().window(list.get(1));
		driver.findElementByLinkText("Test Practice").click();
		// driver.switchTo().window(list.get(0));
		driver.close();
		driver.quit();
			
	}
}








