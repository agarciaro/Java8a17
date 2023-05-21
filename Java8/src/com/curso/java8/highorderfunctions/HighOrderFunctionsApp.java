package com.curso.java8.highorderfunctions;

import java.util.function.Function;

public class HighOrderFunctionsApp {
	
	private Function<String, String> convertirMayusculas = x -> x.toUpperCase();
	private Function<String, String> convertirMinusculas = x -> x.toLowerCase();
	
	private void imprimir(String mensaje, Function<String, String> conversor) {
		System.out.println(conversor.apply(mensaje));
	}
	
	public static void main(String[] args) {
		HighOrderFunctionsApp app = new HighOrderFunctionsApp();
		
		app.imprimir("HoLa", app.convertirMayusculas);
		app.imprimir("HoLa", app.convertirMinusculas);
		
		app.imprimir("HoLa", x -> x + " adiós");
	}

}
