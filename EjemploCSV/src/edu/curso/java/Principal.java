
package edu.curso.java;

import java.text.*; //ESTE ES PARA SimpleFormat
import java.util.*; //ESTE ES PARA Date

public class Principal {

	public static void main(String[] args) {
		GestorDeCSV gestorDeCSV = new GestorDeCSV();
		//   C:/tmp/listado_de_productos.csv
		gestorDeCSV.leerCSV("/tmp/listado_de_productos.csv");
		
	}

}
