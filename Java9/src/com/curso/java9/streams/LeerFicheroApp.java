package com.curso.java9.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LeerFicheroApp {

	public static void main(String[] args) throws IOException {
		
		Predicate<String> noContieneHash = l -> !l.contains("#"); 
		
		List<String> resultado;
		try(Stream<String> lineas = Files.lines(Paths.get("src/com/curso/java9/data.txt"))) {
			resultado = lineas
						.dropWhile(noContieneHash)
						.skip(1)
						.takeWhile(noContieneHash)
						.collect(Collectors.toList());
		}
		
		System.out.println(resultado);

	}

}
