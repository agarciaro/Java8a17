package com.curso.java12a17;

import java.util.List;
import java.util.stream.Collectors;

public class StringApiApp {

	public static void main(String[] args) {
		var frase = "esto es una frase\n"
				+ "que me he inventado yo.\n"
				+ "Para el curso de Java...";
		
//		frase.indent(4);
		System.out.println(frase.indent(4));
		
		var stringTransformacion = "hola que tal estas";
								// Que Tal Estas...
		
//		var result = capitalCase(dropPrimeraPalabra(stringTransformacion)).concat("...");
		var result = stringTransformacion
				.transform(StringApiApp::dropPrimeraPalabra)
				.transform(StringApiApp::capitalCase)
				.concat("...");
		
		System.out.println(result);
		
	}
	
	private static String dropPrimeraPalabra(String frase) {
		return List.of(frase.split("\\W+"))
				.stream()
				.skip(1)
				.collect(Collectors.joining(" "));
	}
	
	private static String capitalCase(String frase) {
		return List.of(frase.split("\\W+"))
				.stream()
				.map(s -> s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase())
				.collect(Collectors.joining(" "));
	}
}
