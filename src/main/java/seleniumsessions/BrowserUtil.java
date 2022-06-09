package seleniumsessions;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {

	private WebDriver driver;

	public WebDriver init_driver(String browserName) {

		System.out.println("browser name is : " + browserName);

		if (browserName.equals("chrome")) {
			//System.setProperty("webdriver.chrome.driver", "/Users/naveenautomationlabs/Downloads/chromedriver");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} 
		else if (browserName.equals("firefox")) {
			//System.setProperty("webdriver.gecko.driver", "/Users/naveenautomationlabs/Downloads/geckodriver");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} 
		else if (browserName.equals("safari")) {
			driver = new SafariDriver();
		}
		else if (browserName.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

		else {
			System.out.println("please pass the right browser...." + browserName);
		}
		return driver;
	}

	public void launchUrl(URL url) {
		driver.navigate().to(url);
	}

	public void launchUrl(String url) {
		// google.com
		if (url == null) {
			System.out.println("url is null...");
			return;
		}

		if (url.indexOf("http") == -1 || url.indexOf("https") == -1) {
			System.out.println("http(s) is missing in the url...");
			try {
				throw new Exception("HTTPMISSINGEXCEPTION");
			} catch (Exception e) {
				System.out.println("http (s) is missing....");
			}

		}

		driver.get(url);
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	public String getPageUrl() {
		return driver.getCurrentUrl();
	}

	public void closeBrowser() {
		driver.close();
	}

	public void quitBrowser() {
		driver.quit();
	}

}
