package edu.ucj.programacion.pec1_Jesus_lacruz;

public class Profesor {
	  private String nombre;
	  private String apellidos;
	  private String dni;
	  private String asignatura;
	  
	//creo el constructor
	  public Profesor(String nombre, String apellidos, String dni, String asignatura) {
	    this.nombre = nombre;
	    this.apellidos = apellidos;
	    this.dni = dni;
	    this.asignatura = asignatura;
	  }
	  
	  // Getters y setters
	  public String getNombre() { 
		  return nombre; }
	  
	  public void setNombre(String nombre) { 
		  this.nombre = nombre; }
	  
	  public String getApellidos() { 
		  return apellidos; }
	  
	  public void setApellidos(String apellidos) { 
		  this.apellidos = apellidos; }
	  
	  public String getDni() { 
		  return dni; }
	  
	  public void setDni(String dni) {
		  this.dni = dni; }
	  
	  public String getAsignatura() {
		  return asignatura; }
	  
	  public void setAsignatura(String asignatura) {
		  this.asignatura = asignatura; }
	  
	  
	  
	  
	  
	}
