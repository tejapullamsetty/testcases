package com.example.powermokito;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.powermokito.mockexample.PowerMockExample;

@PrepareForTest(PowerMockExample.class)
@SpringBootTest
class PowerMokitoExampleApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void checkStaticMethod() {

		String name = "TalentSprint";
		String success = "Success";

		PowerMockito.mockStatic(PowerMockExample.class);

		PowerMockito.when(PowerMockExample.powerMockExample(name)).thenReturn(success);

		String result = PowerMockExample.powerMockExample(name);

		assertEquals(success, result);
	}

	@Test
	public void privateMethodTest() throws Exception {

		String name = "TalentSprint";
		String success = "Success";
		
		PowerMockExample powerMockExample = PowerMockito.spy(new PowerMockExample());

		PowerMockito.doReturn(success).when(powerMockExample, "methodExample", name);
		
		String result = PowerMockExample.powerMockExample(name);
		
		assertEquals(success, result);
		
		PowerMockito.verifyPrivate(getClass());	

	}
	
	@Test
	public void finalMethodTest() throws Exception {
		String name = "TalentSprint";

		PowerMockExample powerMockExample = PowerMockito.mock(PowerMockExample.class);

		PowerMockito.whenNew(PowerMockExample.class).withNoArguments().thenReturn(powerMockExample);

		PowerMockExample powerMockExample1 = new PowerMockExample();

		PowerMockito.verifyNew(PowerMockExample.class).withNoArguments();

		PowerMockito.when(powerMockExample1.finalExample(name)).thenReturn(name);

		String result = powerMockExample1.finalExample(name);
		Mockito.verify(powerMockExample1).finalExample(name);
		assertEquals(name, result);

	}
	
	@Before
	public void beforeTest() {
		System.out.println("********before*");
		
	}
	@Test
	public void test() {
		System.out.println("********test*");
		
	}
	@After
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

}
