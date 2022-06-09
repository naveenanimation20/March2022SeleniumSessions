package seleniumsessions;

import org.openqa.selenium.By;

public class CustomXpath_1 {

	public static void main(String[] args) {

		//xpath: is not an attribute
		//address of the element in html dom
		
		//html/body/div/div[2]/form/div[1]/div[3]/div/input
		//html/body/div/div[2]/div/ul/li/input
		//absolute xpath: not recommended
		//relative xpath: custom xpath: xpath axes
		
		//htmltag[@attr = 'value']
		//input[@id='input-email']
		
		//htmltag[@attr1 = 'value' and @attr2 = 'value']
		//input[@id='input-email' and @name='email']
		//input[@id='input-email' and @name='email' and @type='text']
		//input[@placeholder='E-Mail Address']
		
		//contains():
		//htmltag[contains(@attr,'value')]
		//input id = "test_123"
		//input id = "test_456"
		//input id = "test_890"
		//input[contains(@id,'test_')]

		//input[contains(@id,'firstname')]
		
		//htmltag[contains(@attr1,'value') and @attr2='value']
		//input[contains(@id,'firstname') and @name='firstname']
		
		//htmltag[contains(@attr1,'value') and contains(@attr2,'value')]
		//input[contains(@id,'firstname') and contains(@name,'first')]
		//input[@name='firstname' and contains(@id,'firstname') and contains(@placeholder,'First')]
		By firstName = By.xpath("//input[contains(@id,'firstname') and contains(@name,'first')]");
		
		//text():
		//htmltag[text()='value']
		//h1[text()='Register Account']
		By registerAccHeader = By.xpath("//h1[text()='Register Account']");
		//legend[text()='Your Personal Details']
		//a[text()='Register']
		//p[text()='Freshworks makes it fast and easy for businesses to delight their customers and employees.']
		
		//text() with attribute:
		//htmltag[text()='value' and @attr='value']
		//a[text()='Forgotten Password' and @class='list-group-item']
		
		
		//contains() with text():
		//htmltag[contains(text(),'value')]
		//legend[contains(text(),'Personal')]
		//p[contains(text(),'businesses to delight their customers')]
		
		//contains(), text() and attribute:
		//htmltag[contains(@attr,'value') and text()='value' and @attr='value']
		//a[contains(@href,'route=account/forgotten') and text()='Forgotten Password' and @class='list-group-item']
		//a[contains(@href,'route=account/forgotten') and contains(text(),'Forgotten') and contains(@class,'list-group')]
		
		
		//starts-with():
		//htmltag[starts-with(@attr,'value')]
		//input[starts-with(@name,'first')]
		//input[starts-with(@name,'first') and starts-with(@placeholder,'First')]
		
		
		//starts-with() and text():
		//htmltag[starts-with(text(),'value')]
		//h1[starts-with(text(),'Register')]
		
		//index:
		// (//input[@class='form-control'])[2]
		// (//input[@class='form-control'])[position()=2]
		By.xpath("(//input[@class='form-control'])[2]");
		
		//last():
		// (//input[@class='form-control'])[last()]
		// (//input[@class='form-control'])[last()-1]
		// ((//div[contains(@class,'navFooterLinkCol')])[last()]//li)[last()]/a
		
		//xpath axes:
		//parent and child:
		//parent tag / child tag - direct child elements
		//parent tag // child tag -- direct + indirect child elements

		//div[@id='content']//child::form
		//div[@id='content']//form//input[@name='email']
		
		//child to parent:
		//backward traversing in xpath: allowed
		//input[@name='email']/../../../../../../../../../..
		
		//input[@name='email']/parent::div
		//input[@name='email']/..
		//input[@name='email']/ancestor::form
		
		//preceding-sibling:
		//input[@name='email']/preceding-sibling::label[@for='input-email']
		
		//following-sibling:
		//label[@for='input-email']/following-sibling::input[@name='email']
		
		//label[normalize-space()='Yes']/input
		
		//a[text()='Joe.Root']/parent::td/preceding-sibling::td/input[@type='checkbox']
		
	}

}
