package de.java2enterprise.bmi.model;

public abstract class Lebewesen {

	private String name;
	private double gewicht;
	private double groesse;

	public Lebewesen() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGewicht() {
		return gewicht;
	}

	public void setGewicht(double gewicht) {
		this.gewicht = gewicht;
	}

	public double getGroesse() {
		return groesse;
	}

	public void setGroesse(double groesse) {
		this.groesse = groesse;
	}
	
	public abstract void isst();
	
	public abstract void spielt();

}