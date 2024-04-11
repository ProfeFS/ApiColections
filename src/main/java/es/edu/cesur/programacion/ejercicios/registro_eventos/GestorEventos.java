package es.edu.cesur.programacion.ejercicios.registro_eventos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class GestorEventos {

	Map<Integer, Evento> eventos;

	public GestorEventos() {
		this.eventos = new HashMap<>();
	}

	public void addEventToRecord(Evento event) {
		if (eventos.containsKey(event.getid())) {
			System.out.println("Ya existe un evento con el id: " + event.getid());
			return;
		}
		eventos.put(event.getid(), event);
	}

	public void deleteEvent(Integer eventId) {
		if (eventos.remove(eventId) != null) {
			System.out.println("Se ha eliminado el evento de la lista");
		} else {
			System.out.println("No Se ha eliminado el evento de la lista");
		}
	}
	
	public void deleteEventStream(String eventDescription) {
		//saco aparte todas las claves de los eventos qie tengan JAVA en su descipción
		String desc = eventDescription.toLowerCase();
		
		List<Integer> javaEventsId = eventos.entrySet().stream()
		.filter(e -> e.getValue().getDescription().contains(desc))
		.map(e -> e.getKey())
		.collect(Collectors.toList());
	
		javaEventsId.forEach(eventos::remove);
		
	}
	
	 public void deleteEvent(String eventDescription) {
	        List<Integer> clavesParaEliminar = new ArrayList<>();

	        // Primero recoger las claves de los eventos a eliminar
	        for (Entry<Integer, Evento> entrada : eventos.entrySet()) {
	            if (entrada.getValue().getDescription().contains("Java")) {
	                clavesParaEliminar.add(entrada.getKey());
	            }
	        }

	        // Luego eliminar esas entradas del mapa
	        for (Integer clave : clavesParaEliminar) {
	            eventos.remove(clave);
	        }
	    }

	public void showEventDescription(Integer eventId) {
		System.out.println("Evento: " + eventId 
				+ eventos.get(eventId) != null ? eventos.get(eventId).getDescription(): "No existe");
	}
	
	public void  showEvents() {
		if(eventos.isEmpty()) {
			System.out.println("La lista de eventos está vacía");
			return;
		}
		System.out.println("Listado de eventos: \r");
		eventos.forEach((id, evento) -> System.out.println("ID: " + id + ", Descripción: " + evento.getDescription()));
	}

}
