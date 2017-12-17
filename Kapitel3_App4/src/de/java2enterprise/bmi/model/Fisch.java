package de.java2enterprise.bmi.model;

/**
 * Stellt den Datentypen für alle Fische dar.
 * 
 * @since 1.0.0
 *
 */
public class Fisch extends Lebewesen {

	/**
	 * {@inheritDoc}
	 * <p>Der Aufruf führt zu einer Gewichtszunahme.</p>
	 */
	public void isst() {
		super.setGewicht(super.getGewicht() + 0.001);
	}
	
	/**
	 * {@inheritDoc}
	 * <p>Der Aufruf führt zu einer Gewichtsabnahme.</p>
	 */
	public void spielt() {
		super.setGewicht(super.getGewicht() - 0.001);
	}
	
}
