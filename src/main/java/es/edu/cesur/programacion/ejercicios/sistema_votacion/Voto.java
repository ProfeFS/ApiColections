package es.edu.cesur.programacion.ejercicios.sistema_votacion;

import java.util.Objects;

public class Voto {
    private String electorDocId;
    private String candidato;

    public Voto(String electorDocId, String candidato) {
        this.electorDocId = electorDocId;
        this.candidato = candidato;
    }

    public String getElectorDocId() {
        return electorDocId;
    }

    public String getCandidato() {
        return candidato;
    }

	@Override
	public int hashCode() {
		return Objects.hash(electorDocId.toLowerCase());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Voto other = (Voto) obj;
		return Objects.equals(electorDocId.toLowerCase(), other.electorDocId.toLowerCase());
	}
    
    
}
