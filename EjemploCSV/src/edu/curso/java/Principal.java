
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

		
		try {
			ArrayList<Producto> productos = gestorDeProductoJDBC.recuperarProductosDeLaaBaseDeDatos();

			gestorDeCSV.escribirCSV("/tmp/listado_de_productos_generado_19_07_2023.csv", productos);
		} catch (ProductoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
		
		
	}

}
