package edu.curso.java.cuetas;

public abstract class CuentaBancaria {

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
	
	public abstract void extraer(Double monto);

	@Override
	public String toString() {
		return "CuentaBancaria [numeroDeCuenta=" + numeroDeCuenta + ", saldoActual=" + saldoActual + "]";
	}
	
}
