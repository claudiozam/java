package edu.curso.java.cuetas;

import java.util.Objects;

public class CajaDeAhorro extends CuentaBancaria {

	
	@Override
	public String toString() {
		return "CajaDeAhorro [numeroDeCuenta=" + super.getNumeroDeCuenta() + ", saldoActual=" + super.getSaldoActual()  + "]";
	}

	@Override
	public void extraer(Double monto) {
		Double nuevoSaldo = super.getSaldoActual() - monto;
		if(nuevoSaldo >= 0) {
			super.setSaldoActual(nuevoSaldo);
		} else {
			System.out.println("No tenes tanta plata....");
		}
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(super.getNumeroDeCuenta());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CuentaBancaria other = (CuentaBancaria) obj;
		return Objects.equals(super.getNumeroDeCuenta(), other.getNumeroDeCuenta());
	}
	
}
