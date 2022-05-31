import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testAdd() {
		// fail("No yet implemented");
		int a = 1234;
		int b = 8765;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
			
		int expected = 9999;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testSubtract() {
		// arrange
		int a = 9876;
		int b = 4321;
		
		Calculator cal = new Calculator();
		
		// act
		int actual = cal.subtract(a, b);
		
		// assert
		int expected = 5555;
		assertEquals (actual, expected);
	}
	
	@Test
	public void testMultiple() {
		// arrange
		int a = 2468;
		int b = 1357;
		
		Calculator cal = new Calculator();
		
		// act
		int actual = cal.multiple(a, b);
		
		// assert
		int expected = 3349076;
		assertEquals (expected, actual);
	}
	
	@Test
	public final void testDivide() {
		// arrange
		int a = 4000;
		int b = 1000;
		
		Calculator cal = new Calculator();
		
		// act
		int actual = cal.divide(a, b);
		
		// assert
		int expected = 4;
		assertEquals (actual, expected);
	}

}
