package es.edu.cesur.programacion.ejercicios.sistema_votacion;
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
}
