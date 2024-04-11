package es.edu.cesur.programacion.ejercicios.registro_eventos;

public class Evento {

	private Integer id;
	private String description;

	public Evento(Integer id, String description) {
		this.id = id;
		this.description = description;
	}
	
	public Integer getid() {
		return id;
	}
	
	public String getDescription() {
		return description;
	}

	
	
}
