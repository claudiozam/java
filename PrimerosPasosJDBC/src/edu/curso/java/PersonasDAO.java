package edu.curso.java;

import java.sql.*;
import java.util.ArrayList;

public class PersonasDAO {

	public void guardarPersona(Persona persona) {
		
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
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {}
			}
		}
	}
	
	public void actualizarPersona(Persona persona) {
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
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {}
			}
		}
	}
	
	public Persona buscarPersonaPorId(Long id) {
		Persona persona = null;
		Connection connection = null;
		DBUtils dbUtils = new DBUtils();
		try {
			connection = dbUtils.recuperarConnection();
			
			String sqlSelect = "SELECT id, nombre, apellido, edad  FROM  personas WHERE id = ?";
			PreparedStatement statementSelect = connection.prepareStatement(sqlSelect);
			statementSelect.setLong(1, persona.getId());
			ResultSet resultado = statementSelect.executeQuery();
			if(resultado.next() == true) {
				persona = new Persona();
				persona.setId(id);
				persona.setNombre(resultado.getString("nombre"));
				persona.setApellido(resultado.getString("apellido"));
				persona.setEdad(resultado.getInt("edad"));
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {}
			}
		}
		return persona;
	}
	
	public void borrarPersona(Long id) {
		
	}
	
	public ArrayList<Persona> recuperarPersonas() {
		return null;
	}
}
