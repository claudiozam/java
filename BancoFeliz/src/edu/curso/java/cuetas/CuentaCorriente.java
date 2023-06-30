package edu.curso.java.cuetas;

import java.util.Objects;

public class CuentaCorriente extends CuentaBancaria {

	private Double limiteExtra = 1000.0;
	
	@Override
	public void extraer(Double monto) {
		Double nuevoSaldo = super.getSaldoActual() - monto;
		if(nuevoSaldo + limiteExtra >= 0) {
			super.setSaldoActual(nuevoSaldo);
		} else {
			System.out.println("No tenes tanta plata....");
		}
	}
	
	public Double getLimiteExtra() {
		return limiteExtra;
	}
	
	public void setLimiteExtra(Double limiteExtra) {
		this.limiteExtra = limiteExtra;
	}
	
	@Override
	public String toString() {
		return "CuentaCorriente [numeroDeCuenta=" + super.getNumeroDeCuenta() + ", saldoActual=" + super.getSaldoActual()  + ", limiteExtra=" + limiteExtra + "]";
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
