package com.example.powermokito;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
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

}
