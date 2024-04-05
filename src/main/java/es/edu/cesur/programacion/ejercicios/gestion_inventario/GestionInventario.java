package es.edu.cesur.programacion.ejercicios.gestion_inventario;

import java.nio.file.spi.FileSystemProvider;
import java.util.HashSet;
import java.util.Set;

public class GestionInventario {
	private Set<Articulo> inventario;

	public GestionInventario() {
		this.inventario = new HashSet<>();
	}

	public void agregarArticulo(Articulo articulo) {
		if (!inventario.add(articulo)) {
			System.out.println("Artículo con código " + articulo.getCodigo() + " ya existe.");
		}
	}

	public void eliminarArticuloStream(int codigo) {
		inventario.removeIf(articulo -> articulo.getCodigo() == codigo);
	}

	public void eliminarArticulo(int codigo) {
		Articulo art = getArticulo(codigo);
		if (inventario.remove(art)) {
			System.out.println("Eliminado");
		} else {
			System.out.println("No Existe");
		}
	}

	private Articulo getArticulo(int codigo) {
		for (Articulo a : inventario) {
			if (a.getCodigo() == codigo) {
				return a;
			}
		}
		return null;
	}

	public void listarArticulos() {
		// inventario.forEach(System.out::println);
		inventario.forEach(a -> System.out.println(a));
	}

	// Version sin streams
	public void listarArticulosSinStreams() {
		for (Articulo articulo : inventario) {
			System.out.println(articulo);
		}
	}
}
