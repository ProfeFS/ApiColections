package es.edu.cesur.programacion.utils;

import java.text.Normalizer;

public class TextUtil {
    public static String normalizarTexto(String texto) {
	if (texto == null) {
	    return null;
	}
	// return texto.replaceAll("[\\p{InCombiningDiacriticalMarks}]",
	// "").toLowerCase();
	return Normalizer.normalize(texto, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "").toLowerCase();
    }
}