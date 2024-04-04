
package es.edu.cesur.programacion.mapas;

import java.util.Map;
import java.util.TreeMap;

import es.edu.cesur.programacion.comparators.StringComparator;
import es.edu.cesur.programacion.utils.Persona;
import es.edu.cesur.programacion.utils.TextUtil;

public class EjemploTreeMap {

	public static void main(String[] args) {
		Map<String, Persona> personas = new TreeMap<>();

		Persona andres = new Persona("Andrés", "Y123456", 30);
		Persona ana = new Persona("Anna", "Y12311", 30);
		Persona maria = new Persona("María", "Y65432", 30);
		Persona ivan = new Persona("Iván", "Y12345622", 30);
		Persona andres2 = new Persona("Andrés", "y123456", 30);

		personas.put(TextUtil.normalizarTexto(andres.getDocIdentidad()), andres);
		personas.put(TextUtil.normalizarTexto(ana.getDocIdentidad()), ana);
		personas.put(TextUtil.normalizarTexto(maria.getDocIdentidad()), maria);
		personas.put(TextUtil.normalizarTexto(ivan.getDocIdentidad()), ivan);
		personas.put(TextUtil.normalizarTexto(andres2.getDocIdentidad()), andres2);


		for (String clave: personas.keySet()) {
			System.out.println(clave + "------>"+personas.get(clave));

		}

		if (personas.containsKey("Andrés")) {
			System.out.println(personas.get("Andrés"));
		}

	}

}
