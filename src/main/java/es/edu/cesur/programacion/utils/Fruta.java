package es.edu.cesur.programacion.utils;

import java.util.Objects;

public class Fruta implements Comparable<Fruta> {
	private String nombre;
	private String origen;

	public Fruta(String nombre, String origen) {
		super();
		this.nombre = nombre;
		this.origen = origen;
	}

	public String getNombre() {
		return nombre;
	}

	public String getOrigen() {
		return origen;
	}

	@Override
	public String toString() {
		return "nombre=" + nombre + ", origen=" + origen;
	}

	@Override
	public boolean equals(Object obj) {
		// Comprobación de referencia a sí mismo
		if (this == obj)
			return true;

		// Comprobación de null y de la clase del objeto
		if (obj == null || getClass() != obj.getClass())
			return false;

		// Cast del Object a Fruta
		Fruta fruta = (Fruta) obj;

		// Comprobación de igualdad de campos relevantes
		// Para esto, se usa Objects.equals(), que maneja nulls automáticamente.
		return Objects.equals(nombre, fruta.nombre) && Objects.equals(origen, fruta.origen);
	}

	@Override
	public int hashCode() {
		// System.out.println(nombre + " HasCode: " + Objects.hash(nombre, origen));
		return Objects.hash(nombre, origen);
	}

	@Override
	public int compareTo(Fruta otraFruta) {
		int comparacionNombres = this.nombre.compareTo(otraFruta.nombre);
		if (comparacionNombres != 0) {
			return comparacionNombres;
		} else {
			return this.origen.compareTo(otraFruta.origen);
		}
	}

	/*
	 * Si dos objetos son considerados iguales mediante el método equals(), entonces
	 * deben tener el mismo hashCode(). La implementación utiliza Objects.hash()
	 * para generar el hash basado en el nombre y el origen. Esto ayuda a mantener
	 * la integridad de las colecciones que dependen de estos métodos.
	 */

}
