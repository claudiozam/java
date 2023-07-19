
package edu.curso.java;

import java.text.*; //ESTE ES PARA SimpleFormat
import java.util.*; //ESTE ES PARA Date

public class Principal {

	public static void main(String[] args) {
		GestorDeCSV gestorDeCSV = new GestorDeCSV();
		GestorDeProductoJDBC gestorDeProductoJDBC = new GestorDeProductoJDBC();
		
		System.out.println("Recuperando productos del CSV");
		//   C:/tmp/listado_de_productos.csv
		ArrayList<Producto> productosRecuperados;
		try {
			productosRecuperados = gestorDeCSV.leerCSV("/tmp/listado_de_productos.csv");
			
			for (Producto p : productosRecuperados) {
				System.out.println(p);
			}

			gestorDeProductoJDBC.guardarProductosEnLaBaseDeDatos(productosRecuperados);
			
		} catch (ProductoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	
		System.out.println("Generando productos en el CSV");


		//ArrayList<Producto> productos = new ArrayList<Producto>();
		
		//productos.add(new Producto("TV LCD 32", "Ejemplo de TV LCD de 32 pulgadas",280000.0, new Date(), 1));
		//productos.add(new Producto("TV LCD 60", "Ejemplo de TV LCD de 60 pulgadas",380000.0, new Date(), 2));
		//productos.add(new Producto("Heladera BGH", "Ejemplo de Heladera", 180000.0, new Date(), 3));
		
		try {
			ArrayList<Producto> productos = gestorDeProductoJDBC.recuperarProductosDeLaaBaseDeDatos();

			gestorDeCSV.escribirCSV("/tmp/listado_de_productos_generado.csv", productos);
		} catch (ProductoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
		
		
	}

}
