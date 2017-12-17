package de.java2enterprise.bmi.controller;

public class BMIErgebnis {
	public final static BMIErgebnis UNTERGEWICHT
		= new BMIErgebnis("UNTERGEWICHT", 0);
	public final static BMIErgebnis NORMALGEWICHT
		= new BMIErgebnis("NORMALGEWICHT", 1);
	public final static BMIErgebnis UEBERGEWICHT
		= new BMIErgebnis("UEBERGEWICHT", 2);
		
	private final String name;
	private final int ordinal;
	
	public BMIErgebnis(String _name, int _ordinal) {
		this.name = _name;
		this.ordinal = _ordinal;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
