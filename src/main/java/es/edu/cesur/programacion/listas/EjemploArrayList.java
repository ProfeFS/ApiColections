package es.edu.cesur.programacion.listas;

import java.util.ArrayList;
import java.util.List;

import es.edu.cesur.programacion.utils.Fruta;

public class EjemploArrayList {

	public static void main(String[] args) {

		Fruta fresaNacional = new Fruta("Fresa", "Huelva");
		Fruta pera = new Fruta("Pera", "Madrid");
		Fruta manzana = new Fruta("Manzana", "Asturias");
		Fruta fresaImportada = new Fruta("Fresa", "Huelva");

		List<Fruta> listaFrutas = new ArrayList<>();
		listaFrutas.add(fresaNacional);
		listaFrutas.add(pera);
		listaFrutas.add(manzana);
		listaFrutas.add(fresaImportada);

		for (Fruta fruit : listaFrutas) {
			System.out.println(fruit);		
		}

		System.out.println("-----------------------\r" + listaFrutas.get(1));
	}

}
