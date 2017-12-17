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

	/**
	 * Der Konstruktor mit varargs
	 * @param varargs 1.Name, 2.Groesse, 3.Gewicht
	 */
	public Katze(String... varargs) {
		if(varargs.length >= 1) {
			this.name = varargs[0];
			if(varargs.length >= 2) {
				this.groesse = Double.parseDouble(varargs[1]);
				if(varargs.length >= 3) {
					this.gewicht = Double.parseDouble(varargs[2]);
				}
			}
		}
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getGewicht() {
		return gewicht;
	}

	/**
	 * Setzt das Gewicht der Katze
	 * @param gewicht Das Gewicht der Katze
	 * @throws Eine KatzeException
	 */
	public void setGewicht(Double gewicht) throws KatzeException {
		if(gewicht.doubleValue() <= 0) {
			throw new KatzeException("Die Katze muss größer als 0.0 m sein!");
		}
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