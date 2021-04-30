package test;

import org.letcode.pages.HeaderPage;
import org.letcode.pages.HomePage;
import org.letcode.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import projectSpecific.LetCodeBase;

public class TC002LoginTest extends LetCodeBase{
	@Test
	public void login2() throws InterruptedException {
		HomePage home = new HomePage(driver);
		String welcomeMessage = home.validateWelcomeMessage();
		Assert.assertEquals(welcomeMessage.trim(), "Welcome to LetCode!");
		HeaderPage header = new HeaderPage(driver);
		header.clickLoginMenu();
		LoginPage login = new LoginPage(driver);
		login.enterUserEmail("koushik1@letcode.in");
		login.enterPassword("Pass123$");
		login.clickLogin();
		Thread.sleep(3000);
		String toastMessage = home.validateToastMessage();
		System.out.println(toastMessage);
		Assert.assertEquals(toastMessage.trim(), "Welcome Koushik LetCode");
	}

}
