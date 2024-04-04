package es.edu.cesur.programacion.utils;

public class Persona {

	private String nombre;
	private String docIdentidad;
	private int edad;

	public Persona(String nombre, String docIdentidad, int edad) {
		super();
		this.nombre = nombre;
		this.docIdentidad = docIdentidad;
		this.edad = edad;
	}

	public String getDocIdentidad() {
		return docIdentidad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", docIdentidad=" + docIdentidad + ", edad=" + edad + "]";
	}

}
