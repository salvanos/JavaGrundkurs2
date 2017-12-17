package de.java2enterprise.bmi.controller;

class BMIRechnerImpl  {
	class BMISommerRechnerImpl implements BMIRechner{
		public String pruefe(BMIKoerper k) {
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
	
	class BMIWinterRechnerImpl implements BMIRechner{
		public final static int TOLERANZ = 1;
		
		public String pruefe(BMIKoerper k) {
			double bmi = k.getGewicht() / (k.getGroesse() * k.getGroesse());
			String ergebnis = null;
			if(bmi >= BMI_MAX + TOLERANZ) {
				ergebnis = "UEBERGEWICHTIG";
			} else if(bmi < BMI_MIN) {
				ergebnis = "UNTERGEWICHTIG";
			} else {
				ergebnis = "NORMALGEWICHTIG";
			}
			return ergebnis;
		}
	}
}
