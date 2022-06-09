package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowHandle {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");//parent window
		
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
		//child window/tab will be opened
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parentWindowId = it.next();
		System.out.println("parent window id is : " + parentWindowId);
		String childWindowId = it.next();
		System.out.println("child window id is : " + childWindowId);

		//switch work:
		driver.switchTo().window(childWindowId);
		System.out.println("child window title is: " + driver.getTitle());
		driver.close();//close the child window
		
		driver.switchTo().window(parentWindowId);
		System.out.println("parent window title is: " + driver.getTitle());

		driver.quit();
		
		
	}

}
