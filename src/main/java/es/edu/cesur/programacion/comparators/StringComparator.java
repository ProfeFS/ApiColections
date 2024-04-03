package es.edu.cesur.programacion.comparators;

import java.util.Comparator;

import es.edu.cesur.programacion.utils.TextUtil;

public class StringComparator implements Comparator<String> {

	@Override
	public int compare(String nombre1, String nombre2) {
		//return TextUtil.normalizarTexto(nombre1).compareTo(TextUtil.normalizarTexto(nombre2));
		return nombre1.compareToIgnoreCase(nombre2);
	}
}
