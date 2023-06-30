package edu.curso.java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

import edu.curso.java.cuetas.CuentaBancaria;

public class Cliente {

	private ArrayList<CuentaBancaria> cuentasBancarias = new ArrayList<CuentaBancaria>();
	private HashMap<Long, CuentaBancaria> cuentasBancariasPorNumeroDecuenta = new HashMap<Long, CuentaBancaria>();
	
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

	
	public void agregarCuentaBancariaPorNumeroDeCuenta(CuentaBancaria cuentaBancaria) {
		if(cuentasBancariasPorNumeroDecuenta.containsKey(cuentaBancaria.getNumeroDeCuenta()) == false) {
			cuentasBancariasPorNumeroDecuenta.put(cuentaBancaria.getNumeroDeCuenta(), cuentaBancaria);			
		}
	}
	
	public void quitarCuentaBancariaPorNumeroDeCuenta(Long numeroDecuenta) {
		cuentasBancariasPorNumeroDecuenta.remove(numeroDecuenta);
	}

	public void agregarCuentaBancanria(CuentaBancaria cuentaBancaria) {
		if(cuentasBancarias.contains(cuentaBancaria) ==  false) {
			cuentasBancarias.add(cuentaBancaria);			
		}
	}
	
	public void quitarCuentaBancanria(CuentaBancaria cuentaBancaria) {
		if(cuentasBancarias.contains(cuentaBancaria) ==  true) {
			cuentasBancarias.remove(cuentaBancaria);			
		}
	}
	
	public void quitarCuentaBancanria(Long numeroDeCuenta) {
		CuentaBancaria cuentaBancariaEncontrada = null;
		for (CuentaBancaria cuentaBancaria : cuentasBancarias) {
			if(cuentaBancaria.getNumeroDeCuenta().equals(numeroDeCuenta)) {
				cuentaBancariaEncontrada = cuentaBancaria;
				break;
			}
		}
		
		if(cuentaBancariaEncontrada != null) {
			cuentasBancarias.remove(cuentaBancariaEncontrada);
		}
		
		
	}
	
	
	
	
	public void listarCuentas() {
		System.out.println("Cuentas de cliente " + numeroDecliente);
		cuentasBancarias.sort(new Comparator<CuentaBancaria>() {

			@Override
			public int compare(CuentaBancaria o1, CuentaBancaria o2) {
				return o1.getNumeroDeCuenta().compareTo(o2.getNumeroDeCuenta());
			}
			
		});
		
		for (CuentaBancaria cuentaBancaria : cuentasBancarias) {
			System.out.println(cuentaBancaria);
		}
	}
}
