package testngsessions;

import org.testng.annotations.Test;

public class DependsOnMethodsConcept {
	
	//AAA Rule:
	//Arrange Act assert
	
	@Test
	public void loginTest() {
		System.out.println("login test");
		int i = 9/0;
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void dashboardTest() {
		System.out.println("dashboardTest");
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void searchTest() {
		System.out.println("searchTest");
	}
	

}
