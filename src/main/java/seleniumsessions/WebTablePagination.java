package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTablePagination {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");

		int pageCount = 1;
		while (true) {

			if (driver.findElements(By.xpath("//td[text()='Parker']")).size()>0) {
				selectCity("Parker");
				System.out.println("page count: " + pageCount);
				break;
			}
			else {
				//pagination logic:
				//click on next:
				WebElement next = driver.findElement(By.linkText("Next"));
					if(next.getAttribute("class").contains("disabled")) {
						System.out.println("pagination is over...recrod is not found....");
						break;
					}
				next.click();
				Thread.sleep(1500);
				pageCount++;
			}
		}

	}
	
	public static void selectCity(String cityName) {
		driver.findElement(By.xpath("//td[text()='"+cityName+"']/preceding-sibling::td/input[@type='checkbox']"))
			.click();
	}

}
