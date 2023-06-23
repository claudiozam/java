package edu.curso.java;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String unNombre = "Juan";
		

		ArrayList<Persona> personasDinamicas = new ArrayList<Persona>();
		
		Persona persona1 = new Persona("Juan", "Perez", "423423423");
		
		personasDinamicas.add(persona1);
		personasDinamicas.add(new Persona("Maria", "Lopez", "23566534"));
		personasDinamicas.add(new Persona("Lucas", "Orlando", "7644355"));
		
		for (Persona persona : personasDinamicas) {
			System.out.println(persona);
		}
		
		System.out.println("*******************");

		
		ArrayList<String> nombresDinamicos = new ArrayList<String>();
		
		nombresDinamicos.add("Juan"); //0
		nombresDinamicos.add("Pedro"); //1
		nombresDinamicos.add("Maria"); //2
		
		nombresDinamicos.add(1, "Nuevo nombre");
		
		for (String nombre : nombresDinamicos) {
			System.out.println(nombre);
		}
		
		System.out.println("*******************");
		
		System.out.println(nombresDinamicos.size());
		
		nombresDinamicos.remove(0);

		System.out.println(nombresDinamicos.size());
		
		System.out.println(nombresDinamicos.contains("Pedro"));
		
		nombresDinamicos.set(0, "Claudio");
		
		for (String nombre : nombresDinamicos) {
			System.out.println(nombre);
		}
		
	}

}
