package de.java2enterprise.bmi.model;

import de.java2enterprise.bmi.controller.BMIKoerper;

/**
 * Stellt den Datentypen für alle Katze dar.
 * 
 * @since 1.0.0
 */
public class Katze implements BMIKoerper {
	private String name;
	private Double gewicht;
	private Double groesse;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getGewicht() {
		return gewicht;
	}

	public void setGewicht(Double gewicht) {
		this.gewicht = gewicht;
	}

	public Double getGroesse() {
		return groesse;
	}

	public void setGroesse(Double groesse) {
		this.groesse = groesse;
	}

	@Override
	public String toString() {
		return "Katze [name=" + name + ", gewicht=" + gewicht + ", groesse=" + groesse + "]";
	}
}