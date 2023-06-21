package edu.curso.java.cuetas;

public class CuentaBancaria {

	private Long numeroDeCuenta;
	private Double saldoActual;
	
	public Long getNumeroDeCuenta() {
		return numeroDeCuenta;
	}
	
	public void setNumeroDeCuenta(Long numeroDeCuenta) {
		this.numeroDeCuenta = numeroDeCuenta;
	}
	
	public Double getSaldoActual() {
		return saldoActual;
	}
	
	public void setSaldoActual(Double saldoActual) {
		this.saldoActual = saldoActual;
	}
	
	public void extraer(Double monto) {
		saldoActual = saldoActual - monto;
	}

	@Override
	public String toString() {
		return "CuentaBancaria [numeroDeCuenta=" + numeroDeCuenta + ", saldoActual=" + saldoActual + "]";
	}
	
}
