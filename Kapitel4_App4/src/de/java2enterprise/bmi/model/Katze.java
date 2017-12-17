package de.java2enterprise.bmi.model;

import de.java2enterprise.bmi.controller.BMIKoerper;

/**
 * Stellt den Datentypen für alle Katze dar.
 * 
 * @since 1.0.0
 */
public class Katze implements BMIKoerper {

	private String name;
	private double gewicht;
	private double groesse;

	public Katze() {
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

	@Override
	public String toString() {
		return "Katze [name=" + name + ", gewicht=" + gewicht + ", groesse=" + groesse + "]";
	}
}