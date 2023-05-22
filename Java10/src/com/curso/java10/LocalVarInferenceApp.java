package com.curso.java10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class LocalVarInferenceApp {

	public static void main(String[] args) throws IOException {
//		Predicate<String> nombre = (String s) -> s.length() < 10;
//		Predicate<String> nombre = s -> s.length() < 10;
		
		//-----------En literales
//		boolean esRojo = true;
		var esRojo = true;
		
//		long sum = 10L;
		var sum = 10L;
		sum += 2L;
		
//		byte signal = 0; //byte
		var signal = 0; //int
		
		//-----------En loops
		int[] numeros = {1,2,3,4,5,6};
		
//		for (int i : numeros) {
//			System.out.println(i);
//		}
		
		for (var i : numeros) {
			System.out.println(i);
		}
		
		Map<String, List<String>> pelisPorGenero = new HashMap<>();
		pelisPorGenero.put("COMEDIA", List.of("comedia1", "comedia2"));
		pelisPorGenero.put("ACCION", List.of("accion1", "accion2"));
		
		for (var entry : pelisPorGenero.entrySet()) {
			String genero = entry.getKey();
			List<String> pelis = entry.getValue();
			
		}
		
		for (var i = 0; i < numeros.length; i++) {
			
		}
		
		var misPelis = new HashSet<String>();
		misPelis.add("peli1");
		misPelis.add("peli2");
//		misPelis.add(56.8);
		
		System.out.println(misPelis);
		
		//---------En try with resources
		try(var lineas = Files.lines(Paths.get("RUTA"))) {
			System.out.println(lineas.count());
		}
		
	}
	
//	var pruebaVar(var n) {
//		
//	}

}
