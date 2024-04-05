package es.edu.cesur.programacion.cppilas;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedHashSet;
import java.util.LinkedList;

import es.edu.cesur.programacion.domain.Fruta;

public class UsoPilasLinked {

	public static void main(String[] args) {
		Deque<Fruta> pilaFrutas = new LinkedList<>(); //es usado en muchos casos, pero preferir ArrayDeque<>()
		
		Fruta fresa = new Fruta("Frésa", "Huelva");
		Fruta pera = new Fruta("Pera", "Madrid");
		Fruta manzana = new Fruta("Manzana", "Asturias");
		
		pilaFrutas.push(fresa);
		pilaFrutas.push(pera);
		pilaFrutas.push(manzana);
		
		System.out.println(pilaFrutas.poll()); //si es null retorna null sin lazar exception
		System.out.println(pilaFrutas.size());
		
		System.out.println(pilaFrutas.pop()); //si es null lanza exception
		System.out.println(pilaFrutas.size());		

	}

}
