package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitConcept {

	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");

		By customers = By.linkText("Amazon Science11");

		// FW --> Wait
		//waitForElementPresenceWithFluentWait(customers, 10, 1000, "element is not present...");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.pollingEvery(Duration.ofMillis(1000))
			.ignoring(NoSuchElementException.class)
			.withMessage("element is not present...");
		
	}

	public static void waitForElementPresenceWithFluentWait(By locator, int timeOut, 
			int pollingTime, String message) {
		
			Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
					.withTimeout(Duration.ofSeconds(timeOut))
					.pollingEvery(Duration.ofMillis(pollingTime))
					.ignoring(NoSuchElementException.class, StaleElementReferenceException.class)
					.withMessage(message);

			wait.until(ExpectedConditions.presenceOfElementLocated(locator)).click();
		}

	

}
