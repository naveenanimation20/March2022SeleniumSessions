package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinks {
	static WebDriver driver;

	public static void main(String[] args) {

		// total links on the page
		// print the text of each link on the console
		// ignore the blank text

		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		List<WebElement> linksList = driver.findElements(By.tagName("a"));

		System.out.println("total links: " + linksList.size());
		
//		for(int i=0; i<linksList.size(); i++) {
//			String text = linksList.get(i).getText();
//				if(!text.isEmpty()) {
//					System.out.println(text);
//				}
//		}
		
//		for(WebElement e : linksList) {
//			String text = e.getText();
//			if(!text.isEmpty()) {
//				System.out.println(text);
//			}
//		}
		
		linksList
			.stream()
				.filter(e -> !e.getText().isEmpty())
					.forEach(e -> System.out.println(e.getText()));
					
		
	}

}
