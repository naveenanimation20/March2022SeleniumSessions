package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPopUp {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		//type = file is mandatory
		//driver.findElement(By.name("upfile")).sendKeys("/Users/naveenautomationlabs/Downloads/GIT_Course.png");
			//c:\\users\\documents\\
		driver.findElement(By.name("upfile")).sendKeys("/Users/naveenautomationlabs/Documents/workspace/March2022SeleniumSessions/GIT_Course.png");

		//Robot 
		//autoIT
		//sikuli -- image based
		
	} 

}
