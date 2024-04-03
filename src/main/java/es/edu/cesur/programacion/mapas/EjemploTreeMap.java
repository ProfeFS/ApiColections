
package es.edu.cesur.programacion.mapas;

import java.util.Map;
import java.util.TreeMap;

import es.edu.cesur.programacion.comparators.StringComparator;

public class EjemploTreeMap {

	public static void main(String[] args) {
	Map<String, Integer> edadeAlumnos = new TreeMap<>(new StringComparator());
	edadeAlumnos.put("Andres", 35);
	edadeAlumnos.put("Iván", 35);
	edadeAlumnos.put("Carmen", 30);
	edadeAlumnos.put("Andrés", 40);
	
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
