package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownHandleConcept {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		//drop down --> html tag (select) --> Select class in Selenium
		
		By country = By.id("Form_submitForm_Country");
		By states = By.id("Form_submitForm_State");
		
//		Select select = new Select(driver.findElement(country));
//		//select.selectByIndex(5);//
//		select.selectByVisibleText("India");
//		//select.selectByValue("Argentina");
//		Thread.sleep(4000);
//		
//		Select select1 = new Select(driver.findElement(states));
//		select1.selectByVisibleText("Karnataka");

		//selectDropDownByIndex(country, 5);
		selectDropDownByVisible(country, "India");
		Thread.sleep(4000);
		selectDropDownByVisible(states, "Goa");
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void selectDropDownByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	public static void selectDropDownByVisible(By locator, String visibleText) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(visibleText);
	}
	
	public static void selectDropDownByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	

}
