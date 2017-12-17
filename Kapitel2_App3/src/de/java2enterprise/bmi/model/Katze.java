package de.java2enterprise.bmi.model;

public class Katze extends Lebewesen {
	
	public void isst() {
		super.setGewicht(super.getGewicht() + 0.1);
	}
	
	public void spielt() {
		super.setGewicht(super.getGewicht() - 0.1);
	}
	
	
}
