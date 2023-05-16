package com.curso.java8.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class Referencias {
	
	public static String referenciaMetodoStatic(String palabra) {
		System.out.println("En método estático");
		return palabra.toUpperCase();
	}
	
	
	public String operar(String a) {
//		Conversor conversor = (String p) -> Referencias.referenciaMetodoStatic(p);
		Conversor conversor = Referencias::referenciaMetodoStatic;
		return conversor.convertir(a);
	}
	
	public void ordenar() {
		String[] nombres = {"Aitor", "Pepe", "Juan", "Ana"};
//		Arrays.sort(nombres, new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//				return o1.compareToIgnoreCase(o2);
//			}
//		});
		
//		Arrays.sort(nombres, (String o1, String o2) -> o1.compareToIgnoreCase(o2));
		Arrays.sort(nombres, String::compareToIgnoreCase);
	}
	
	public static void main(String[] args) {
		Referencias ref = new Referencias();
		String resultado = ref.operar("hola");
		System.out.println(resultado);
		
		
	}
}
