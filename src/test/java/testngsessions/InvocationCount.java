package testngsessions;

import org.testng.annotations.Test;

public class InvocationCount {

	@Test(invocationCount = 10)
	public void createUserTest() {
		System.out.println("create User Test");
	}

}
