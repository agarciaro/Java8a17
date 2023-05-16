package com.curso.java8.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaApp {

	public static void main(String[] args) {
		LambdaApp app = new LambdaApp();
//		app.ordenar();
//		app.calcular();
		
		Sintaxis sintaxis = new Sintaxis();
		double resultado = sintaxis.probarSintaxis();
		System.out.println(resultado);
	}
	
	public void ordenar() {
		List<String> lista = new ArrayList<>();
		lista.add("A");
		lista.add("C");
		lista.add("B");
		
//		Collections.sort(lista, new Comparator<String>() {
//			@Override
//			public int compare(String o1, String o2) {
//				return o1.compareTo(o2);
//			}
//		});
		
		Collections.sort(lista, (String a, String b) -> a.compareTo(b));
//		(String a, String b) -> o1.compareTo(o2);
		
		for (String elemento : lista) {
			System.out.println(elemento);
		}
		
	}
	
	public void calcular() {
//		Operacion operacion = new Operacion() {
//			
//			@Override
//			public double calcular(double n1, double n2) {
//				return (n1+n2)/2;
//			}
//		};
		
		Operacion operacion = (double x, double y) -> (x+y)/2;
		
		System.out.println(operacion.calcular(2, 3));
	}

}
