package de.java2enterprise.bmi;

import java.util.Scanner;

import de.java2enterprise.bmi.controller.BMIRechner;
import de.java2enterprise.bmi.model.Katze;
import de.java2enterprise.bmi.model.Lebewesen;

public class App {
	private Scanner scanner = new Scanner(System.in);
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
		scanner.close();
		System.out.println("BMI [Programm Ende]");
	}
	
	private void gibEin() {
		lebewesen = new Katze();
		
		System.out.print("BMI [Geben Sie den Namen ein] > ");
		String name = scanner.next();
		lebewesen.setName(name);
		
		System.out.print("BMI [Geben Sie die Groesse[m] ein] > ");
		double groesse = scanner.nextDouble();
		lebewesen.setGroesse(groesse);
		
		System.out.print("BMI [Geben Sie das Gewicht[kg] ein] > ");
		double gewicht = scanner.nextDouble();
		lebewesen.setGewicht(gewicht);
	}

	private void verarbeite() {
		BMIRechner rechner = new BMIRechner();
		ergebnis = rechner.pruefe(lebewesen);
	}

	private void gibAus() {
		System.out.println("BMI [ergebnis= " + ergebnis + "] ");
	}

}
