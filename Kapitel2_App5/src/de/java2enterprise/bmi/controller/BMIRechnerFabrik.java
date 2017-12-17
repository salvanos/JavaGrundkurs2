package de.java2enterprise.bmi.controller;

public class BMIRechnerFabrik {
	public static BMIRechner createInstance() {
		return new BMIRechnerImpl();
	}
}
