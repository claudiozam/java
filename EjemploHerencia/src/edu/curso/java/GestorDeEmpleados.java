package edu.curso.java;

public class GestorDeEmpleados {

	
	public Empleado crearNuevoEmpleado(String nomnbre, String apellido) {
		Empleado empleado = new Empleado();
		empleado.setNombre(nomnbre);
		empleado.setApellido(apellido);
		empleado.setSueldo(120000.0);
		return empleado;
	}
	
}
