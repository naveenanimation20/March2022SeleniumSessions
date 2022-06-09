package testngsessions;

import org.testng.annotations.Test;

public class PriorityTest {

	@Test(priority = 1)
	public void a_test() {
		System.out.println(" a test ");
	}

	@Test(priority = 'b')
	public void b_test() {
		System.out.println(" b test ");
	}

	@Test(priority = 'a')
	public void c_test() {
		System.out.println(" c test ");
	}

	@Test(priority = 'd')
	public void d_test() {
		System.out.println(" d test ");
	}

	@Test(priority = 'e')
	public void e_test() {
		System.out.println(" e test ");
	}

}
