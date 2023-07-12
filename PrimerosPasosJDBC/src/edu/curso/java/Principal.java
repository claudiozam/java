package edu.curso.java;

import java.sql.*;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		PersonasDAO personasDAO = new PersonasDAO();
		Persona persona = new Persona(0L,"Juan", "Perez", 34);
		personasDAO.guardarPersona(persona);
		
		
		
		
		Connection connection = null;
		DBUtils dbUtils = new DBUtils();
		try {
			
			  connection = dbUtils.recuperarConnection();
			
			System.out.println("isClosed : " + connection.isClosed());
			
			//String sqlInsert = "INSERT INTO personas (nombre, apellido, edad) VALUES ('Maria', 'Lopez', 21)";
			//Statement statementInsert = connection.createStatement();
			//statementInsert.execute(sqlInsert);
			
			//String sqlDelete = "DELETE FROM personas WHERE id = 3";
			//Statement statementDelete = connection.createStatement();
			//statementDelete.execute(sqlDelete);
			
			String sqlUpdate = "UPDATE personas SET edad = 46 WHERE id = 1";
			Statement statement = connection.createStatement();
			int rowCount = statement.executeUpdate(sqlUpdate);
			System.out.println("rowCount: " + rowCount);
			
			String sqlSelect = "SELECT id, nombre, apellido, edad FROM personas";
			
			Statement statementSelect = connection.createStatement();
			
			ResultSet resultSet = statementSelect.executeQuery(sqlSelect);
			
			while (resultSet.next() == true) {
				System.out.println("***********************");
				System.out.println("Id: " + resultSet.getInt("id"));
				System.out.println("Nombre: " + resultSet.getString("nombre"));
				System.out.println("Apellido: " + resultSet.getString("apellido"));
				System.out.println("Edad: " + resultSet.getInt("Edad"));

			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if(connection != null) {
				try {
					System.out.println("Cerrando la connection....");
					connection.close();
				} catch (SQLException e) {}
			}
		}

	}

}
