package com.curso.java10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsCopyOfApp {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		lista.add("1");
		lista.add("2");
		
		//Utilizando una UnmodifiableView
		List<String> listaUn = Collections.unmodifiableList(lista);
//		listaUn.add("3");
		
		
		//Utilizando copyOf
		List<String> listaCopy = List.copyOf(lista);
//		listaCopy.add("3");
		
		
		lista.add("3");
		
		System.out.println(lista);
		System.out.println(listaUn);
		System.out.println(listaCopy);

	}

}
