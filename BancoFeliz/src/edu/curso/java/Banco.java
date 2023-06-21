package edu.curso.java;

import edu.curso.java.cuetas.CuentaBancaria;

public class Banco {

	/***
	 * Ejemplo de polimorfismo
	 * @param cuentaBancaria
	 * @param monto
	 */
	public void extraerDeCuentaBancaria(CuentaBancaria cuentaBancaria, Double monto) {
		System.out.println("Tipo de clase: " + cuentaBancaria.getClass().getName());
		cuentaBancaria.extraer(monto);
		System.out.println(cuentaBancaria);
	}
	
}
