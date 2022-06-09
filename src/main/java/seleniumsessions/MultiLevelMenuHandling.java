package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiLevelMenuHandling {

	static WebDriver driver;

	// 2. multi level menu items

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.bigbasket.com/");
		By shopByCat = By.xpath("//a[@class='dropdown-toggle meganav-shop']");
		multiLevelMenuHandling(shopByCat, "Beverages", "Tea", "Green Tea", "Tea Powder");
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void multiLevelMenuHandling(By parentMenu, String l1, String l2, String l3, String l4) throws InterruptedException {

		Actions act = new Actions(driver);
		act.moveToElement(getElement(parentMenu)).perform();
		Thread.sleep(1500);

		act.moveToElement(driver.findElement(By.linkText(l1))).perform();
		Thread.sleep(1500);

		act.moveToElement(driver.findElement(By.linkText(l2))).perform();
		Thread.sleep(1500);

		act.moveToElement(driver.findElement(By.linkText(l3))).perform();
		Thread.sleep(1500);

		driver.findElement(By.linkText(l4)).click();
	}

}
