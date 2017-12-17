package de.java2enterprise.bmi.controller;

/**
 * Der Rechner für den Body-Mass-Index
 * 
 * @since 1.0.0
 */
public interface BMIRechner extends BMI {
	
	/**
	 * Überprüft einen BMIKoerper.
	 * 
	 * @param k Der BMIKoerper der geprüft werden soll.
	 * @return UEBERGEWICHTIG, UNTERGEWICHTIG oder NORMALGEWICHTIG
	 */
	public String pruefe(BMIKoerper k);
}
