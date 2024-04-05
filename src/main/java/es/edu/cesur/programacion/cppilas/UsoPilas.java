package es.edu.cesur.programacion.cppilas;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

import es.edu.cesur.programacion.domain.Fruta;
import es.edu.cesur.programacion.domain.Persona;

public class UsoPilas {

	public static void main(String[] args) {

		Deque<Fruta> pilaFrutas = new ArrayDeque<>(); //es la implementación más adecuada actual, para pilas.

		Fruta fresa = new Fruta("Frésa", "Huelva");
		Fruta pera = new Fruta("Pera", "Madrid");
		Fruta manzana = new Fruta("Manzana", "Asturias");

		pilaFrutas.push(fresa);
		pilaFrutas.push(pera);
		pilaFrutas.push(manzana);

		while (!pilaFrutas.isEmpty()) {
			System.out.println(pilaFrutas.poll());
		}

		if (pilaFrutas.isEmpty()) {
			System.out.println("No hay frutas apiladas");
		}

	}

}
