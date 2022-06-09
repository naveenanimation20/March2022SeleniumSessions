package seleniumsessions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WDMTest {

	public static void main(String[] args) throws MalformedURLException {
		//WebDriverManager.chromedriver().setup();
		//ChromeOptions co = new ChromeOptions();
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");
		//co.setCapability("detach", true);
//		co.setExperimentalOption("detach", true);
		//WebDriver driver = WebDriverManager.chromedriver().capabilities(co).create();
		
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:9515"), cap);
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		//driver.quit();
		
		
	}

}
