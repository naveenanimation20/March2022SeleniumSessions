package testngsessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotations {
	
	/**
	 *  BS - DB connection
		BT - createUser
		BC - launchBrowser and url

					BM - loginToApp
					getPageTitleTest
					AM -- logout

					BM - loginToApp
					searchTest
					AM -- logout

					BM - loginToApp
					userInfoTest
					AM -- logout

		AC -- closeBrowser
		AT -- deleteUser
		AS -- disconnectDB
	 */
	
	

	@BeforeSuite // 1
	public void DBConnection() {
		System.out.println("BS - DB connection");
	}

	@BeforeTest // 2
	public void createUser() {
		System.out.println("BT - createUser");

	}

	@BeforeClass // 3
	public void launchBrowser() {
		System.out.println("BC - launchBrowser and url");

	}

	@BeforeMethod // 4 //7  //10
	public void loginToApp() {
		System.out.println("BM - loginToApp");
	}

	@Test //5
	public void getPageTitleTest() {
		System.out.println("getPageTitleTest");
	}

	@Test //11
	public void userInfoTest() {
		System.out.println("userInfoTest");
	}

	@Test//8
	public void searchTest() {
		System.out.println("searchTest");
	}

	@AfterMethod //6 //9 //12
	public void logout() {
		System.out.println("AM -- logout");
	}

	@AfterClass //13
	public void closeBrowser() {
		System.out.println("AC -- closeBrowser");
	}

	@AfterTest //14
	public void deleteUser() {
		System.out.println("AT -- deleteUser");
	}

	@AfterSuite //15
	public void disconnectDB() {
		System.out.println("AS -- disconnectDB");
	}

}
