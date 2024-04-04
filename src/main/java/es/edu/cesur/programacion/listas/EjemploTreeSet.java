package es.edu.cesur.programacion.listas;

import java.util.Set;
import java.util.TreeSet;

import es.edu.cesur.programacion.domain.Fruta;

public class EjemploTreeSet {

	public static void main(String[] args) {
		Fruta fresaNacional = new Fruta("Fresa", "Huelva");
		Fruta pera = new Fruta("Pera", "Madrid");
		Fruta manzana = new Fruta("Manzana", "Asturias");
		Fruta fresaImportada = new Fruta("fresá", "Huelva");

		Set<Fruta> listaFrutas = new TreeSet<>();
		listaFrutas.add(fresaNacional);
		listaFrutas.add(pera);
		listaFrutas.add(manzana);
		listaFrutas.add(fresaImportada);

		for (Fruta fruit : listaFrutas) {
			System.out.println(fruit);
		}

	}

}
