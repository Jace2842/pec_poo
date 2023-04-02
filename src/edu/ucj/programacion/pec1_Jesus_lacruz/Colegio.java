package edu.ucj.programacion.pec1_Jesus_lacruz;

import java.util.Arrays;
import java.util.Scanner;

public class Colegio {
    private String nombre;
    private String direccion;
    private Aula[] aulas;

  //creo el constructor
    public Colegio(String nombre, String direccion, int numAulas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.aulas = new Aula[numAulas];
        crearAulas(numAulas);
    }

 // genero Getters y setters
    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public Aula[] getAulas() {
        return aulas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setAulas(Aula[] aulas) {
        this.aulas = aulas;
    }
 // creo un metodo
    public void crearAulas(int numAulas) {
        aulas = new Aula[numAulas];
        for (int i = 0; i < numAulas; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese el número de aula " + (i+1) + ": ");
            int numero = sc.nextInt();
            System.out.println("Ingrese la planta del aula " + (i+1) + ": ");
            int planta = sc.nextInt();
            String nombreProfesor = null;
            String apellidoProfesor = null;
            String dniProfesor = null;
            String asignaturaProfesor = null;
            Profesor profesor = new Profesor(nombreProfesor, apellidoProfesor, dniProfesor, asignaturaProfesor);
            aulas[i] = new Aula(numero, planta, profesor, 3);
        }
    }

 }