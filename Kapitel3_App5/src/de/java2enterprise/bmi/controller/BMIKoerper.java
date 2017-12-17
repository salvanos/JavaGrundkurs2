package de.java2enterprise.bmi.controller;

/**
 * Der K�rper eines BMI-Wesens
 * 
 *  @since 1.0.0
 *
 */
public interface BMIKoerper {
	
	/**
	 * Liefert das Gewicht eines BMI K�rpers
	 * 
	 * @return Das Gewicht des BMI K�rpers
	 */
	public double getGewicht();
	
	/**
	 * Liefert die Gr��e eines BMI K�rpers
	 * 
	 * @return Die Gr��e des BMI K�rpers
	 */
	public double getGroesse();
}
