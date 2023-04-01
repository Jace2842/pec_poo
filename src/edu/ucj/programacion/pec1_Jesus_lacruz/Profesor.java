package edu.ucj.programacion.pec1_Jesus_lacruz;

public class Profesor extends Persona { 
	
	private String asignatura;

	public Profesor(String nombre, String apellido, int dni, String asignatura) {
		super(nombre, apellido, dni);
		
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

}
