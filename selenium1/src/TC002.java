//package testngtopic;

import org.testng.annotations.Test;

public class TC002 {
	@Test
	public void testLogin() {
		System.out.println("Hello from TestNG");
		throw new ArithmeticException("Failure");
	}
}
