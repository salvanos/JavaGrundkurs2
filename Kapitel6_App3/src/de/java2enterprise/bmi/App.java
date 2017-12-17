package de.java2enterprise.bmi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import de.java2enterprise.bmi.model.Katze;
import de.java2enterprise.bmi.model.Messung;

/**
 * Die <b>Startklasse</b> des Programms.
 * 
 * @see java.util.Scanner#next()
 * @since 1.0.0
 */
public class App {
	private List<Katze> list = new ArrayList<Katze>();
	
	public static void main(String[] args) {
		new App();
	}
	
	private App() {
		try(Scanner scanner = new Scanner(System.in)) {
			System.out.println("BMI [Programm Start]");
			boolean nochmal=true;
			while(nochmal) {
				System.out.print("BMI [Eingabe Ausgabe Ende] > ");
				String auswahl = scanner.next().toLowerCase().intern();
				switch(auswahl) {
					case "eingabe":
						gibEin(scanner);
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
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("BMI [Programm Ende]");
	}
	
	private void gibEin(Scanner scanner) throws Exception {		
		Katze katze = new Katze();
		
		System.out.print("BMI [Geben Sie den Namen ein] > ");
		String name = scanner.next();
		katze.setName(name);
		
		System.out.print("BMI [Geben Sie die Groesse[m] ein] > ");
		double groesse = scanner.nextDouble();
		katze.setGroesse(groesse);
		
		while(true) {
			System.out.print("BMI [Geben Sie das Gewicht[kg] ein] > ");
			double gewicht = scanner.nextDouble();
			if(gewicht < 0) {
				break;
			} else {
				Messung messung = new Messung(System.currentTimeMillis(), gewicht);
				katze.getMessungen().add(messung);
			}
		}		
		list.add(katze);
	}

	private void gibAus() {
		for(Katze k : list) {
			System.out.println("BMI [" + k + "] ");
			for(Messung m : k.getMessungen()) {
				double bmi = m.getGewicht() / (k.getGroesse() * k.getGroesse());
				String ergebnis = null;
				if(bmi >= 20.5) {
					ergebnis = "UEBERGEWICHT";
				} else if(bmi < 18.5) {
					ergebnis = "UNTERGEWICHT";
				} else {
					ergebnis = "NORMALGEWICHT";
				}
				System.out.println("BMI [" + m.getGewicht() + " kg -> " + ergebnis + "] ");
			}
		}
	}

}
