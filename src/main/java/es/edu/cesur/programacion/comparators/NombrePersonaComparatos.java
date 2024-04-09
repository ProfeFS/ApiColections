package es.edu.cesur.programacion.comparators;

import java.util.Comparator;

import es.edu.cesur.programacion.domain.Persona;

public class NombrePersonaComparatos implements Comparator<Persona> {

	@Override
	public int compare(Persona o1, Persona o2) {
		// TODO Auto-generated method stub
		return o1.getNombre().compareToIgnoreCase(o2.getNombre());
	}

}
