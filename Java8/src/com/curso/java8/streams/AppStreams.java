package com.curso.java8.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class AppStreams {
	
	List<String> lista = new ArrayList<>();
	{
		lista.add("C1");
		lista.add("A1");
		lista.add("B2");
		lista.add("D1");
	}
	
	public void filtrar() {
		lista.stream().filter(x -> x.startsWith("A")).forEach(System.out::println);
	}
	
	public void ordenar() {
		lista.stream().sorted().forEach(System.out::println);
	}
	
	public void transformar() {
		List<String> lowerList = lista.stream().map(String::toLowerCase).collect(Collectors.toList());
		lowerList.forEach(System.out::println);
	}
	
	public void limitar() {
		lista.stream().limit(2).forEach(System.out::println);
	}
	
	public void contar() {
		System.out.println(lista.stream().count());
	}
	
	public void mix() {
		lista.stream()
			.map(s -> s.toLowerCase())
			.filter(x -> x.contains("1"))
			.sorted()
			.limit(2)
			.forEach(System.out::println);
	}
	
	public void parallelStream() {
		lista.parallelStream()
			.map(s -> s.toLowerCase())
			.filter(x -> x.contains("1"))
			.sorted()
			.limit(2)
			.forEach(System.out::println);
	}
	
	public static void main(String[] args) {
		AppStreams appStreams = new AppStreams();
//		appStreams.filtrar();
//		appStreams.ordenar();
//		appStreams.transformar();
//		appStreams.limitar();
//		appStreams.contar();
//		appStreams.mix();
		appStreams.parallelStream();
	}

}
