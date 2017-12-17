package de.java2enterprise.bmi.model;

public class Katze {
	private String name;
	private Double groesse;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getGroesse() {
		return groesse;
	}

	public void setGroesse(Double groesse) {
		this.groesse = groesse;
	}

	@Override
	public String toString() {
		return "Katze [name=" + name + ", groesse=" + groesse + "]";
	}
}