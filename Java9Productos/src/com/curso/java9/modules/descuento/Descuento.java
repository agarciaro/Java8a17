package com.curso.java9.modules.descuento;

public class Descuento {
	
	@Deprecated(forRemoval = true)
	public static double cincuentaPorCiento(double importe) {
		return importe / 2;
	}
}
