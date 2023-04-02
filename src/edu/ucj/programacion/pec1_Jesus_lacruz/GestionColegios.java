package edu.ucj.programacion.pec1_Jesus_lacruz;

import java.util.Scanner;

public class GestionColegios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el nombre del colegio: ");
        String nombreColegio = scanner.nextLine();

        System.out.println("Introduce la dirección del colegio: ");
        String direccionColegio = scanner.nextLine();

        System.out.println("Introduce el número de aulas del colegio: ");
        int numAulas = scanner.nextInt();

        System.out.println("Introduce el número de alumnos del colegio: ");
        int numAlumnos = scanner.nextInt();

        Colegio colegio = new Colegio(nombreColegio, direccionColegio, numAulas);
        Alumno[] alumnos = UtilsColegio.crearAlumnos(numAlumnos);
        Profesor[] profesores = UtilsColegio.crearProfesores(numAulas);
//llamo a los metodos y le paso los paranetros
        
        UtilsColegio.asignarProfesores(colegio, profesores);
        asignarAlumnos(alumnos, colegio);    
    }
        
            public static void asignarAlumnos(Alumno[] alumnos, Colegio colegio) {
                for (int i = 0; i < alumnos.length; i++) {
                    boolean asignado = false;

                    // Itero por cada aula
                    for (Aula aula : colegio.getAulas()) {
                        // Itero por cada asiento del aula
                        for (int j = 0; j < aula.getAsientos().length; j++) {
                            if (aula.getAsientos()[j] == null) {
                                // Asigno el alumno al primer asiento libre 
                                aula.getAsientos()[j] = alumnos[i];
                                System.out.println("El alumno " + alumnos[i].getNombre() + " con DNI " + alumnos[i].getDni() +
                                        " ha sido asignado al asiento " + (j + 1) + " del aula " + aula.getNumero());
                                asignado = true;
                                break;
                                 }
                                   } if (asignado) {break;}}

                                     if (!asignado) {
                                       System.out.println("No hay asientos disponibles para el alumno de nombre " + alumnos[i].getNombre() +
                                       " con DNI " + alumnos[i].getDni()+"por que el aula "+(colegio.getAulas().length+" y el asiento "+i+"estan ocupados"));
                    
 }}}}
