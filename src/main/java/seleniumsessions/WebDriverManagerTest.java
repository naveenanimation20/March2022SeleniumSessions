package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerTest {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();//launch browser
		driver.get("https://www.google.com");//enter url
		
		String title = driver.getTitle();//get the title
		System.out.println("page title:" + title);	
		
		//checkpoint/verification/exp vs act result:
		if(title.equals("Google")) {
			System.out.println("correct title");
		}
		else {
			System.out.println("incorrect title");
		}
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//automation testing --> automation steps + verification point
		
		//driver.quit();
		driver.close();
		
		
	}

}
