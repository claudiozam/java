package edu.curso.java;

import java.util.*;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class GestorDeCSV {
	
	
	public void escribirCSV(String rutaDelArchivo, ArrayList<Producto> productos) throws ProductoException {
		
		File archivoCSV = new File(rutaDelArchivo);
		
		FileWriter fileWriter = null;
		
		try {
			fileWriter = new FileWriter(archivoCSV);

			fileWriter.write("ID;NOMBRE;DESCRIPCION;PRECIO;FECHAALTA\n");				

			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			
			for (Producto p : productos) {
				fileWriter.write(p.getId() + ";" 
						+ p.getNombre() + ";" 
						+ p.getDescripcion() + ";" 
						+ p.getPrecio() + ";"
						+ dateFormat.format(p.getFechaAlta()) + "\n");				
			}
			
			
			fileWriter.close(); //TODO: Poner en el finally
		} catch (Exception e) {
			throw new ProductoException("Hay un problema al generar el archivo csv: " + rutaDelArchivo, e);
		} finally {
			if(fileWriter != null) {
				try {
					fileWriter.close();
				} catch (IOException e) {}				
			}

		}
		
	}
	
	
	public ArrayList<Producto> leerCSV(String rutaDelArchivo) throws ProductoException {
		ArrayList<Producto> productos = new ArrayList<Producto>();
		FileReader fileReader = null;
		try {
			File archivoCSV = new File(rutaDelArchivo);
			fileReader = new FileReader(archivoCSV);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String linea = bufferedReader.readLine();
			Integer contadorDeLineas = 0;
			while(linea != null) {
				
				System.out.println("Linea actual: " + linea);
				if(contadorDeLineas >= 1 && linea.isBlank() == false) {
					String[] registros = linea.split(";"); 
					
					Integer id = Integer.parseInt(registros[0]);
					String nombre = registros[1];
					String descripcion = registros[2];
					Double precio = Double.parseDouble(registros[3]);
					
					SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
					
					Date fechaAlta = null;
					
					try {
						fechaAlta = dateFormat.parse(registros[4]);
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					productos.add(new Producto(nombre, descripcion, precio, fechaAlta, id));
					
				} else {
					System.out.println("ojo que en la primer linea tengo texto del nombre de las columnas");
				}

				linea = bufferedReader.readLine();
				contadorDeLineas = contadorDeLineas + 1;
			}		
		} catch (Exception e) {
			throw new ProductoException("Hay un problema al leer el archivo csv: " + rutaDelArchivo, e);
		} finally {
			if(fileReader != null) {
				try {
					fileReader.close();
				} catch (IOException e) { }				
			}

		}	
		
		return productos;
	}

}
