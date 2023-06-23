package edu.curso.java;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Persona persona1 = new Persona("Juan", "Perez", 34);
		System.out.println(persona1);


		Persona persona2 = new Persona("Maria", "Lopez", 12);
		System.out.println(persona2);

		Persona persona3 = new Persona("Claudio", "Lopez");
		System.out.println(persona3);

		Persona persona4 = new Persona();
		System.out.println(persona4);

		
		persona1.saludar();
		persona1.saludar("Ejemplo");
		persona1.saludar("Otro ejemplo", 10);
		
		
	}

}
