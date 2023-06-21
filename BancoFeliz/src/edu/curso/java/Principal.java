package edu.curso.java;

import edu.curso.java.cuetas.CajaDeAhorro;
import edu.curso.java.cuetas.CuentaBancaria;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CuentaBancaria cuentaBancaria1 = new CuentaBancaria();
		cuentaBancaria1.setNumeroDeCuenta(1234567L);
		cuentaBancaria1.setSaldoActual(50000.0);
		cuentaBancaria1.extraer(900000.0); //OJO!!!!!
		System.out.println(cuentaBancaria1);
		
		CajaDeAhorro cajaDeAhorro = new CajaDeAhorro();
		cajaDeAhorro.setNumeroDeCuenta(452332L);
		cajaDeAhorro.setSaldoActual(80000.0);
		cajaDeAhorro.extraer(3000.0);
		cajaDeAhorro.extraer(900000.0);
		System.out.println(cajaDeAhorro);

	}

}
