package edu.curso.java;

import java.util.Date;

public class Producto {

	private Integer id;
	private String nombre;
	private String descripcion;
	private Double precio;
	private Date fechaAlta;
	
	
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio + ", fechaAlta="
				+ fechaAlta + ", id=" + id + "]";
	}
	
	public Producto() {
		
	}
	
	public Producto(String nombre, String descripcion, Double precio, Date fechaAlta, Integer id) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.fechaAlta = fechaAlta;
		this.id = id;
	}


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Date getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	
}
