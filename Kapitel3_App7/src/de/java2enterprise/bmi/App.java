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
	private Lebewesen lebewesen;
	private String[] ergebnisse = new String[BMI.MAX_ANZAHL];
	private int index = -1;
	
	public static void main(String[] args) {
		new App();
	}
	
	private App() {
		System.out.println("BMI [Programm Start]");
		
		boolean nochmal=true;
		while(nochmal && index < BMI.MAX_ANZAHL) {
			System.out.print("BMI [1=Eingabe 2=Essen 3=Spielen 4=Verarbeiten 5=Ausgabe 6=Ende] > ");
			int auswahl = scanner.nextInt();
			if(auswahl == 1) {
				gibEin();
			} else if(auswahl == 2) {
				lebewesen.isst();
			} else if(auswahl == 3) {
				lebewesen.spielt();
			} else if(auswahl == 4) {
				verarbeite();
			} else if(auswahl == 5) {
				gibAus();
			} else if(auswahl == 6) {
				nochmal = false;
			} else {
				System.out.println("BMI [Falsche Eingabe!]");
			}
		}
		scanner.close();
		System.out.println("BMI [Programm Ende]");
	}
	
	private void gibEin() {
		while(true) {
			System.out.print("BMI [1=Katze 2=Fisch] > ");
			int lebewesenTyp = scanner.nextInt();
			if(lebewesenTyp == 1) {
				lebewesen = new Katze();
				break;
			} else if(lebewesenTyp == 2) {
				lebewesen = new Fisch();
				break;
			} else {
				System.out.println("BMI [Falsche Eingabe!]");
			}
		}
		
		if(lebewesen instanceof Katze) {
			System.out.println("BMI [Katze]");
		} else if(lebewesen instanceof Fisch) {
			System.out.println("BMI [Fisch]");
		}
		
		
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
		ergebnisse[++index] = rechner.pruefe(lebewesen);
	}

	private void gibAus() {
		int i = -1;
		for(String ergebnis : ergebnisse) {
			if(++i > index) {
				break;
			}
			System.out.println("BMI [ergebnis= " + ergebnis + "] ");
		}
	}

}
