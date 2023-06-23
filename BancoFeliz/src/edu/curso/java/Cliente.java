package edu.curso.java;

import java.util.ArrayList;

import edu.curso.java.cuetas.CuentaBancaria;

public class Cliente {

	private ArrayList<CuentaBancaria> cuentasBancarias = new ArrayList<CuentaBancaria>();
	private String nombre;
	private Long numeroDecliente;
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Long getNumeroDecliente() {
		return numeroDecliente;
	}


	public void setNumeroDecliente(Long numeroDecliente) {
		this.numeroDecliente = numeroDecliente;
	}


	public void agregarCuentaBancanria(CuentaBancaria cuentaBancaria) {
		cuentasBancarias.add(cuentaBancaria);
	}
	
	
	public void listarCuentas() {
		System.out.println("Cuentas de cliente " + numeroDecliente);
		for (CuentaBancaria cuentaBancaria : cuentasBancarias) {
			System.out.println(cuentaBancaria);
		}
	}
}
