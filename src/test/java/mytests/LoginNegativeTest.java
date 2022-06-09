package mytests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginNegativeTest extends BaseTest {
	
	@DataProvider
	public Object[][] getLoginData() {
		return new Object[][] {
			{"testtttt@gmail.com", "test87778"},
			{"testtttt@gmail.com", "    "},
			{"testtttt@.@gmail.com", "test123"},
			{"naveenanimation20@gmail.com", "test87778"},
			{"    ", "   "},

		};
	}
	
	@Test(dataProvider = "getLoginData")
	public void loginTest(String username, String password) {
		Assert.assertTrue(doLogin(username, password));
	}

	public boolean doLogin(String username, String password) {
		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).sendKeys(username);
		
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		String errorMesg = driver.findElement(By.cssSelector("div.alert.alert-danger.alert-dismissible")).getText();
		System.out.println(errorMesg);

		if (errorMesg.contains("No match for E-Mail Address and/or Password")) {
			return true;
		}
		return false;
	}

}
