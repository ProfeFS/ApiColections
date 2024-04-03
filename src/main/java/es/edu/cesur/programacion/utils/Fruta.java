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
		// Comprobación de igualdad considerando mayúsculas/minúsculas
		// Se verifica primero si alguno de los campos es null para evitar
		// NullPointerException
		Boolean nombresIguales = (nombre == null && fruta.getNombre() == null) ||
				(nombre != null && fruta.getNombre() != null && TextUtil.normalizarTexto(nombre).equalsIgnoreCase(TextUtil.normalizarTexto(fruta.getNombre())));

		Boolean origenIguales = (origen == null && fruta.getOrigen() == null) || (origen != null
				&& fruta.getOrigen() != null
				&& TextUtil.normalizarTexto(origen).equalsIgnoreCase(TextUtil.normalizarTexto(fruta.getOrigen())));

		return nombresIguales && origenIguales;
	}

	@Override
	public int hashCode() {
		// Para mantener la consistencia con equals ignorando mayúsculas y minúsculas,
		// se podría convertir a minúsculas o mayúsculas ambos campos antes de calcular
		// el hash.
		// Se usa null-safe operation usando Objects.hashCode() en campos transformados
		// a minúsculas.
		return Objects.hash(nombre != null ? TextUtil.normalizarTexto(nombre) : null,
				origen != null ? TextUtil.normalizarTexto(origen) : null);
	}

	@Override
	public int compareTo(Fruta otraFruta) {
		int comparacionNombres = TextUtil.normalizarTexto(nombre).compareToIgnoreCase(TextUtil.normalizarTexto(otraFruta.getNombre()));
        if (comparacionNombres != 0) {
            return comparacionNombres;
        } else {
            return TextUtil.normalizarTexto(origen).compareToIgnoreCase(TextUtil.normalizarTexto(otraFruta.getOrigen()));
        }
	}

	/*
	 * Si dos objetos son considerados iguales mediante el método equals(), entonces
	 * deben tener el mismo hashCode(). La implementación utiliza Objects.hash()
	 * para generar el hash basado en el nombre y el origen. Esto ayuda a mantener
	 * la integridad de las colecciones que dependen de estos métodos.
	 */

}
