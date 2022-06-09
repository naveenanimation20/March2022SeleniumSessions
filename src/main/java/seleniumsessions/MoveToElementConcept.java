package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementConcept {
	static WebDriver driver;

	// 1. menu items: parent to child menu
	// 2. multi level menu items

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");
		By parentMenu = By.cssSelector("a.menulink");
		By courseMenu = By.linkText("COURSES");
		levelTwoMenuHandling(parentMenu, courseMenu);

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void levelTwoMenuHandling(By parentMenu, By childMenu) throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(parentMenu)).perform();
		Thread.sleep(1500);
		getElement(childMenu).click();
	}

}
