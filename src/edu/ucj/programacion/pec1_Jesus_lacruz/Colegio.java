package edu.ucj.programacion.pec1_Jesus_lacruz;

public class Colegio {

private String nombre ;
private String direccion;
private Aula[] Aulas;

public Colegio(String nombre,String direccion,int numAulas){
	this.nombre = nombre;
	this.direccion =direccion;
	Aulas = new Aula[numAulas];
	


}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getDireccion() {
	return direccion;
}

public void setDireccion(String direccion) {
	this.direccion = direccion;
}
private void asignarAsiento(Alumno[]Alumnos) 
 {
	
	 /*
		boolean hayPlazasLibres=false;
		
		for (int i = 0; i < plazasBicis.length; i++) {
			if (plazasBicis[i]==null) {
				plazasBicis[i]=bici;
				System.out.println("Aparcada la bici "+bici.getMarca() + 
						"con "+bici.getNumMarchas() + " marchas ");
				hayPlazasLibres=true;
			}
		}
		if(!hayPlazasLibres) {
			System.out.println("No hay plazas libres para la bici" +bici.getMarca() 
					 + "con "+bici.getNumMarchas() + " marchas ");*/
}	
	
	
	
	
} 

