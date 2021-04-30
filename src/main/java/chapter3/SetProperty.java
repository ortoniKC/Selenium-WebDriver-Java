package chapter3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetProperty {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/");
		driver.manage().window().maximize();
		// email pass
		String email = "koushik350@gmail.com";
		String pass = "Pass123$";
		WebElement signIn = driver.findElementByLinkText("Log in");
		signIn.click();
		driver.findElementByName("email").sendKeys(email);
		driver.findElementByName("password").sendKeys(pass);
		driver.findElementByXPath("//button[text()='LOGIN']").click();
		// driver.close();
		driver.quit();
	}
}
