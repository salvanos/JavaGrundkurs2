package de.java2enterprise.bmi.controller;

public interface BMIRechner extends BMI { 
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
