package org.letcode.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

import projectSpecific.LetCodeBase;

public class HomePage extends LetCodeBase{

	public HomePage(RemoteWebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String validateToastMessage() {
		return driver.findElementByXPath("//div[@role='alertdialog']")
				.getText();
	}

	public String validateWelcomeMessage() {
		WebElement header = driver
				.findElementByXPath("//div[contains(@class,'box title')]");
		System.out.println(header.getText());
		return header.getText();

	}

}
