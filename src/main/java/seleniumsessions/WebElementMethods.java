package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementMethods {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

		// WE + action (click, SK, getText, isDisplayed)
		
		By email = By.id("input-email");
//		boolean flag = driver.findElement(email).isDisplayed();
//		System.out.println(flag);
		
//		if(doIsDisplayed(email)) {
//			doSendKeys(email, "test@gmail.com");
//		}
		
		//get the attribute of the element:
//		String placeholder = driver.findElement(By.id("input-email")).getAttribute("placeholder");
//		System.out.println(placeholder);
		
//		driver.findElement(By.id("Form_submitForm_Name")).sendKeys("naveen test");
//		String value = driver.findElement(By.id("Form_submitForm_Name")).getAttribute("value");
//		System.out.println(value);
//		
//		System.out.println(getAttributeValue(By.id("Form_submitForm_Name"), "value"));
//		System.out.println(getAttributeValue(By.id("Form_submitForm_Name"), "placeholder"));

		
		//driver.findElement(By.id("Form_submitForm_Email1111")).sendKeys("naveen@gmail.com");
		//NoSuchElementException -- selenium exception
		//ElementNotFoundException -- not selenium exception
		
		//driver.findElement(By.xpath("//@#@#@#test[@@@@=userid]")).click();
		//InvalidSelectorException
	}
	
	
	
	public static String getAttributeValue(By locator, String attrName) {
		return getElement(locator).getAttribute(attrName);
	}
	
	public static boolean doIsEnabled(By locator) {
		return getElement(locator).isEnabled();
	}
	
	public static boolean doIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
