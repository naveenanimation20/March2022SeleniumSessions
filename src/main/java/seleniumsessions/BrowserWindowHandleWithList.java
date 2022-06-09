package seleniumsessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowHandleWithList {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");// parent window

		driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();

		Set<String> handles = driver.getWindowHandles();

		List<String> handlesList = new ArrayList<String>(handles);

		String parentWindowId = handlesList.get(0);
		System.out.println("parent window id: " + parentWindowId);

		String childWindowId = handlesList.get(1);
		System.out.println("child window id: " + childWindowId);

		driver.switchTo().window(childWindowId);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		driver.close();

		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		driver.quit();

	}

}
