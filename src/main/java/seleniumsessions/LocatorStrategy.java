package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorStrategy {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

		// create a webelement(By using locator) + action(click, sendkeys, dblclick,
		// rightclick, gettext, isdisplayed)

		// 1. id
		// 1st:
//		driver.findElement(By.id("Form_submitForm_Name")).sendKeys("NaveenAutomation");
//		driver.findElement(By.id("Form_submitForm_Email")).sendKeys("naveen@gmail.com");
//		driver.findElement(By.id("Form_submitForm_Contact")).sendKeys("9898989898");

		// 2nd:
//		WebElement name = driver.findElement(By.id("Form_submitForm_Name"));
//		WebElement email = driver.findElement(By.id("Form_submitForm_Email"));
//		WebElement telephone = driver.findElement(By.id("Form_submitForm_Contact"));
//
//		name.sendKeys("naveen");
//		email.sendKeys("naveen@gmail.com");
//		telephone.sendKeys("99999999");

		// 3rd: By locator approach: OR
//		By name = By.id("Form_submitForm_Name");
//		By email = By.id("Form_submitForm_Email");
//		By tele = By.id("Form_submitForm_Contact");
//
//		WebElement name_ele = driver.findElement(name);
//		WebElement email_ele = driver.findElement(email);
//		WebElement tele_ele = driver.findElement(tele);
//
//		name_ele.sendKeys("naveen");
//		email_ele.sendKeys("naveen@gmail.com");

		// 4th: By locator with a generic function:
//		By name = By.id("Form_submitForm_Name");
//		By email = By.id("Form_submitForm_Email");
//		By tele = By.id("Form_submitForm_Contact");
//		
//		getElement(name).sendKeys("naveen");
//		getElement(email).sendKeys("naveen@gmai.com");
//		getElement(tele).sendKeys("999999");

		// 5th: By locator with a generic function of webelement and action:
//		By name = By.id("Form_submitForm_Name");
//		By email = By.id("Form_submitForm_Email");
//		By tele = By.id("Form_submitForm_Contact");
//		
//		doSendKeys(email, "naveen@gmail.com");
//		doSendKeys(name, "naveen");
//		doSendKeys(tele, "999999");

		// 6th: By locator with ElementUtil class having generic methods:
//		By name = By.id("Form_submitForm_Name");
//		By email = By.id("Form_submitForm_Email");
//		By tele = By.id("Form_submitForm_Contact");
//		
//		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.doSendKeys(name, "naveen");
//		eleUtil.doSendKeys(email, "naveen@gmail.com");
//		eleUtil.doSendKeys(tele, "9099999");

		// 7th: String locator with ElementUtil class having generic methods:
		String name_id = "Form_submitForm_Name";
		String email_id = "Form_submitForm_Email";
		String tele_id = "Form_submitForm_Contact";

		// create a webelement(By using locator) + action(click, sendkeys, dblclick,
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys("id", name_id, "naveen");
		eleUtil.doSendKeys("id", email_id, "naveen@gmail.com");
	}

	public static By getBy(String locatorType, String locatorValue) {
		By locator = null;
		switch (locatorType.toLowerCase()) {
		case "id":
			locator = By.id(locatorValue);
			break;

		default:
			break;
		}

		return locator;

	}

	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
