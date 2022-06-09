package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomCSSSelector {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		//css selector - is not an attribute
		
		//id and class
		// #id or tag#id
		// .class or tag.class
		
		// #input-email or input#input-email
		// .form-control or input.form-control
		// #id.class
		// .class#id
		// #input-email.form-control
		// input#input-email.form-control
		// input.form-control#input-email
		
		// .c1.c2.c2...cn
		// tag.c1.c2.c3....cn
		// input.form-control.private-form__control.login-email
		// input.form-control.private-form__control.login-email#username
		// input#username.form-control.private-form__control.login-email
		
		// tag[attr='value']
		// input[name='email']
		// input[name='email'][type='text']
		// input[name='email'][type='text'][placeholder='E-Mail Address']
		
		By.cssSelector("#input-email");
		
		//form-control private-form__control login-email -- 3
		By.className("form-control private-form__control login-email");//wrong
		By.xpath("//input[@class='form-control private-form__control login-email']");//right
		By.cssSelector("input.form-control.private-form__control.login-email");//right
		By.className("login-email");//right
		By.className("private-form__control");//right
		
		//parent to child:
		//div.private-form__input-wrapper > input#username -- direct child element
		//div.private-form__input-wrapper  input#username -- direct + indirect child elements
		//form#hs-login input -- 3
		//form#hs-login > input --0
		
		//child to parent: NA
		//backward trvaersing is not allowed in CSS
		
		// input[id*='name'][type='email'][class*='form-control'] --contains
		// input[id^='user'] -- statswith
		// input[id$='name'] --endswith
		
		//preceding-sibling: NA
		//following-sibling: label.control-label + input#input-email
		
		//no text support
		//comma in css:
		int mand_fieldsCount = driver.
							findElements
					(By.cssSelector("input#username, input#password, button#loginBtn, input#remember")).size();
		
		//not in css:
		//form-control private-form__control login-email
		//form-control private-form__control login-password m-bottom-3
		
		//input.form-control.private-form__control:not(#username)
		
		//                 xpath            |        cssSelector
		//1. syntax:       hard							simple
		//2. backward:     possible						NA
		//3. performance:  same							same
		//4. comma, not: 	NA							available
		//5. text: 			available						NA
		//6. sibling: 		better support				only direct forward sibling
		//7. dynamic ele: 	available						available
		//8. webtable: 		better support				not that great
		
		
		
		
		
		
	}

}
