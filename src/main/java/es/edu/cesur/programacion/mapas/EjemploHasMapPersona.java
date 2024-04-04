package es.edu.cesur.programacion.mapas;

import java.util.HashMap;
import java.util.Map;

import es.edu.cesur.programacion.utils.Persona;
import es.edu.cesur.programacion.utils.TextUtil;

public class EjemploHasMapPersona {

	public static void main(String[] args) {
		Map<String, Persona> edadeAlumnos = new HashMap<>();

		Persona andres = new Persona("Andrés", "Y1234", 35);
		Persona ivan = new Persona("Iván", "X3423", 25);
		Persona carmen = new Persona("Carmen", "S1234", 23);
		Persona andres2 = new Persona("Andrés", "y1234", 30);

		edadeAlumnos.put(TextUtil.normalizarTexto(andres.getDocIdentidad()), andres);
		edadeAlumnos.put(TextUtil.normalizarTexto(ivan.getDocIdentidad()), ivan);
		edadeAlumnos.put(TextUtil.normalizarTexto(carmen.getDocIdentidad()), carmen);
		edadeAlumnos.put(TextUtil.normalizarTexto(andres2.getDocIdentidad()), andres2);

		// Recorrer una mapa
		for (String clave : edadeAlumnos.keySet()) {
			System.out.println(clave + "---> " + edadeAlumnos.get(clave).toString());
		}
	}

}
