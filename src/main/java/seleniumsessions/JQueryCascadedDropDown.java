package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JQueryCascadedDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		
		int i = 1;
		int j=0;
		while(i<=10) {
			System.out.println(i);
			j=i++;
			//break;
		}
		System.out.println(i);
		System.out.println(j);
		

//		WebDriverManager.chromedriver().setup();
//
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
//		driver.findElement(By.id("justAnInputBox1")).click();
//		Thread.sleep(2000);
//		
//		List<WebElement> list = driver.findElements(By.xpath("//h3[text()='Multi Selection With Cascade Option Select']/parent::div//div[@class='comboTreeDropDownContainer']/ul/li"))
//					;
//		
//		for(WebElement e : list) {
//			e.click();
//			Thread.sleep(1000);
//		}

}
}
