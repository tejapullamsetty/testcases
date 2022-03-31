package tbp.unit.testing.mokito;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
		assertEquals(10, 10);
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
