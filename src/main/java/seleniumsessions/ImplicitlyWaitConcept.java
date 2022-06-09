package seleniumsessions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitlyWaitConcept {

	public static void main(String[] args) {

		//1. global wait:
		//2. it will be applied for all the web elements by default
		//3. its not a custom wait for a specific web element
		//4. not applicable for non web elements: title, url, alert
		//5. only applicable for web elements
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//sel 3.x
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//sel 4.x
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		//1st page: home page
		driver.findElement(By.id("Form_submitForm_Name11")).sendKeys("naveen");//10
		driver.findElement(By.id("Form_submitForm_Email")).sendKeys("naveen@gmail.com");//10
		driver.findElement(By.id("Form_submitForm_Contact")).sendKeys("909909099");//10
		
		//2nd page: contact page:
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//sel 4.x
		//e4
		//e5
		//e6
		//click on home page:
		//1st page: home page : 5 secs:
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//sel 4.x
		//2nd page: contact page: 10 secs

		//3rd page: cart page: no wait: 0 sec - nullify of imp wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));//sel 4.x

		
		
		
		
		
		
	}

}
