package chapter8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/");
		driver.manage().window().maximize();
		driver.get("https://letcode.in/alert");
		driver.findElement(By.id("accept")).click();
		// accept - ok
		
		// RemoteAlert
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
		driver.switchTo().alert().accept();
		
		// dismiss - cancel
		driver.findElement(By.id("confirm")).click();
		System.out.println(alert.getText());
		alert.dismiss();
		
		// type in alert
		
		driver.findElement(By.id("prompt")).click();
		alert.sendKeys("Koushik");
		alert.accept();
		
		
		driver.quit();
		
		
		
		
		
		
		
		
	}
}
