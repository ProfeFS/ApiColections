package es.edu.cesur.programacion.ejercicios.registro_eventos;

public class App {

	public static void main(String[] args) {
		GestorEventos registro = new GestorEventos();

        // Crear y añadir eventos
        Evento ev1 = new Evento(101, "Conferencia sobre Java");
        Evento ev2 = new Evento(102, "Taller de Python");
        registro.addEventToRecord(ev1);
        registro.addEventToRecord(ev2);

        // Intentar añadir un evento duplicado
        Evento ev3 = new Evento(101, "Seminario de Seguridad Informática");
        registro.addEventToRecord(ev3);

        // Listar todos los eventos
        registro.showEvents();

        // Mostrar un evento
        registro.showEventDescription(101);

        // Eliminar un evento
        registro.deleteEvent(101);
        registro.showEvents();

        // Eliminar un evento inexistente
        registro.deleteEvent(999);

	}

}
