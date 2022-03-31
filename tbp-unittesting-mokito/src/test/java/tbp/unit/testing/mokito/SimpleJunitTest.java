package tbp.unit.testing.mokito;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Raviteja Pullamsetty
 *
 */

public class SimpleJunitTest {
	@Test
	public void getIdTest() {
		// Create the Object and call the method
		assertEquals(1, 1);
	}
	
	@Before
	@Test
	public void beforeTest() {
		System.out.println("********before*");
		
	}
	@Test
	public void test() {
		System.out.println("********test*");
		
	}
	@After
	@Test
	public void afterTest() {
		System.out.println("********after*");
		
	}
	@AfterClass
	public static String afterClassTest() {
		System.out.println("********afterclass*");
		return null;
		
	}
	//it is used to execute huge code before each test also it is preferable to execute only once before running all tests
	@BeforeClass
	public static void beforeClassTest() {
		System.out.println("********beforeclass*");
		
	}

	@BeforeAll
	public static void init() {

	}

	@BeforeEach
	public void runBeforeEachTestMethod() {

	}

	@AfterAll
	public static void runAfterEachTestMethod() {

	}

	@AfterEach
	public void destroy() {

	}

}
