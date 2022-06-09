package mytests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRMTest extends BaseTest {

	@Test(priority = 1, description = ".....checking page title contains amazon......")
	public void pageTitleTest() {
		String title = driver.getTitle();
		System.out.println("page title : " + title);
		Assert.assertEquals(title, "OrangeHRM", "....orange hrm page title is not matched....");
	}

	@Test(priority = 2, description = ".....checking page url contains orage hrm......")
	public void pageUrlTest() {
		String url = driver.getCurrentUrl();
		System.out.println("page url : " + url);
		Assert.assertTrue(url.contains("orangehrm-30-day-trial"),".....orange hrm page url is not matched with orangehrm-30-day-trial");
	}

}
