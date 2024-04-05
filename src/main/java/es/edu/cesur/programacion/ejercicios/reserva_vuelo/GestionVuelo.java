package es.edu.cesur.programacion.ejercicios.reserva_vuelo;
import java.util.HashSet;
import java.util.Set;

public class GestionVuelo {
    private Set<Reserva> reservas;

    public GestionVuelo() {
        this.reservas = new HashSet<>();
    }

    public void hacerReserva(String pasajero, int numeroAsiento) {
        Reserva nuevaReserva = new Reserva(pasajero, numeroAsiento);
        if (!reservas.add(nuevaReserva)) {
            System.out.println("El asiento " + numeroAsiento + " ya está reservado.");
        }
    }

    public void cancelarReserva(int numeroAsiento) {
        reservas.removeIf(reserva -> reserva.getNumeroAsiento() == numeroAsiento);
    }

    public void listarReservas() {
        reservas.forEach(System.out::println);
    }

    // Sin streams
    public void listarReservasSinStreams() {
        for (Reserva reserva : reservas) {
            System.out.println(reserva);
        }
    }
}
