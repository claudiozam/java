package edu.curso.java;

public class Principal {

	public static void main(String[] args) {
		//NO PUEDO CREAR UNA PERSONA PORQUE ES ABSTRACT!!!!
		//Persona persona = new Persona(); 
		
		GestorDeEmpleados gestorDeEmpleados = new GestorDeEmpleados();
		Empleado empleado1 = gestorDeEmpleados.crearNuevoEmpleado("Juan", "Perez");
		
		System.out.println(empleado1.getNombre() + " " + empleado1.getSueldo());
		
		Integer numeroInteger = 1034;

		System.out.println(numeroInteger);
		System.out.println(numeroInteger.toString());

		System.out.println(empleado1);
		System.out.println(empleado1.toString());
		
		
	}

}
