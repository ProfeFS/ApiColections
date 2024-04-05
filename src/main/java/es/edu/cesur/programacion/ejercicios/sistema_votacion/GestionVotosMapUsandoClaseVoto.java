package es.edu.cesur.programacion.ejercicios.sistema_votacion;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class GestionVotosMapUsandoClaseVoto {
	private Map<String, Voto> votos = new HashMap<>();

	public boolean registrarVoto(String electorDocId, String candidato) {
		if (!votos.containsKey(electorDocId)) {
			votos.put(electorDocId, new Voto(electorDocId, candidato));
			return true;
		} else {
			System.out.println("El elector con documento " + electorDocId + " ya ha votado.");
			return false;
		}
	}

	public void anularVoto(String electorDocId) {
		if (votos.remove(electorDocId) != null) {
			System.out.println("Voto anulado para el elector con documento " + electorDocId);
		} else {
			System.out.println("No se encontró voto para anular del elector con documento " + electorDocId);
		}
	}

	public Map<String, Long> contarVotosStreams() {
		return votos.values().stream().collect(Collectors.groupingBy(Voto::getCandidato, Collectors.counting()));
	}

	public Map<String, Integer> contarVotos() {
		Map<String, Integer> conteoVotosPorCandidato = new HashMap<>();

		for (Voto voto : votos.values()) {
			String candidato = voto.getCandidato();
			// Si el candidato ya existe en el mapa, incrementa su conteo.
			// Si no, inicia su conteo en 1.
			int cantVotos = conteoVotosPorCandidato.getOrDefault(candidato, 0) + 1;
			conteoVotosPorCandidato.put(candidato, cantVotos);

		}

		return conteoVotosPorCandidato;
	}

}
