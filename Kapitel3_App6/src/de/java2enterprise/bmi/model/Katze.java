package de.java2enterprise.bmi.model;

/**
 * Stellt den Datentypen f�r alle Katzen dar.
 * 
 * @since 1.0.0
 *
 */
public class Katze extends Lebewesen {

	/**
	 * {@inheritDoc}
	 * <p>Der Aufruf f�hrt zu einer Gewichtszunahme.</p>
	 */
	@Override
	public void isst() {
		super.setGewicht(super.getGewicht() + 0.1);
	}
	
	/**
	 * {@inheritDoc}
	 * <p>Der Aufruf f�hrt zu einer Gewichtsabnahme.</p>
	 */
	@Override
	public void spielt() {
		super.setGewicht(super.getGewicht() - 0.1);
	}
	
	
}
