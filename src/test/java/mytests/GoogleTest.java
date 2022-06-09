package mytests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {

	@Test(priority = 1, description = ".....checking page title contains google......")
	public void pageTitleTest() {
		String title = driver.getTitle();
		System.out.println("page title : " + title);
		Assert.assertEquals(title, "Google", "....Google page title is not matched....");
	}

	@Test(priority = 2, description = ".....checking page url contains google......")
	public void pageUrlTest() {
		String url = driver.getCurrentUrl();
		System.out.println("page url : " + url);
		Assert.assertTrue(url.contains("google"), ".....google page url is not matched with google");
	}

}
