package es.edu.cesur.programacion.utils;

public class Persona implements Comparable<Persona>{
	
	private String nombre;
	private String docIdentidad;
	private int edad;
	
	public Persona(String nombre, String docIdentidad, int edad) {
		super();
		this.nombre = nombre;
		this.docIdentidad = docIdentidad;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDocIdentidad() {
		return docIdentidad;
	}

	public int getEdad() {
		return edad;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((docIdentidad == null) ? 0 : docIdentidad.hashCode());
		result = prime * result + edad;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		
		Persona other = (Persona) obj;
		if (docIdentidad == null) {
			if (other.docIdentidad != null)
				return false;
		} else if (!docIdentidad.equalsIgnoreCase(other.docIdentidad))
			return false;
		
		if (edad != other.edad)
			return false;
		
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equalsIgnoreCase(other.nombre))
			return false;
		return true;
	}

	@Override
	public int compareTo(Persona o) {
		
		return 0;
	}
	
	
	
	

}
