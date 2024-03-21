package es.edu.cesur.programacion.mapas;

import java.nio.file.spi.FileSystemProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class EjemploHasMap {

	public static void main(String[] args) {
		Map<String, Integer> edadeAlumnos = new HashMap<>();
		
		edadeAlumnos.put("Andrés", 35);
		edadeAlumnos.put("Iván", 35);
		edadeAlumnos.put("Carmen", 30);
		edadeAlumnos.put("Andrés", 30);
		
		int edad = edadeAlumnos.get("Andrés");
		System.out.println("La edad de andrés es: " +edad);
		
		
		for(Map.Entry<String, Integer> entrada : edadeAlumnos.entrySet() ) {
			//System.out.println(entrada.getKey() + ": " + entrada.getValue());
			List<String> clavesEncontradas = new ArrayList<>();
			if(entrada.getValue() == edad) {
				clavesEncontradas.add(entrada.getKey());
				System.out.println(entrada.getKey() + ": " + entrada.getValue());
			}
		}
		
		if(edadeAlumnos.containsKey("Andrés")) {
			System.out.println(edadeAlumnos.get("Andrés"));
		}

	}

}
