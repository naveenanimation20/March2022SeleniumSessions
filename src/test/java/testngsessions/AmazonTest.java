package testngsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTest {

	WebDriver driver;

	@BeforeTest(description = ".....setup for amazon test: launch chrome and enter url.....")
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.com");
	}

	@Test(priority = 1, description = ".....checking page title contains amazon......")
	public void pageTitleTest() {
		String title = driver.getTitle();
		System.out.println("page title : " + title);
		Assert.assertEquals(title, "Amazon.com. Spend less. Smile more.11", "....amazon page title is not matched....");
	}

	@Test(priority = 3, description = ".....checking page url contains amazon......")
	public void pageUrlTest() {
		String url = driver.getCurrentUrl();
		System.out.println("page url : " + url);
		Assert.assertTrue(url.contains("amazon"), ".....amazon page url is not matched with amazon");
	}

	@Test(priority = 2, enabled = true, description = ".....checking search field exist on login page......")
	public void isSearchExistTest() {
		boolean flag = driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@AfterTest(description = "....closing the browser.....")
	public void tearDown() {
		driver.quit();
	}

}
