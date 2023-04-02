package edu.ucj.programacion.pec1_Jesus_lacruz;

public class Alumno {
	  private String nombre;
	  private String apellidos;
	  private String dni;
	  private double notaMedia;
	  
	  //creo el constructor 
	  public Alumno(String nombre, String apellidos, String dni, double notaMedia) {
	    this.nombre = nombre;
	    this.apellidos = apellidos;
	    this.dni = dni;
	    this.notaMedia = notaMedia;
	  }
	  
	  // genero Getters y setters
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
	  
	  public double getNotaMedia() { 
		  return notaMedia; }
	 
	  public void setNotaMedia(double notaMedia) { 
		  this.notaMedia = notaMedia; }
	  
	  
	  
	  
	}