package de.java2enterprise.bmi;

import de.java2enterprise.bmi.controller.BMIRechner;
import de.java2enterprise.bmi.model.Katze;
import de.java2enterprise.bmi.model.Lebewesen;

public class App {
	private Lebewesen lebewesen;
	private String ergebnis;
	
	public static void main(String[] args) {
		new App();
	}
	
	private App() {
		System.out.println("BMI [Programm Start]");
		gibEin();
		verarbeite();
		gibAus();
		System.out.println("BMI [Programm Ende]");
	}
	
	private void gibEin() {
		lebewesen = new Katze();
		lebewesen.setName("Pinki");
		lebewesen.setGroesse(0.51);
		lebewesen.setGewicht(6.1);
	}

	private void verarbeite() {
		BMIRechner rechner = new BMIRechner();
		ergebnis = rechner.pruefe(lebewesen);
	}

	private void gibAus() {
		System.out.println("BMI [ergebnis= " + ergebnis + "] ");
	}

}
