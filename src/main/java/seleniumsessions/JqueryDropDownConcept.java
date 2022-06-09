package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropDownConcept {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.findElement(By.id("justAnInputBox")).click();
		Thread.sleep(2000);
		By choices = By.xpath("(//div[contains(@id,'DropDownContainer')])[1]/ul//span[@class='comboTreeItemTitle']");

		// tc_01: single selection:
		selectChoice(choices, "choice 9");

		// tc_02: multi selection:
		// selectChoice(choices, "choice 1", "choice 2", "choice 6 2 1");

		// tc_03: all selection:
		 //selectChoice(choices, "ALL");
	}

	/*
	 * this method is used to select the choices:
	 * 1. single
	 * 2. multiple
	 * 3. all selectons: please pass the "ALL" 
	 */
	public static void selectChoice(By locator, String... value) {
		List<WebElement> choiceList = driver.findElements(locator);
		System.out.println(choiceList.size());
		boolean flag = false;
		if (!value[0].trim().equalsIgnoreCase("all")) {
			for (WebElement e : choiceList) {
				String text = e.getText().trim();
				//System.out.println(text);

				for (int i = 0; i < value.length; i++) {
					if (text.equals(value[i])) {
						flag = true;
						e.click();
						break;
					}
				}

			}
		} else {
			// all selection logic:
			for (WebElement e : choiceList) {
				e.click();
				flag = true;
			}
		}
		
		if(flag == false) {
			System.out.println("choice is not available " + value[0]);
		}

	}

}
