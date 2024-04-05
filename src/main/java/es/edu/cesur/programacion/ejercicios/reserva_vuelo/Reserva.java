package es.edu.cesur.programacion.ejercicios.reserva_vuelo;
import java.util.Objects;

public class Reserva {
    private String pasajero;
    private int numeroAsiento;

    public Reserva(String pasajero, int numeroAsiento) {
        this.pasajero = pasajero;
        this.numeroAsiento = numeroAsiento;
    }

    public String getPasajero() {
        return pasajero;
    }

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reserva reserva = (Reserva) o;
        return numeroAsiento == reserva.numeroAsiento;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroAsiento);
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "pasajero='" + pasajero + '\'' +
                ", numeroAsiento=" + numeroAsiento +
                '}';
    }
}
