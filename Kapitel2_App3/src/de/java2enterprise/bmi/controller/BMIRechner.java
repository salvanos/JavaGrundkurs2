package de.java2enterprise.bmi.controller;

public interface BMIRechner { 
	public final static double BMI_MAX = 25.0;
	public final static double BMI_MIN = 18.5;
	public final static int MAX_ANZAHL = 100;

	public default String pruefe(BMIKoerper k) {
		double bmi = k.getGewicht() / (k.getGroesse() * k.getGroesse());
		String ergebnis = null;
		if(bmi >= BMI_MAX) {
			ergebnis = "UEBERGEWICHTIG";
		} else if(bmi < BMI_MIN) {
			ergebnis = "UNTERGEWICHTIG";
		} else {
			ergebnis = "NORMALGEWICHTIG";
		}
		return ergebnis;
	}
}
