package com.curso.java9.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import static java.util.Map.entry;

import java.util.ArrayList;

public class CollectionsApp {

	public static void main(String[] args) {
		List<String> lista = Arrays.asList("Persona1", "Persona2", "Persona3");
		List<String> listaUn = Collections.unmodifiableList(lista);
		
//		listaUn.add("Persona4");
//		lista.add("Persona4");
		
		lista.set(0, "Persona1X");
//		listaUn.set(0, "Persona1X");
		
		
		System.out.println(listaUn);
		
		System.out.println(lista.getClass());
		System.out.println(listaUn.getClass());
		
		List<String> listaInmutable = List.of("persona1", "persona2", "persona3");
		
		System.out.println(listaInmutable.getClass());
		
//		listaInmutable.set(0, "persona1X");
		
		System.out.println(listaInmutable);
		
		Set<String> set = new HashSet<>();
		set.add("p1");
		set.add("p2");
		set.add("p3");
		set.add("p1");
		
		System.out.println(set);
		
		Set<String> setInmutable = Set.of("p1", "p2", "p3");
//		Set<String> setInmutable = Set.of("p1", "p2", "p3", "p1");
		
		System.out.println(setInmutable);
		
		Map<String, Integer> ranking = 
				Map.ofEntries(
					entry("A", 1),
					entry("B", 2)
				);
		
		List<Person> personas = List.of(new Person("Pepe"), new Person("Juan"));
		
		personas.get(0).setNombre("Fran");
		
		System.out.println(personas);		
		
	}

}
