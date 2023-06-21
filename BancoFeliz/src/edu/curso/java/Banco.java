package edu.curso.java;

import edu.curso.java.cuetas.CuentaBancaria;

public class Banco {

	/***
	 * Ejemplo de polimorfismo
	 * @param cuentaBancaria
	 * @param monto
	 */
	public void extraerDeCuentaBancaria(CuentaBancaria cuentaBancaria, Double monto) {
		Class tipoClase = cuentaBancaria.getClass();
		System.out.println("Tipo de clase: " + tipoClase.getName());
		cuentaBancaria.extraer(monto);
		System.out.println(cuentaBancaria);
	}
	
}
