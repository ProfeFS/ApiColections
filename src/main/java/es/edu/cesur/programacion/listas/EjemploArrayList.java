package es.edu.cesur.programacion.listas;

import java.util.ArrayList;
import java.util.List;
import es.edu.cesur.programacion.domain.Fruta;

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
		
		listaFrutas.add(new Fruta("Quiwi", "Madrid"));

		for (Fruta fruit : listaFrutas) {
			System.out.println(fruit);		
		}
		
		listaFrutas.remove(4);
		
		System.out.println("-----------------------\r" );
		for (Fruta fruit : listaFrutas) {
			System.out.println(fruit);		
		}

		System.out.println("-----------------------\r");
	}

}
