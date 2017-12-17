package de.java2enterprise.bmi.model;

public class Messung {
	private long millis;
	private Double gewicht;
	
	public Messung(long millis, Double gewicht) {
		this.millis = millis;
		this.gewicht = gewicht;
	}

	public long getMillis() {
		return millis;
	}

	public void setMillis(long millis) {
		this.millis = millis;
	}

	public Double getGewicht() {
		return gewicht;
	}

	public void setGewicht(Double gewicht) {
		this.gewicht = gewicht;
	}
	
}
