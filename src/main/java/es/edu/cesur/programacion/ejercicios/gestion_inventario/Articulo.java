package es.edu.cesur.programacion.ejercicios.gestion_inventario;

import java.util.Objects;

public class Articulo {
	private String nombre;
	private int codigo;

	public Articulo(String nombre, int codigo) {
		this.nombre = nombre;
		this.codigo = codigo;
	}

	// Getters
	public String getNombre() {
		return nombre;
	}

	public int getCodigo() {
		return codigo;
	}

	@Override
	public String toString() {
		return "Articulo{" + "nombre='" + nombre + '\'' + ", codigo=" + codigo + '}';
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Articulo other = (Articulo) obj;
		return codigo == other.codigo;
	}

}
