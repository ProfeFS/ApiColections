package es.edu.cesur.programacion.mapas;

import java.util.Map;
import java.util.TreeMap;

import es.edu.cesur.programacion.comparators.LongitudStringComparator;
import es.edu.cesur.programacion.utils.Persona;
import es.edu.cesur.programacion.utils.TextUtil;

public class EjemploTreeMapPersona {

	public static void main(String[] args) {
		Map<String, Persona> edadeAlumnos = new TreeMap<>(new LongitudStringComparator());

		Persona andres = new Persona("Andrés", "Y1234", 35);
		Persona ivan = new Persona("Iván", "X3423", 25);
		Persona carmen = new Persona("Carmen", "S1234", 23);
		Persona andres2 = new Persona("Andres", "y1234", 30);

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

/*
 * En un HashMap, si se intenta agregar un par clave-valor donde la clave ya existe en el mapa,
 * el valor asociado a esa clave se actualiza con el nuevo valor proporcionado. 
 * Por lo tanto, el comportamiento predeterminado es 
 * reemplazar el valor existente por el nuevo valor si la clave es la misma.
 */



