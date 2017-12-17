package de.java2enterprise.bmi;

import java.util.Scanner;

import de.java2enterprise.bmi.controller.BMI;
import de.java2enterprise.bmi.controller.BMIKoerper;
import de.java2enterprise.bmi.controller.BMIRechner;
import de.java2enterprise.bmi.model.*;

/**
 * Die <b>Startklasse</b> des Programms.
 * 
 * @see java.util.Scanner#next()
 * @since 1.0.0
 */
public class App {
	private Scanner scanner = new Scanner(System.in);
	private Katze katze = new Katze();
	private String[] ergebnisse = new String[BMI.MAX_ANZAHL];
	private int index = -1;
	
	public static void main(String[] args) {
		new App();
	}
	
	private App() {
		System.out.println("BMI [Programm Start]");
		System.out.print("BMI [Geben Sie den Namen ein] > ");
		String name = scanner.next();
		katze.setName(name);
		
		System.out.print("BMI [Geben Sie die Groesse[m] ein] > ");
		double groesse = scanner.nextDouble();
		katze.setGroesse(groesse);
				
		boolean nochmal=true;
		while(nochmal && index < BMI.MAX_ANZAHL) {
			System.out.print("BMI [Eingabe Ausgabe Ende] > ");
			String auswahl = scanner.next().toLowerCase();
			if("eingabe".equals(auswahl)) {
				gibEin();
			} else if("ausgabe".equals(auswahl)) {
				gibAus();
			} else if("ende".equals(auswahl)) {
				nochmal = false;
			} else {
				System.out.println("BMI [Falsche Eingabe!]");
			}
		}
		scanner.close();
		System.out.println("BMI [Programm Ende]");
	}
	
	private void gibEin() {		
		System.out.print("BMI [Geben Sie das Gewicht[kg] ein] > ");
		double gewicht = scanner.nextDouble();
		katze.setGewicht(gewicht);

		BMIRechner rechner = new BMIRechner() {
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
		};
		ergebnisse[++index] = rechner.pruefe(katze);
	}

	private void gibAus() {
		System.out.println(katze);
		int i = -1;
		for(String ergebnis : ergebnisse) {
			if(++i > index) {
				break;
			}
			System.out.println("BMI [ergebnis= " + ergebnis + "] ");
		}
	}

}
