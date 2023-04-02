package edu.ucj.programacion.pec1_Jesus_lacruz;

public class Aula {
    private int numero;
    private int planta;
    private Profesor profesor;
    private Alumno[] asientos;

  //creo el constructor
    public Aula(int numero, int planta, Profesor profesor,int numAsientos) {
        this.numero = numero;
        this.planta = planta;
        this.profesor = profesor;
        this.asientos = new Alumno[numAsientos];
    }
 // genero Getters y setters
    public int getNumero() {
        return numero;
    }

    public int getPlanta() {
        return planta;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public Alumno[] getAsientos() {
        return asientos;
    }


	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setPlanta(int planta) {
		this.planta = planta;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public void setAsientos(Alumno[] asientos) {
		this.asientos = asientos;
	}
 // creo un metodo
    public boolean asignarAlumno(Alumno alumno) {
        for (int i = 0; i < asientos.length; i++) {
            if (asientos[i] == null) {
                asientos[i] = alumno;
                return true;
            }
        }
        return false;
    }
    public boolean hayAsientoLibre() {
        for (int i = 0; i < asientos.length; i++) {
            if (asientos[i] == null) {
                return true;
            }
        }
        return false;
    }}