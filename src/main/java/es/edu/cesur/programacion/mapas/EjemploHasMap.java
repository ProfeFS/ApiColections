package es.edu.cesur.programacion.mapas;

import java.nio.file.spi.FileSystemProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class EjemploHasMap {

	public static void main(String[] args) {
		Map<String, Integer> edadeAlumnos = new HashMap<>();

		edadeAlumnos.put("Andrés", 35);
		edadeAlumnos.put("Iván", 35);
		edadeAlumnos.put("Carmen", 30);
		edadeAlumnos.put("Andrés", 30);

		int edad = edadeAlumnos.get("Andrés");
		System.out.println("La edad de andrés es: " + edad);

		Set<String> clavesEncontradas = new HashSet<>();
		for (Entry<String, Integer> par : edadeAlumnos.entrySet()) {
			// System.out.println(entrada.getKey() + ": " + entrada.getValue());
			if (par.getValue() == edad) {
				clavesEncontradas.add(par.getKey());
			}
		}

		for (String clave : clavesEncontradas) {
			System.out.println(clave);
		}

		if (edadeAlumnos.containsKey("Andrés")) {
			System.out.println(edadeAlumnos.get("Andrés"));
		}

	}

}
