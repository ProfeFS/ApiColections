package es.edu.cesur.programacion.domain;

public class Persona implements Comparable<Persona> {

	private String nombre;
	private String docIdentidad;
	private Integer edad;

	public Persona(String nombre, String docIdentidad, Integer edad) {
		super();
		this.nombre = nombre;
		this.docIdentidad = docIdentidad;
		this.edad = edad;
	}

	public int getEdad() {
		return edad;
	}

	public String getDocIdentidad() {
		return docIdentidad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", docIdentidad=" + docIdentidad + ", edad=" + edad + "]";
	}

	@Override
	public int compareTo(Persona o) {
		return edad.compareTo(o.edad);
	}

	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}

}
