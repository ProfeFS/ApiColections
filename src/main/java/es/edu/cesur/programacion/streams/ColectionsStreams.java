package es.edu.cesur.programacion.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import es.edu.cesur.programacion.comparators.NombrePersonaComparatos;
import es.edu.cesur.programacion.domain.Persona;

public class ColectionsStreams {

	public static void main(String[] args) {

		Persona andres = new Persona("Andrés", "Y1234", 35);
		Persona ivan = new Persona("Iván", "X3423", 25);
		Persona carmen = new Persona("Carmen", "S1234", 23);
		Persona maria = new Persona("María", "y123422", 30);

		List<Persona> personas = Arrays.asList(andres, ivan, carmen, maria);
		List<Persona>streamPersonas = new ArrayList<>();

		// 1.1- Recorriendo normal
		for (Persona persona : personas) {
			System.out.println(persona);
		}

		// 1.2 Recorriendo con streams
		// personas.forEach(p-> System.out.println(p));
		
		//ColectionsStreams.imprimirLista(personas);

		// 2.1 Filtrar normal // le decimos lo que se quiere y cómo hacerlo

		System.out.println("\r ---------------------------------");
		for (Persona persona : personas) {
			if (persona.getEdad() > 25) {
				streamPersonas.add(persona);
			}
		}
		//ColectionsStreams.imprimirLista(streamPersonas);
		streamPersonas.clear();

		// 2.2 Filtrar con Streams //le decimos lo que queremos hacer pero no cómo.
		System.out.println("\r ---------------------------------");
		streamPersonas = personas.stream()
				.filter(p -> p.getEdad() > 25)
				.collect(Collectors.toList());

		//ColectionsStreams.imprimirLista(streamPersonas);
		streamPersonas.clear();
		
		// 3.1 Obtener la lista de edades de todas personas mayores a 25 años.
		List<Integer> edades = new ArrayList<>();
		for (Persona persona : personas) {
			if (persona.getEdad() > 25) {
				edades.add(persona.getEdad());
			}
		} 
		//ColectionsStreams.imprimirLista(edades);
		edades.clear();
		
		//3.1 con Streams
		edades = personas.stream()
			.map(p-> p.getEdad())
			.collect(Collectors.toList());
		
		//ColectionsStreams.imprimirLista(edades);
		
		//-------------4 Ordenación
		//4.1 Ordenar de forma tradicional
		List<Persona> personasOrdenadas = new ArrayList<>(personas);
		//Collections.sort(personasOrdenadasPorEdad);
		//ColectionsStreams.imprimirLista(personasOrdenadasPorEdad);
		
//		Collections.sort(personas, new Comparator<Persona>() {
//		    @Override
//		    public int compare(Persona p1, Persona p2) {
//		        return p1.getNombre().compareTo(p2.getNombre());
//		    }
//		});
		
		//Collections.sort(personasOrdenadas, new NombrePersonaComparatos());
		//ColectionsStreams.imprimirLista(personasOrdenadas);

		//4.2 con Streams
		personasOrdenadas = personas.stream()
			.sorted(new NombrePersonaComparatos())
			.collect(Collectors.toList());
		
		ColectionsStreams.imprimirLista(personasOrdenadas);
		

	}

	private static void imprimirLista(List<?> lista) {
		lista.forEach(System.out::println);
	}

}
