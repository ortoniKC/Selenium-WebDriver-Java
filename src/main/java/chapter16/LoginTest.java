package chapter16;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTest {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://letcode.in/");
		driver.manage().window().maximize();
		String email = "koushik350@gmail.com";
		String pass = "Pass123$";
		WebElement signIn = driver.findElementByLinkText("Log in");
		signIn.click();
		driver.findElementByName("email").sendKeys(email);
		driver.findElementByName("password").sendKeys(pass);
		driver.findElementByXPath("//button[text()='LOGIN']").click();
		// toast message
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement toast = driver.findElementByXPath("//div[@role='alertdialog']");
		wait.until(ExpectedConditions.invisibilityOf(toast));
		driver.findElement(By.linkText("Sign out")).click();
	}

}




