package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DifferentLocators {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
				
		//1. id: always unique attribute -- I
		//2. name: can be duplicate -- II
//		driver.findElement(By.name("email")).sendKeys("test@gmail.com");
//		driver.findElement(By.name("password")).sendKeys("test@123");
//		
//		By email = By.name("email");
//		By password = By.name("password");
//		doSendKeys(email, "naveen@gmail.com");
		
		//3. class name: is not a unique attribute, can be duplicate -- III
		//used only when we have unique class name for the element
		//driver.findElement(By.className("form-control")).sendKeys("test@gmail.com");
		
		//4. xpath: is not an attribute, its the address of the element in html DOM
//		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("test@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("test@123");
//		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
//		By email = By.xpath("//*[@id=\"input-email\"]");
//		By password = By.xpath("//*[@id=\"input-password\"]");
//		By loginBtn = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
//		doSendKeys(email, "test@gmail.com");
//		doSendKeys(password, "test@123");
//		doClick(loginBtn);
//		
//		String email_xpath = "//*[@id=\"input-email\"]";
//		String password_xpath = "//*[@id=\"input-password\"]";
//		String login_btn_xpath = "//*[@id=\"content\"]/div/div[2]/div/form/input";
//		
//		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.doSendKeys("XPath", email_xpath, "test@gmail.com");
		
		//5. css selector: not an attribute.
//		driver.findElement(By.cssSelector("#input-email")).sendKeys("test@gmail.com");
//		driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input")).click();
		
		//6. link text: only for links
		//driver.findElement(By.linkText("Register")).click();
//		String text = driver.findElement(By.linkText("Register")).getText();
//		System.out.println(text);
//		
//		By registerLink = By.linkText("Register");
//		if(doGetText(registerLink).equals("Register")) {
//			System.out.println("PASS");
//		}
		
		//7. partial link text: only for links having a long text
		//Forgotten password
		//Forgotten userid
		//driver.findElement(By.partialLinkText("Forgotten")).click();
		
		//8. tag name:
		String header = driver.findElement(By.tagName("h2")).getText();
		System.out.println(header);
	}
	
	public static String doGetText(By locator) {
		return getElement(locator).getText();
	}
	
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	
	
	
	
	
	

}
