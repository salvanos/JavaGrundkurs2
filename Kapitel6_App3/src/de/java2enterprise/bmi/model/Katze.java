package de.java2enterprise.bmi.model;

import java.util.HashSet;
import java.util.Set;

public class Katze {
	private String name;
	private Double groesse;
	private Set<Messung> messungen = new HashSet<Messung>();

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

	public Set<Messung> getMessungen() {
		return messungen;
	}

	public void setMessungen(Set<Messung> messungen) {
		this.messungen = messungen;
	}

	@Override
	public String toString() {
		return "Katze [name=" + name + ", groesse=" + groesse + "]";
	}
}