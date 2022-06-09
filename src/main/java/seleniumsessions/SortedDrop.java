package seleniumsessions;

import java.util.Collections;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SortedDrop {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://opencart.antropy.co.uk/index.php?route=account/register");
		
		Select select = new Select(driver.findElement(By.id("input-country")));
		select.getOptions().stream().map( e -> e.getText()).forEach(e -> System.out.println(e));

	}

}
