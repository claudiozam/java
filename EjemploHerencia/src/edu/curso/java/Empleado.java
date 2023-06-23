package edu.curso.java;

public class Empleado extends Persona {

	private Double sueldo;
	
	@Override
	public void saludar() {
		System.out.println("Hola soy empleado y estoy saludando");
	}
	
	public void trabajar() {
		System.out.println("Soy emepleado y estoy trabajando......");
	}

	public Double getSueldo() {
		return sueldo;
	}

	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}
	
	
	public void hacerAlgo(String texto, Integer numero) {
		System.out.println("hola!!!!");
	}
	
	public Double recuperarSueldoConDescuentos() {
		if(sueldo > 300000.0) {
			return sueldo - 450000;
		}
		return sueldo;
	}

}
