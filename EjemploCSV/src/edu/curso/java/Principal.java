
package edu.curso.java;

import java.text.*; //ESTE ES PARA SimpleFormat
import java.util.*; //ESTE ES PARA Date

public class Principal {

	public static void main(String[] args) {
		GestorDeCSV gestorDeCSV = new GestorDeCSV();
		//   C:/tmp/listado_de_productos.csv
		gestorDeCSV.leerCSV("/tmp/listado_de_productos.csv");
		
		
		ArrayList<Producto> productos = new ArrayList<Producto>();
		
		productos.add(new Producto("TV LCD 32", "Ejemplo de TV LCD de 32 pulgadas",280000.0, new Date(), 1));
		productos.add(new Producto("TV LCD 60", "Ejemplo de TV LCD de 60 pulgadas",380000.0, new Date(), 2));
		productos.add(new Producto("Heladera BGH", "Ejemplo de Heladera", 180000.0, new Date(), 3));
		
		gestorDeCSV.escribirCSV("/tmp/listado_de_productos_generado.csv", productos);
			
	}

}
