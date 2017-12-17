package de.java2enterprise.bmi.controller;

/**
 * Der Körper eines BMI-Wesens
 * 
 *  @since 1.0.0
 *
 */
public interface BMIKoerper {
	
	/**
	 * Liefert das Gewicht eines BMI Körpers
	 * 
	 * @return Das Gewicht des BMI Körpers
	 */
	public double getGewicht();
	
	/**
	 * Liefert die Größe eines BMI Körpers
	 * 
	 * @return Die Größe des BMI Körpers
	 */
	public double getGroesse();
}
