package com.curso.java8.lambda;

@FunctionalInterface
public interface Operacion {
	double calcular(double n1, double n2);
	default double calcular() {
		return 2.5;
	}
}
