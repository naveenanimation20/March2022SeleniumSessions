package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementIsDisplayed {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");

		By emailId = By.id("input-email");
		
		if(driver.findElements(emailId).size() > 0) {
			System.out.println("element is displayed");
		}

	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public static boolean isElementDisplayed(By locator) {
		WebElement ele = getElement(locator);
		List<WebElement> eleList = getElements(locator);
		if(eleList.size()>0) {
			if(ele.isDisplayed())
				return true;
		}
		return false;
	}
	
	

}
