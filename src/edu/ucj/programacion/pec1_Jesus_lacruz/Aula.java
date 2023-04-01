package edu.ucj.programacion.pec1_Jesus_lacruz;

public class Aula {
	
 private String numero;
 private int planta;
 private Profesor[] profesor;
 private Alumno[] asientos;
 
 public String getNumero() {
	return numero;
}

public void setNumero(String numero) {
	this.numero = numero;
}

public int getPlanta() {
	return planta;
}

public void setPlanta(int planta) {
	this.planta = planta;
}

public Aula (String numero, int planta) {
 this.numero =numero;
 this.planta =planta;
 profesor = new Profesor[0];
 asientos = new Alumno[2];
	 
}

}
