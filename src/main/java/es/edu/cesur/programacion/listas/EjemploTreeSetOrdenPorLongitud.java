package es.edu.cesur.programacion.listas;

import java.util.Set;
import java.util.TreeSet;

import es.edu.cesur.programacion.comparators.LongitudNombreFrutaComparator;
import es.edu.cesur.programacion.utils.Fruta;

public class EjemploTreeSetOrdenPorLongitud {

	public static void main(String[] args) {
		Fruta fresaNacional = new Fruta("Fresa", "Huelva");
		Fruta pera = new Fruta("Pera", "Madrid");
		Fruta manzana = new Fruta("Manzana", "Asturias");
		Fruta fresaImportada = new Fruta("fresa", "Huelva");

		Set<Fruta> listaFrutas = new TreeSet<>(new LongitudNombreFrutaComparator());
		listaFrutas.add(fresaNacional);
		listaFrutas.add(pera);
		listaFrutas.add(manzana);
		listaFrutas.add(fresaImportada);

		for (Fruta fruit : listaFrutas) {
			System.out.println(fruit);
		}

	}

}
