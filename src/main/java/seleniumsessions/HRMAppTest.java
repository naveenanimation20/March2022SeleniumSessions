package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HRMAppTest {

	public static void main(String[] args) {

		
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.init_driver("chrome");
		
		brUtil.launchUrl("https://www.orangehrm.com/orangehrm-30-day-trial/");
		System.out.println(brUtil.getPageTitle());
		System.out.println(brUtil.getPageUrl());
		
		By name = By.id("Form_submitForm_Name");
		By email = By.id("Form_submitForm_Email");
		By tele = By.id("Form_submitForm_Contact");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(name, "naveen");
		eleUtil.doSendKeys(email, "naveen@gmail.com");
		eleUtil.doSendKeys(tele, "9999999");
		
		brUtil.closeBrowser();
	}

}
