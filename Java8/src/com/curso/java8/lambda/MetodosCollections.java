package com.curso.java8.lambda;

import java.util.ArrayList;
import java.util.List;

public class MetodosCollections {
	
	List<String> lista = new ArrayList<>();
	{
		lista.add("A");
		lista.add("C");
		lista.add("B");
	}
	
	public void usarForEach() {
//		for (String elemento : lista) {
//			System.out.println(elemento);
//		}
//		lista.forEach(x -> System.out.println(x));
		lista.forEach(System.out::println);
	}
	
	public void usarRemoveIf() {
//		for (String elemento : lista) {
//			if(elemento.equalsIgnoreCase("C")) {
//				lista.remove(elemento);
//			}
//		}
		lista.removeIf(x -> x.equalsIgnoreCase("C"));
	}
	
	public void usarSort() {
		lista.sort((x, y) -> x.compareTo(y));
	}
	
	public static void main(String[] args) {
		MetodosCollections collections = new MetodosCollections();
		

	}

}
