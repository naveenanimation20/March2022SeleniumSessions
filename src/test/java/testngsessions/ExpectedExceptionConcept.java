package testngsessions;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {

	String name;
	
	@Test(expectedExceptions = {NullPointerException.class, ArithmeticException.class})
	public void loginTest() {
		System.out.println("login test");
		int i = 9/3;
		
		ExpectedExceptionConcept obj = new ExpectedExceptionConcept();
		obj.name = "Naveen";
		//obj = null;
		System.out.println(obj.name);
	}
	
	
}
