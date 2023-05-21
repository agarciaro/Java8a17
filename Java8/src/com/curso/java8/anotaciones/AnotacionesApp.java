package com.curso.java8.anotaciones;

import java.util.Arrays;

public class AnotacionesApp {
	@Lenguajes({
		@Lenguaje("Java"),
		@Lenguaje("C++")
	})
	public interface LenguajeProgramacionOO {
		
	}
	
	@Lenguajes({
		@Lenguaje("Scala"),
		@Lenguaje("Haskell")
	})
	public interface LenguajeProgramacionFn {
		
	}
	
	public static void main(String[] args) {
		Lenguaje[] lenguajes = LenguajeProgramacionOO.class.getAnnotationsByType(Lenguaje.class);
		System.out.println(String.format("Se tienen %s lenguajes de programación", lenguajes.length));
		
		Arrays.asList(lenguajes).forEach(l -> System.out.println(l.value()));
		Arrays.asList(lenguajes).stream().map(l -> l.value()).forEach(System.out::println);
 	}
}
