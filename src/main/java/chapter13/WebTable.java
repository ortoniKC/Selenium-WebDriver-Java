package chapter13;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {


	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/table");
		WebElement table = driver.findElementByCssSelector("table#simpletable>tbody");
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		for (int i = 0; i < rows.size(); i++) {
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			WebElement data = cols.get(1);
			System.out.println(data.getText());
			if (data.getText().equals("Chatterjee")) {
					cols.get(3).findElement(By.tagName("input")).click();
					break;
			}
		}
		
		driver.quit();
	}
}











