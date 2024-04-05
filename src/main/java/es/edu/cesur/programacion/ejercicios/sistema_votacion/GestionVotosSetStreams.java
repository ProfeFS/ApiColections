package es.edu.cesur.programacion.ejercicios.sistema_votacion;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;

public class GestionVotosSetStreams {
    private Set<Voto> votos;

    public GestionVotosSetStreams() {
        this.votos = new HashSet<>();
    }

    public boolean registrarVoto(String electorDocId, String candidato) {
        Voto voto = new Voto(electorDocId, candidato);
        // Verificar si ya existe un voto del elector
        if (votos.stream().anyMatch(v -> v.getElectorDocId().equals(electorDocId))) {
            System.out.println("El elector ya ha votado.");
            return false;
        } else {
            votos.add(voto);
            return true;
        }
    }

    public void anularVoto(String electorDocId) {
        votos.removeIf(voto -> voto.getElectorDocId().equals(electorDocId));
    }

    // Usando Streams para contar votos
    public Map<String, Long> contarVotosConStreams() {
        return votos.stream()
                    .collect(Collectors.groupingBy(Voto::getCandidato, Collectors.counting()));
    }
}
