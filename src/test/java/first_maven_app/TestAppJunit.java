package first_maven_app;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAppJunit {

	@Test
	public void test() {
		AppCalculation Apt = new AppCalculation();
		int expected=10;
		int actual = AppCalculation.addNumbers();
		assertEquals(expected,actual);
	}

}
