package es.edu.cesur.programacion.listas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import es.edu.cesur.programacion.utils.Fruta;

public class EjemploLinkedhasSet {

	public static void main(String[] args) {
		Fruta fresaNacional = new Fruta("Fresa", "Huelva");
		Fruta pera = new Fruta("Pera", "Madrid");
		Fruta manzana = new Fruta("Manzana", "Asturias");
		Fruta fresaImportada = new Fruta("Fresa", "Huelva");

		Set<Fruta> listaFrutas = new LinkedHashSet<>();
		listaFrutas.add(fresaNacional);
		listaFrutas.add(pera);
		listaFrutas.add(manzana);
		listaFrutas.add(fresaImportada);

		for (Fruta fruit : listaFrutas) {
			System.out.println(fruit);
		}

	}
	
	/*
	 * Si necesitas preservar el orden de inserción de tus objetos,
	 * considera usar LinkedHashSet en lugar de HashSet.
	 * LinkedHashSet mantiene una lista doblemente enlazada de todos los elementos que se encuentran en el conjunto,
	 * lo que permite iterar sobre los elementos en el orden en que fueron insertados:
	 */

}
