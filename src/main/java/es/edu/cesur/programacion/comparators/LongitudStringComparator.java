package es.edu.cesur.programacion.comparators;

import java.util.Comparator;

public class LongitudStringComparator implements Comparator<String> {

	@Override
	public int compare(String texto1, String texto2) {
		int diferenciaLongitud = texto1.length() - texto2.length();
		// Si las claves tienen diferente longitud, las ordena por longitud
		if (diferenciaLongitud != 0) {
			return diferenciaLongitud;
		}
		// Si tienen la misma longitud, compara alfabéticamente para garantizar unicidad
		return texto1.compareTo(texto2);
	}
}
