package com.curso.java8.optional;

import java.util.Optional;

public class OptionalApp {

	public static void main(String[] args) {
		Optional<String> stringOptional = Optional.of("hola");
		Optional<String> stringNull = Optional.ofNullable(null);
		
		if(stringNull.isPresent()) {
			System.out.println(stringNull.get());
		} else {
			System.out.println("Optional vacío");
		}
		
//		String valor = stringOptional.orElse("Valor por defecto");
		String valor = stringNull.orElse("Valor por defecto");
		
		System.out.println("Valor:" + valor);
		
		stringNull.orElseThrow(() -> new IllegalArgumentException("El valor no es correcto"));

	}

}
