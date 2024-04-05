package es.edu.cesur.programacion.ejercicios.sistema_votacion;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GestionVotosMap {
	private Map<String, String> votos; // Mapa de electorDocId a candidato

	public GestionVotosMap() {
		this.votos = new HashMap<>();
	}

	public boolean registrarVoto(String electorDocId, String candidato) {
		if (votos.containsKey(electorDocId)) {
			System.out.println("El elector ya ha votado.");
			return false;
		} else {
			votos.put(electorDocId, candidato);
			return true;
		}
	}

	public void anularVoto(String electorDocId) {
		if (votos.remove(electorDocId) == null) {
			System.out.println("El elector especificado no ha votado.");
		}
	}

	public Map<String, Long> contarVotosFuncional() {
		Map<String, Long> conteoVotos = new HashMap<>();
		for (String candidato : votos.values()) {
			conteoVotos.merge(candidato, 1L, Long::sum);
		}
		return conteoVotos;
	}

	public Map<String, Integer> contarVotosVerificacionManual() {
		Map<String, Integer> conteoVotosPorCandidato = new HashMap<>();
		int cantVotos = 1;

		for (String candidato : votos.values()) {
			if (conteoVotosPorCandidato.containsKey(candidato)) {
				cantVotos = conteoVotosPorCandidato.get(candidato) + 1;
				conteoVotosPorCandidato.put(candidato, cantVotos);
			} else {
				conteoVotosPorCandidato.put(candidato, 1);
			}

		}
		return conteoVotosPorCandidato;
	}

	public Map<String, Integer> contarVotos() {
		Map<String, Integer> conteoVotosPorCandidato = new HashMap<>();

		for (String candidato : votos.values()) {
			// Restablece cantVotos a 1 si el candidato no está en el mapa,
			// o incrementa el conteo existente en 1 si ya está.
			int cantVotos = conteoVotosPorCandidato.getOrDefault(candidato, 0) + 1;
			conteoVotosPorCandidato.put(candidato, cantVotos);
		}
		return conteoVotosPorCandidato;
	}

	// Método para contar votos usando streams
	public Map<String, Long> contarVotosConStreams() {
		return votos.values().stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	}
}
