package edu.curso.java;

import edu.curso.java.cuetas.CajaDeAhorro;
import edu.curso.java.cuetas.CuentaBancaria;
import edu.curso.java.cuetas.CuentaCorriente;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Banco banco = new Banco();
		
		
		CajaDeAhorro cajaDeAhorro = new CajaDeAhorro();
		cajaDeAhorro.setNumeroDeCuenta(452332L);
		cajaDeAhorro.setSaldoActual(80000.0);
		//banco.extraerDeCuentaBancaria(cajaDeAhorro, 3000.0);
		//banco.extraerDeCuentaBancaria(cajaDeAhorro, 900000.0);
		
		
		CuentaCorriente cuentaCorriente = new CuentaCorriente();
		cuentaCorriente.setNumeroDeCuenta(5363423L);
		cuentaCorriente.setSaldoActual(60000.0);
		cuentaCorriente.setLimiteExtra(90000.0);
		//banco.extraerDeCuentaBancaria(cuentaCorriente, 110000.0);

		Cliente cliente1 = new Cliente();
		cliente1.agregarCuentaBancanria(cuentaCorriente);
		cliente1.agregarCuentaBancanria(cajaDeAhorro);
		cliente1.setNumeroDecliente(423423423L);
		cliente1.listarCuentas();

		
		System.out.println("************************************");
		//cliente1.quitarCuentaBancanria(cajaDeAhorro);
		//cliente1.quitarCuentaBancanria(5363423L);
		
		cliente1.listarCuentas();

		
	}

}
