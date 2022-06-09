package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClickAndSendKeys {
	
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		By emailId = By.id("input-email");
		By password = By.id("input-password");
		By loginBtn = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
		
		Actions act = new Actions(driver);
		
//		
//		act.sendKeys(getElement(emailId), "test@gmail.com").perform();
//		act.sendKeys(getElement(password), "test@123").perform();
//		act.click(getElement(loginBtn)).perform();
		
		doActionsSendKeys(emailId, "naveen@gmail.com");
		doActionsSendKeys(password, "test@123");
		doActionsClick(loginBtn);
		
		
		
	}
	
	public static void doActionsSendKeys(By locator, String value) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator), value).perform();
	}
	
	public static void doActionsClick(By locator) {
		Actions act = new Actions(driver);
		act.click(getElement(locator)).perform();
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
