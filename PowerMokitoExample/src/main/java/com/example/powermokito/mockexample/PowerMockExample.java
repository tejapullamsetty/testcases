package com.example.powermokito.mockexample;

public class PowerMockExample {
	
	public static String powerMockExample(String name) {
		return name;
	}
	
	private String powerMockPrivate(String name) {
		return name;
	}
	
	public String exampleForPrivate(String name) {
		return powerMockPrivate(name);
	}
	
	public final String finalExample(String name) {
		return name;
	}

}
