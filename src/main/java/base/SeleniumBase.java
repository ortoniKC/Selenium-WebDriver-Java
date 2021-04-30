package base;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumBase {

	protected RemoteWebDriver driver;
	private WebDriverWait wait;
	private long timeOut = 30;

	public void type(WebElement ele, String text) {
		wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.sendKeys(text);
		log("The value "+text+" is typed");
	}

	public void clearAndType(WebElement ele, String text) {
		ele.clear();
		ele.sendKeys(text);
		log("The value is clear and then "+text+" is typed");
	}

	public boolean isDisplayed(WebElement ele) {
		return ele.isDisplayed();
	}

	public boolean isReadOnly(WebElement ele) {
		String isRead =  ele.getAttribute("readonly");
		if(isRead.equals("true")) {
			return true;
		}else return false;
	}

	public void click(WebElement ele) {
		wait = new WebDriverWait(driver, 20);
		WebElement readyEle = wait.until(ExpectedConditions.elementToBeClickable(ele));
		readyEle.click();
		log("The ele is clicked");
	}

	public String getElementColor(WebElement ele) {
		String cssValue = ele.getCssValue("background-color");
		log("background-color is "+cssValue);
		return cssValue;
	}

	// TODO: Enhance it later
	public void selectText(WebElement ele, String visibleText) {
		Select select = new Select(ele);
		select.selectByVisibleText(visibleText);
		WebElement selectedOption = select.getFirstSelectedOption();
		if(selectedOption.getText().equals(visibleText)) {
			log("is Selcted: "+visibleText);
		}else {
			log("Option is not there: "+visibleText);			
		}
	}
	// TODO: you have to complete
	public void selectIndex(WebElement el,int inex) {

	}
	// TODO: you have to complete
	public void selectValue(WebElement el,String value) {

	}

	public void acceptAlert() {
		Alert alert = driver.switchTo().alert();
		log("Alert text is: "+alert.getText());
		alert.accept();
	}
	public void dismissAlert() {
		Alert alert = driver.switchTo().alert();
		log("Alert text is: "+alert.getText());
		alert.dismiss();
	}

	public void typeInAlert(String text) {
		Alert alert = driver.switchTo().alert();
		log("Alert text is: "+alert.getText());
		alert.sendKeys(text);
	}

	public void switchToFrame(int i) {
		driver.switchTo().frame(i);
		log("Switched to the "+i+" th frmae");
	}
	public void switchToFrame(WebElement ele) {
		driver.switchTo().frame(ele);
		log("Switched to the frmae");
	}
	public void switchToFrame(String nameOrId) {
		driver.switchTo().frame(nameOrId);
		log("Switched to the frmae");
	}
	
	public boolean isElementDisplayed(WebElement ele) {
		log(ele.isDisplayed());
		return ele.isDisplayed();
	}

	public void switchToWindow(int i) {
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(windowHandles);
		int size = list.size();
		System.out.println("No.of windows: "+size);
		driver.switchTo().window(list.get(i));
		log("Switched to the window");
	}
	
	public void log(Object message) {
		System.out.println(message);
	}

}










