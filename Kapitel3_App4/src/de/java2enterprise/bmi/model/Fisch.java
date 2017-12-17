package de.java2enterprise.bmi.model;

/**
 * Stellt den Datentypen f�r alle Fische dar.
 * 
 * @since 1.0.0
 *
 */
public class Fisch extends Lebewesen {

	/**
	 * {@inheritDoc}
	 * <p>Der Aufruf f�hrt zu einer Gewichtszunahme.</p>
	 */
	public void isst() {
		super.setGewicht(super.getGewicht() + 0.001);
	}
	
	/**
	 * {@inheritDoc}
	 * <p>Der Aufruf f�hrt zu einer Gewichtsabnahme.</p>
	 */
	public void spielt() {
		super.setGewicht(super.getGewicht() - 0.001);
	}
	
}
