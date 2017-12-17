package de.java2enterprise.bmi;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import de.java2enterprise.bmi.model.Katze;
import de.java2enterprise.bmi.model.Messung;

public class App {
	private Map<Katze, Set<Messung>> map = new HashMap<Katze, Set<Messung>>();
	
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
	
	private void gibEin(Scanner scanner) {		
		Katze katze = new Katze();
		
		System.out.print("BMI [Geben Sie den Namen ein] > ");
		String name = scanner.next();
		katze.setName(name);
		
		Set<Messung> messungen = null;
		boolean enthalten = false;
		for(Katze k : map.keySet()) {
			if(k.equals(katze)) {
				katze.setGroesse(k.getGroesse());
				messungen = map.get(k);
				System.out.println("BMI [" + name + " gefunden]");
				enthalten = true;
				break;
			}
		}
	
		if(!enthalten) {
			System.out.print("BMI [Geben Sie die Groesse[m] ein] > ");
			double groesse = scanner.nextDouble();
			katze.setGroesse(groesse);
			messungen = new HashSet<Messung>();
		}
		
		while(true) {
			System.out.print("BMI [Geben Sie das Gewicht[kg] ein] > ");
			double gewicht = scanner.nextDouble();
			if(gewicht < 0) {
				break;
			} else {
				Messung messung = new Messung(System.currentTimeMillis(), gewicht);
				messungen.add(messung);
			}
		}		
		map.put(katze, messungen);
	}

	private void gibAus() {
		for(Entry<Katze, Set<Messung>> e : map.entrySet()) {
			Katze k = e.getKey();
			System.out.println("BMI [" + k + "] ");
			for(Messung m : e.getValue()) {
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
