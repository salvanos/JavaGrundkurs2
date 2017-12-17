package de.java2enterprise.bmi;

import de.java2enterprise.bmi.controller.BMIRechner;
import de.java2enterprise.bmi.model.Katze;
import de.java2enterprise.bmi.model.Lebewesen;

public class App {
	
	public static void main(String[] args) {
		Lebewesen lebewesen = new Katze();
		lebewesen.setName("Pinki");
		lebewesen.setGroesse(0.51);
		lebewesen.setGewicht(6.1);
		
		BMIRechner rechner = new BMIRechner();
		String ergebnis = rechner.pruefe(lebewesen);
		System.out.println("BMI [ergebnis= " + ergebnis + "] ");
		
	}

}
