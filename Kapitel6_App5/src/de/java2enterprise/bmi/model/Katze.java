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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Katze other = (Katze) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	} 
}