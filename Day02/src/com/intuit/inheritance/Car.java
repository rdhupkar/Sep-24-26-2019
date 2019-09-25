package com.intuit.inheritance;

public class Car {
	private String model;
	private Engine engine;
	
	public Car(String theModel) {
		model = theModel;
		engine = new Engine();
	}
	
	public String getModel() {
		return model;
	}
}
