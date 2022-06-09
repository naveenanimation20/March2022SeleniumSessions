package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FooterList {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/ae/");
		List<WebElement> footerList = 
					driver.findElements(By.xpath("//div[@class='footer-main']//ul//a"));
		
		footerList.stream().forEach(e -> System.out.println(e.getText()));
		//add filter also to avoid blank text values
	}

}
