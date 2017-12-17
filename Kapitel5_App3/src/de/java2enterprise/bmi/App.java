package de.java2enterprise.bmi;

import java.util.InputMismatchException;
import java.util.Scanner;

import de.java2enterprise.bmi.controller.BMI;
import de.java2enterprise.bmi.controller.BMIErgebnis;
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
	private Katze katze;
	private BMIErgebnis[] ergebnisse = new BMIErgebnis[BMI.MAX_ANZAHL];
	private int index = -1;
	
	public static void main(String[] args) {
		new App(args);
	}
	
	private App(String[] param) {
		System.out.println("BMI [Programm Start]");
		if(param.length == 2) {
			katze = new Katze(param[0], param[1]);
		} else {
			katze = new Katze();
			System.out.print("BMI [Geben Sie den Namen ein] > ");
			String name = scanner.next();
			katze.setName(name);
			
			System.out.print("BMI [Geben Sie die Groesse[m] ein] > ");
			double groesse = scanner.nextDouble();
			katze.setGroesse(groesse);
		}		
				
		boolean nochmal=true;
		while(nochmal && index < BMI.MAX_ANZAHL) {
			System.out.print("BMI [Eingabe Ausgabe Ende] > ");
			String auswahl = scanner.next().toLowerCase().intern();
			switch(auswahl) {
				case "eingabe":
					gibEin();
					break;
				case "ausgabe":
					gibAus();
					break;
				case "ende":
					nochmal = false;
					break;
				default:
					System.out.println("BMI [Falsche Eingabe!]");
			}
		}
		scanner.close();
		System.out.println("BMI [Programm Ende]");
	}
	
	private void gibEin() {		
		System.out.print("BMI [Geben Sie das Gewicht[kg] ein] > ");
		try {
			double gewicht = scanner.nextDouble();
			katze.setGewicht(gewicht);
		} catch(InputMismatchException e) {
			System.out.println("BMI [Falsche Eingabe!]");
			return;
		} catch (KatzeException e) {
			System.out.println(e.getMessage());
			return;
		} finally {
			scanner = new Scanner(System.in);
		}

		BMIRechner rechner = new BMIRechner() {
			public BMIErgebnis pruefe(BMIKoerper k) {
				double bmi = k.getGewicht() / (k.getGroesse() * k.getGroesse());
				BMIErgebnis ergebnis = null;
				if(bmi >= BMI_MAX) {
					ergebnis = BMIErgebnis.UEBERGEWICHT;
				} else if(bmi < BMI_MIN) {
					ergebnis = BMIErgebnis.UNTERGEWICHT;
				} else {
					ergebnis = BMIErgebnis.NORMALGEWICHT;
				}
				return ergebnis;
			}
		};
		ergebnisse[++index] = rechner.pruefe(katze);
	}

	private void gibAus() {
		System.out.println(katze);
		int i = -1;
		for(BMIErgebnis ergebnis : ergebnisse) {
			if(++i > index) {
				break;
			}
			System.out.println("BMI [ergebnis= " + ergebnis + "] ");
		}
	}

}
