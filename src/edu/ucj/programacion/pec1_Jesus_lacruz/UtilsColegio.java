package edu.ucj.programacion.pec1_Jesus_lacruz;

import java.util.Scanner;

public class UtilsColegio {
	//creo un metodo estatico
    public static Alumno[] crearAlumnos(int numAlumnos) {
        Scanner scanner = new Scanner(System.in);
        Alumno[] alumnos = new Alumno[numAlumnos];

        for (int i = 0; i < numAlumnos; i++) {
            System.out.println("Ingrese los datos del alumno " + (i + 1) + ":");
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Apellidos: ");
            String apellidos = scanner.nextLine();

            System.out.print("DNI: ");
            String dni = scanner.nextLine();

            System.out.print("Nota media: ");
            double notaMedia = scanner.nextDouble();
            scanner.nextLine();

            alumnos[i] = new Alumno(nombre, apellidos, dni, notaMedia);
        }

        return alumnos;
    }

    public static Profesor[] crearProfesores(int numAulas) {
        Scanner scanner2 = new Scanner(System.in);
        Profesor[] profesores = new Profesor[numAulas];

        for (int i = 0; i < numAulas; i++) {
            System.out.println("Ingrese los datos del profesor del aula " + (i + 1) + ":");
            System.out.println("Nombre: ");
            String nombre = scanner2.nextLine();

            System.out.println("Apellidos: ");
            String apellidos = scanner2.nextLine();

            System.out.println("DNI: ");
            String dni = scanner2.nextLine();

            System.out.println("Asignatura: ");
            String asignatura = scanner2.nextLine();

            profesores[i] = new Profesor(nombre, apellidos, dni, asignatura);
        }

        return profesores;
    }
    public static void asignarProfesores(Colegio colegio, Profesor[] profesores) {
        Aula[] aulas = colegio.getAulas();

        for (int i = 0; i < aulas.length; i++) {
            aulas[i].setProfesor(profesores[i]);
            System.out.println("El profesor " + profesores[i].getNombre()+" se asigno al aula "+aulas[i].getNumero());
        }
    }
}



