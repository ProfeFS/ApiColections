package es.edu.cesur.programacion.mapas;

import java.util.HashMap;
import java.util.Map;
import es.edu.cesur.programacion.utils.TextUtil;

public class EjemploHasMap {

	public static void main(String[] args) {
		Map<String, Integer> edadeAlumnos = new HashMap<>();

		edadeAlumnos.put(TextUtil.normalizarTexto("Andrés"), 35);
		edadeAlumnos.put(TextUtil.normalizarTexto("Iván"), 35);
		edadeAlumnos.put(TextUtil.normalizarTexto("Carmen"), 30);
		edadeAlumnos.put(TextUtil.normalizarTexto("Andres"), 30);
		
//		edadeAlumnos.put("Andrés", 35);
//		edadeAlumnos.put("Iván", 35);
//		edadeAlumnos.put("Carmen", 30);
//		edadeAlumnos.put("andrés", 30);

//		int edad = edadeAlumnos.get(TextUtil.normalizarTexto("Andrés"));
//		System.out.println("La edad de andrés es: " + edad);
		
		//Recorrer una mapa
		for(String clave: edadeAlumnos.keySet() ) {
			System.out.println(clave + "---> " + edadeAlumnos.get(clave) );
		}

//		Set<String> clavesEncontradas = new HashSet<>();
//		for (Entry<String, Integer> par : edadeAlumnos.entrySet()) {
//			// System.out.println(entrada.getKey() + ": " + entrada.getValue());
//			if (par.getValue() == edad) {
//				clavesEncontradas.add(par.getKey());
//			}
//		}
//
//		for (String clave : clavesEncontradas) {
//			System.out.println(clave);
//		}
//
//		if (edadeAlumnos.containsKey("Andrés")) {
//			System.out.println(edadeAlumnos.get("Andrés"));
//		}

	}

}
