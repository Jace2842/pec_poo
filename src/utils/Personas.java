package utils;

public class Personas {
	
	public class Persona {
		
		private String nombre ;
		 private String apellido ;
		 private String mail  ;
	    private String dni;
	   




			
	 public Persona (String nombre ,  String apellido, String dni,String email){
		
		this.nombre= nombre;
		this.apellido= apellido;
		this.mail = email;
		this.dni = dni;
	}
	 
	 public void mostrarDatos() {
			
		 
		    System.out.println(this.getNombre());	 
			System.out.println(this.getApellido());
			System.out.println(this.getEmail());
			System.out.println(this.getDni());
	 }


	public String getNombre() {
		
		return this.nombre;
		
		
		
		
	} 
	public void setNombre(String nombre) {
		
	this.nombre= nombre;	
		
		
		
	}

	public String getApellido() {
		
		return this.apellido;
		
	}
	public String getEmail() {
		return mail;
	}

	public void setEmail(String email) {
		this.mail = email;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	}

}
