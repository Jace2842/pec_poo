package utils;

import java.util.Scanner;

import utils.Personas.Persona;

public class Utilidades {

	private static String variable1;
	
	public class Menu {

		public void main(String[] args) {
			int opcion = 0;
			do {
				System.out.println("1. Validar email");
				System.out.println("2. Pintar Cuadrado");
				System.out.println("3. Mostrar datos");
				System.out.println("4. Salir");

				System.out.println("Selecciona una opcion");
				Scanner scan = new Scanner(System.in);
				opcion = scan.nextInt();

//				if (opcion==1) {
//					
//				}else if (opcion ==2) {
//					pintaCuadrado();
//				}

				switch (opcion) {
				case 1:
					validarEmail();
					break;
				case 2:
					pintaCuadrado();
					break;
				case 3:
					mostrarDatos();
					break;
				case 4:
					System.out.println("Adios");
					break;
				default:
					System.out.println("Opcion incorrecta");
					break;
				}

			} while (opcion != 4);

		}

		public void pintaCuadrado() {
			System.out.println("Pintando cuadrado");
			int numLados = 5;
			for (int i = 0; i < numLados; i++) {// Filas
				for (int j = 0; j < numLados; j++) {// Columnas
					if (i == 0 || i == numLados - 1) {// Primera y Ãºltima fila
						System.out.print("*\t");
					} else {
						if (j == 0 || j == numLados - 1) {
							System.out.print("*\t");
						} else {
							System.out.print("\t");
						}
					}
				}
				System.out.println();
			}
		}

		// mÃ©todo mostrarDatos()
		// Crear clase Persona (nombre, apellidos,
		// dni (no se modifica), email)
		// 3 objetos de tipo de Persona
		// Metemos los objetos en un array
		// Mostrar los nombres de todas las personas del array
		public void mostrarDatos() {
			// Defino objetos de tipo persona
			Persona persona1 = new Persona("Persona1", "Apellidos1", "1111A", "asdasd@asdas.es");
			Persona persona2 = new Persona("Persona2", "Apellidos2", "2222B", "asdasd@asdas.es");
			Persona persona3 = new Persona("Persona3", "Apellidos3", "3333C", "asdasd@asdas.es");

			// Array de personas
			Persona[] personas = { persona1, persona2, persona3 };

			// System.out.println(personas[0].getNombre());
			for (Persona persona : personas) {
				System.out.println(persona.getNombre());
			}
		}

		public void validarEmail() {
			Scanner scan = new Scanner(System.in);
			System.out.println("Escribe un email");
			String email = scan.nextLine();

			System.out.println();

			String mensajeError = "";

			// email=" bhshsg@xc.vxv.es "
			// Quito espacioes en blanco a izqda y dcha
			email = email.trim();

			// Controlamos el numero de @
			if (email.indexOf("@") == -1) {
				mensajeError += "El email debe tener una @. ";
			} else if (email.indexOf("@") != email.lastIndexOf("@")) {
				mensajeError += "Solo debe de haber una @. ";
			}

			// No puede tener espacios en blanco
			if (email.contains(" ")) {
				mensajeError += "No puede tener espacios en blanco. ";
			}

			// Despues de la @ tiene que haber al menos un punto
			// Primer forma
	/*		if (email.lastIndexOf(".") < email.lastIndexOf("@")) {
				mensajeError += "Despues de la @ tiene que haber un punto. ";
			}*/

			// Segunda forma
			int posicionArroba = email.indexOf("@");
			String dominio = email.substring(posicionArroba+1);
			if (email.contains("@") && !dominio.contains(".")) {
				mensajeError += "Despues de la @ tiene que haber un punto. ";
			} else {
				//Miramos la longitud desde el Ãºltimo punto
				int posicionUltimoPunto = dominio.lastIndexOf(".");
				String subdominio = dominio.substring(posicionUltimoPunto + 1);
				if (subdominio.length() < 2 || subdominio.length() > 6) {
					mensajeError += "Despues del Ãºltimo punto no puede "
							+ "haber menos de 2 ni mas de 6 caracteres. ";
				}
			}
			
			
			if (mensajeError.equals("")){
				System.out.println("El email "+email+ " es correcto");
			}else {
				System.out.println("El email "+email+ " no es correcto: "+mensajeError);
			}

		}
}}