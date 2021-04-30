package org.letcode.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

import projectSpecific.LetCodeBase;

public class HeaderPage extends LetCodeBase {
	public HeaderPage(RemoteWebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void clickSignUp() {

	}

	public void clickLoginMenu() {
		driver.findElement(By.linkText("Log in")).click();
	}
	
	public void clickSignOut() {
		driver.findElement(By.linkText("Sign out")).click();
	}


}
