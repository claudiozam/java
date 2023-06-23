package edu.curso.java;

public abstract class Persona {

	
	private String nombre;
	private String apellido;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void hablar() {
		System.out.println("Hola estoy saludando como persona...");
	}
	
	public abstract void saludar();
	
}
