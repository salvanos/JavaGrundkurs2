package de.java2enterprise.bmi.model;

public class Fisch extends Lebewesen {

	public void isst() {
		super.setGewicht(super.getGewicht() + 0.001);
	}
	
	public void spielt() {
		super.setGewicht(super.getGewicht() - 0.001);
	}
	
}
