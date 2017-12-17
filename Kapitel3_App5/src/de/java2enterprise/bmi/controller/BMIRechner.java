package de.java2enterprise.bmi.controller;

/**
 * Der Rechner f�r den Body-Mass-Index
 * 
 * @since 1.0.0
 */
public interface BMIRechner extends BMI {
	
	/**
	 * �berpr�ft einen BMIKoerper.
	 * 
	 * @param k Der BMIKoerper der gepr�ft werden soll.
	 * @return UEBERGEWICHTIG, UNTERGEWICHTIG oder NORMALGEWICHTIG
	 */
	public String pruefe(BMIKoerper k);
}
