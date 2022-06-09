package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitConcept {
	static WebDriver driver;

	public static void main(String[] args) {

		// exp wait: for web elements + non web elements(title, url, alerts)
		// can be customized for a specific webelement

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

		By name = By.id("Form_submitForm_Name");
		By email = By.id("Form_submitForm_Email");
		By contact = By.id("Form_submitForm_Contact");

		waitForElementPresence(name, 10).sendKeys("Naveen");
		getElement(email).sendKeys("naveen@gmail.com");
		getElement(contact).sendKeys("9999999");

//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));//sel 4.x
//		WebElement name_ele = wait.until(ExpectedConditions.presenceOfElementLocated(name));
//		name_ele.sendKeys("naveen@gmail.com");
//		
//		driver.findElement(email).sendKeys("naveen@gmail.com");
//		driver.findElement(contact).sendKeys("9999999");

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	/**
	 * An expectation for checking that an element is present on the DOM of a page.
	 * This does not necessarily mean that the element is visible.
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	public static WebElement waitForElementPresence(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	/**
	 * An expectation for checking that an element is present on the DOM of a page and visible. 
	 * Visibility means that the element is not only displayed but also has a height and width 
	 * that is greater than 0.
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	public static WebElement waitForElementVisible(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

}
