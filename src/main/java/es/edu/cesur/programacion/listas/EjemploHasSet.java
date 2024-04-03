package es.edu.cesur.programacion.listas;

import java.util.HashSet;
import java.util.Set;

import es.edu.cesur.programacion.utils.Fruta;

public class EjemploHasSet {

	public static void main(String[] args) {
		Fruta fresaNacional = new Fruta("Frésa", "Huelva");
		Fruta pera = new Fruta("Pera", "Madrid");
		Fruta manzana = new Fruta("Manzana", "Asturias");
		Fruta fresaImportada = new Fruta("fresa", "Huelva");
		Fruta fresaNac = new Fruta("Fresa", "Huelva");
		Fruta fresaNac2 = fresaNacional;

		Set<Fruta> listaFrutas = new HashSet<>();
		listaFrutas.add(fresaNacional);
		listaFrutas.add(pera);
		listaFrutas.add(manzana);
		listaFrutas.add(fresaImportada);
		listaFrutas.add(fresaNac);
		listaFrutas.add(fresaNac2);
		
		for (Fruta fruit : listaFrutas) {
			System.out.println(fruit);
		}

	}
	
	/*
	 * HashSet no mantiene los elementos en ningún orden específico. 
	 * El orden en el que iteras los elementos de un HashSet no es predecible y
	 * puede cambiar de una ejecución a otra. 
	 * Esto se debe a cómo HashSet utiliza la tabla hash subyacente para almacenar los elementos.
	 */

}
