package seleniumsessions;

import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TopCastingOptions {

	public static void main(String[] args) {

		
		//1. Recommended for local execution
		//WebDriver driver = new ChromeDriver();
		
		//2. Not Recommended
		//SearchContext driver = new ChromeDriver();
		
		//3. only for chrome browser
		//ChromeDriver driver = new ChromeDriver();
		
		//4. Recommended for local execution
//		RemoteWebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com");
//		driver.getTitle();
//		driver.getCurrentUrl();
//		driver.close();
		
		//5. Recommended for remote GRID execution: cloud, remote, AWS
		//WebDriver driver = new RemoteWebDriver(new URL("192.189.90.99:4444"), capabilities);
		
		//6. only for edge and chrome: not recommended
		//ChromiumDriver driver = new EdgeDriver();
		//WebDriver driver = new OperaDriver();//sel 4.x -- OperaDriver is deprecated
		
	}

}
