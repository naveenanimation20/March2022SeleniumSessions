package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QuitVsClose {

	public static void main(String[] args) {

		//session id
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();//123
		
		driver.get("https://www.google.com");//123
		
		String title = driver.getTitle();//123
		
		System.out.println(title);
		
		System.out.println(driver.getCurrentUrl());//123
		
		driver.quit(); //close the browser//123
		
		driver = new ChromeDriver();//456
		driver.get("https://www.google.com");//456
		System.out.println(driver.getTitle());//456
		
		
	}

}
