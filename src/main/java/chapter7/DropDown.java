package chapter7;

import java.util.List;

import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/");
		driver.manage().window().maximize();
		driver.get("https://letcode.in/dropdowns");
			
		
//		Select the apple using visible text
		
		WebElement fruitsEle = driver.findElementById("fruits");
		Select fruits = new Select(fruitsEle);
		System.out.println(fruits.isMultiple());
		fruits.selectByVisibleText("Banana");
		
		WebElement herosEle = driver.findElementById("superheros");
		Select heros = new Select(herosEle);
		// check multiple
		boolean multiple = heros.isMultiple();
		System.out.println(multiple);
		heros.selectByIndex(2);
		heros.selectByValue("ca");
		heros.selectByVisibleText("Iron Man");
		heros.deselectByIndex(2);
		List<WebElement> allSelectedOptions = heros.getAllSelectedOptions();
		for (WebElement hero : allSelectedOptions) {
			System.out.println(hero.getText());
		}
		
		WebElement countryEle = driver.findElementById("country");
		Select country = new Select(countryEle);
		country.selectByValue("India");
		WebElement selectedCountry = country.getFirstSelectedOption();
		System.out.println(selectedCountry.getText());
		driver.quit();
	}
}
