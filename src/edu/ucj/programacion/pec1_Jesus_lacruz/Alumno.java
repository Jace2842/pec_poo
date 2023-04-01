package edu.ucj.programacion.pec1_Jesus_lacruz;

public class Alumno extends Persona{
	private String notaMedia;

	public Alumno(String nombre, String apellido, int dni, String notaMedia) {
		super(nombre, apellido, dni);
		this.notaMedia=notaMedia;
	}

	public String getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(String notaMedia) {
		this.notaMedia = notaMedia;
	}

}
