package org.letcode.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import projectSpecific.LetCodeBase;

public class LoginPage extends LetCodeBase{
	
	@CacheLookup
	@FindBy(tagName = "h1") 
	private WebElement header;
//	String text = "Signin"
	@FindBy(xpath = "//button[text()='LOGIN']") private WebElement loginBtn;
	@FindBy(name="email") private WebElement eleEmail;
	@FindBy(name="password") private WebElement elePassword;
	public LoginPage(RemoteWebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public boolean isHeaderDisplayed() {
		return this.header.isDisplayed();
	}
	public String getPageHeader() {
		String text = this.header.getText();
//		String text = driver.findElement(By.tagName("h1")).getText();
		return text;
	}
	public void enterUserEmail(String email) {
//		driver.findElement(By.name("email")).sendKeys(email);
		this.type(eleEmail, email);
	}
	public void enterPassword(String pass) {
		this.type(elePassword, pass);
//		driver.findElement(By.name("password")).sendKeys(pass);
	}
	
	
	public void clickLogin() {
		this.click(loginBtn);
//		this.loginBtn.click();
//		String text = "sign in";
//		driver.findElement(By.xpath("//button[text()='"+text+"]")).click();
//		driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
	}
	
	
	

}
