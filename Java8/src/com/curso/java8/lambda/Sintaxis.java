package com.curso.java8.lambda;

public class Sintaxis {
	
	public double probarSintaxis( ) {
		Operacion operacion = (double x, double y) -> (x+y)/2;
//		Operacion operacion = (double x, double y) -> {
//			return (x+y)/2;
//		};
//		Operacion operacion = (double x, double y) -> {
//			System.out.println("En operación...");
//			return (x+y)/2;
//		};
		
//		Operacion operacion = () -> 2.5;
		
		return operacion.calcular(3, 4);
//		return operacion.calcular();
	}
	
}
