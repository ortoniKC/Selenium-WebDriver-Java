package chapter15;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://letcode.in/");
		driver.manage().window().maximize();
		String email = "koushik350@gmail.com";
		String pass = "Pass123$";
		WebElement signIn = driver.findElementByLinkText("Log in");
		signIn.click();
		driver.findElementByName("email1").sendKeys(email);
		driver.findElementByName("password").sendKeys(pass);
		driver.findElementByXPath("//button[text()='LOGIN']").click();
	}

}




