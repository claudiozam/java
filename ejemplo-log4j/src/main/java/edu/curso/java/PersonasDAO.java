package edu.curso.java;

import java.sql.*;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import jdk.internal.org.jline.utils.Log;

public class PersonasDAO {

	private static final Logger logger = LogManager.getLogger(PersonasDAO.class);

	
	public void guardarPersona(Persona persona) throws PersonaException {
		
		Connection connection = null;
		DBUtils dbUtils = new DBUtils();
		try {
			connection = dbUtils.recuperarConnection();
			
			String sqlInsert = "INSERT INTO personas (nombre, apellido, edad) VALUES (?, ?, ?)";
			PreparedStatement statementInsert = connection.prepareStatement(sqlInsert);
			statementInsert.setString(1, persona.getNombre());
			statementInsert.setString(2, persona.getApellido());
			statementInsert.setInt(3, persona.getEdad());
			statementInsert.execute();

		} catch (ClassNotFoundException e) {
			logger.error(e);
			throw new PersonaException("Hay un problema al guardar la persona", e);
		} catch (SQLException e) {
			logger.error(e);
			throw new PersonaException("Hay un problema al guardar la persona", e);
		} finally {  
			if(connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {}
			}
		}
	}
	
	public void actualizarPersona(Persona persona) throws PersonaException  {
		Connection connection = null;
		DBUtils dbUtils = new DBUtils();
		try {
			connection = dbUtils.recuperarConnection();
			
			String sqlUpdate = "UPDATE personas SET nombre = ?, apellido = ?, edad = ? WHERE id = ?";
			PreparedStatement statementUpdate = connection.prepareStatement(sqlUpdate);
			statementUpdate.setString(1, persona.getNombre());
			statementUpdate.setString(2, persona.getApellido());
			statementUpdate.setInt(3, persona.getEdad());
			statementUpdate.setLong(4, persona.getId());
			statementUpdate.execute();

		} catch (ClassNotFoundException e) {
			logger.error(e);
			throw new PersonaException("Hay un problema al actualizar la persona", e);
		} catch (SQLException e) {
			logger.error(e);
			throw new PersonaException("Hay un problema al actualizar la persona", e);
		} finally {
			if(connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {}
			}
		}
	}
	
	public Persona buscarPersonaPorId(Long id) throws PersonaException  {
		logger.debug("Bucando la persona con el id: " + id);
		Persona persona = null;
		Connection connection = null;
		DBUtils dbUtils = new DBUtils();
		try {
			connection = dbUtils.recuperarConnection();
			
			String sqlSelect = "SELECT id, nombre, apellido, edad  FROM  personas WHERE id = ?";
			PreparedStatement statementSelect = connection.prepareStatement(sqlSelect);
			statementSelect.setLong(1, id);
			ResultSet resultado = statementSelect.executeQuery();
			if(resultado.next() == true) {
				persona = new Persona();
				persona.setId(id);
				persona.setNombre(resultado.getString("nombre"));
				persona.setApellido(resultado.getString("apellido"));
				persona.setEdad(resultado.getInt("edad"));
			} else {
				throw new PersonaException("No se encontro la persona con el id: " + id);
			}
		} catch (ClassNotFoundException e) {
			logger.error(e);
			throw new PersonaException("Hay un problema al buscar la persona", e);
		} catch (SQLException e) {
			logger.error(e);
			throw new PersonaException("Hay un problema al buscar la persona", e);
		} finally {
			if(connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {}
			}
		}
		return persona;
	}
	
	public void borrarPersona(Long id) throws PersonaException  {
		Connection connection = null;
		DBUtils dbUtils = new DBUtils();
		try {
			connection = dbUtils.recuperarConnection();
			
			String sqlDelete = "DELETE from personas WHERE id = ?";
			PreparedStatement statementDelete = connection.prepareStatement(sqlDelete);
			statementDelete.setLong(1, id);
			statementDelete.execute();

		} catch (ClassNotFoundException e) {
			logger.error(e);
			throw new PersonaException("Hay un problema al borrar la persona", e);
		} catch (SQLException e) {
			logger.error(e);
			throw new PersonaException("Hay un problema al borrar la persona", e);
		} finally {
			if(connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {}
			}
		}
	}
	
	public ArrayList<Persona> recuperarPersonas() throws PersonaException  {
		ArrayList<Persona> personas = new ArrayList<Persona>();
		Persona persona = null;
		Connection connection = null;
		DBUtils dbUtils = new DBUtils();
		try {
			String sqlSelect = "SELECT id, nombre, apellido, edad  FROM personas";
			logger.debug("Ejecutando el recuperar personas: " + sqlSelect);

			connection = dbUtils.recuperarConnection();
			
			PreparedStatement statementSelect = connection.prepareStatement(sqlSelect);
			ResultSet resultado = statementSelect.executeQuery();
			while(resultado.next() == true) {
				persona = new Persona();
				persona.setId(resultado.getLong("id"));
				persona.setNombre(resultado.getString("nombre"));
				persona.setApellido(resultado.getString("apellido"));
				persona.setEdad(resultado.getInt("edad"));
				personas.add(persona);
			}

		} catch (ClassNotFoundException e) {
			logger.error(e);
			throw new PersonaException("Hay un problema al buscar a las persona", e);
		} catch (SQLException e) {
			logger.error(e);
			throw new PersonaException("Hay un problema al buscar a las persona", e);
		} finally {
			if(connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {}
			}
		}
		return personas;
	}
}
