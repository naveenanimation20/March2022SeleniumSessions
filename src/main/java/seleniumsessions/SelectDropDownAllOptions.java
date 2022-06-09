package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownAllOptions {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		// drop down --> html tag (select) --> Select class in Selenium

		By country = By.id("Form_submitForm_Country");
		By states = By.id("Form_submitForm_State");

//		dropDownSelectValue(country, "India");
//		Thread.sleep(2000);
//		dropDownSelectValue(states, "Goa");

		// not allowed to use select class:
		By countryOptions = By.xpath("//select[@id='Form_submitForm_Country']/option");
		dropDownSelectValue(countryOptions, "India");
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void dropDownSelectValueWithGetOptions(By locator, String value) {
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();

		for (WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);
			if (text.equals(value)) {
				e.click();
				break;
			}
		}
	}

	public static void dropDownSelectValue(By locator, String value) {
		List<WebElement> list = driver.findElements(locator);
		for (WebElement e : list) {
			String text = e.getText();
			if (text.equals(value)) {
				e.click();
				break;
			}
		}
	}

}
