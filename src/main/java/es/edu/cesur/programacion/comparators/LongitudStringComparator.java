package es.edu.cesur.programacion.comparators;

import java.util.Comparator;

public class LongitudStringComparator implements Comparator<String> {

	@Override
	public int compare(String nombre1, String nombre2) {
		int diferenciaLongitud = nombre1.length() - nombre2.length();
		// Si las claves tienen diferente longitud, las ordena por longitud
		if (diferenciaLongitud != 0) {
			return diferenciaLongitud;
		}
		// Si tienen la misma longitud, compara alfabéticamente para garantizar unicidad
		return nombre1.compareTo(nombre2);
	}
}
