package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium4NewWindow {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		String parentWindowId = driver.getWindowHandle();
		
		driver.switchTo().newWindow(WindowType.WINDOW);//sel4.x feature

		driver.navigate().to("https://www.amazon.com");
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("txtUsername")).sendKeys("admin");

		driver.quit();
	}

}
