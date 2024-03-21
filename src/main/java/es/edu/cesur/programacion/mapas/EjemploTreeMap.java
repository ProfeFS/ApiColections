package es.edu.cesur.programacion.mapas;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import es.edu.cesur.programacion.comparators.LongitudStringComparator;

public class EjemploTreeMap {

	public static void main(String[] args) {
	Map<String, Integer> edadeAlumnos = new TreeMap<>(new LongitudStringComparator());
	edadeAlumnos.put("Andrés", 35);
	edadeAlumnos.put("Iván", 35);
	edadeAlumnos.put("Carmen", 30);
	edadeAlumnos.put("Andrés", 30);
	
	int edad = edadeAlumnos.get("Andrés");
	System.out.println("La edad de andrés es: " +edad);
	
	
	for(Map.Entry<String, Integer> entrada : edadeAlumnos.entrySet() ) {
		System.out.println(entrada.getKey() + ": " + entrada.getValue());
		
	}
	
	if(edadeAlumnos.containsKey("Andrés")) {
		System.out.println(edadeAlumnos.get("Andrés"));
	}

	}

}
