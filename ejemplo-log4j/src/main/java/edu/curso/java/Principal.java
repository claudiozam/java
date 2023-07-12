package edu.curso.java;

import java.sql.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.ArrayList;

public class Principal {

	private static final Logger logger = LogManager.getLogger(Principal.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		logger.info("Iniciando mi programa de ejemplo de personas.....");
		
		PersonasDAO personasDAO = new PersonasDAO();

		try {
			ArrayList<Persona> personas = personasDAO.recuperarPersonas();
			
			for (Persona persona : personas) {
				System.out.println(persona);
			}
			
			
			//Persona persona = new Persona(0L,"Juan", "Perez", 34);
			//personasDAO.guardarPersona(persona);
			
			
			//Persona persona = new Persona(6L,"xxxxx", "yyyyyy", 34);
			//personasDAO.actualizarPersona(persona);

			Persona personaRecuperada = personasDAO.buscarPersonaPorId(6L);
			System.out.println(personaRecuperada);
			
			//personasDAO.borrarPersona(6l);
			
			
		} catch (PersonaException e) {
			logger.error("Hay un error general al trabajar con las personas", e);
		}

		
	
	}

}
