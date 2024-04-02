package es.edu.cesur.programacion.comparators;

import java.util.Comparator;

import es.edu.cesur.programacion.utils.Fruta;

public class LongitudNombreFrutaComparator implements Comparator<Fruta> {

	@Override
	public int compare(Fruta fruta1, Fruta fruta2) {
		int diferenciaLongitud = fruta1.getNombre().length() - fruta2.getNombre().length();
		// Si las claves tienen diferente longitud, las ordena por longitud
		if (diferenciaLongitud != 0) {
			return diferenciaLongitud;
		}
		// Si tienen la misma longitud, compara alfabéticamente para garantizar unicidad
		return fruta1.getNombre().compareTo(fruta2.getNombre());
	}
}
