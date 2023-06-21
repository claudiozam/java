package edu.curso.java;

public class Persona {

	private String nombre;
	private String apellido;
	private Integer edad;

	
	/***
	 * Crea una persona sin nada
	 */
	public Persona() {
		System.out.println("Creando una persona sin nada");
		nombre = "Sin definir";
	}
	
	/***
	 * Crea una persona con nombre y apellido
	 * @param nombreInicial nombre de la persona
	 * @param apellidoInicil apellido de la person
	 */
	public Persona(String nombreInicial, String apellidoInicil) {
		System.out.println("Creando una persona con nombre y apellido");
		nombre = nombreInicial;
		apellido = apellidoInicil;
	}
	
	public Persona(String nombreInicial, String apellidoInicil, Integer edadInicial) {
		System.out.println("Creando una persona con todo....");
		nombre = nombreInicial;
		apellido = apellidoInicil;
		edad = edadInicial;
	}
	
	public void saludar() {
		System.out.println("Hola a todos soy una persona");
	}

	public void saludar(String textoInicial) {
		System.out.println("Hola " + textoInicial);
	}

	public void saludar(String textoInicial, Integer numero) {
		System.out.println("Hola " + textoInicial + numero);
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
	}
	
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
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	
}
