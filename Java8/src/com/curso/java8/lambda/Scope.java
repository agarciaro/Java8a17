package com.curso.java8.lambda;

public class Scope {
	
	private static double staticAtributo;
	private double atributo;
	
	public double probarLocalVariable() {
		
//		double n3 = 3;
		final double n3 = 3;
		
//		Operacion operacion = new Operacion() {
//			
//			@Override
//			public double calcular(double n1, double n2) {
////				n3 += n1 + n2;
//				return n3 + n1 + n2;
//			}
//		};
		
		Operacion operacion = (double n1, double n2) -> {
//			n3 = 5;
			return n3 + n1 + n2;
		};
		
		return operacion.calcular(3, 2);
	}
	
	public double probarstaticAtributo() {
		Operacion operacion = (double n1, double n2) -> {
			staticAtributo = 5;
			atributo = staticAtributo;
			return staticAtributo + n1 + n2;
		};
		
		return operacion.calcular(3, 2);
	}
}
