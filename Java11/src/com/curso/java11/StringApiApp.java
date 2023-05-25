package com.curso.java11;

public class StringApiApp {

	public static void main(String[] args) {
		var hash = "#";
		System.out.println("Hash: " + hash.repeat(5));
		
		var text = "   ";
		System.out.println(text.isEmpty());
		
//		System.out.println("".isEmpty());
//		
		System.out.println("".equals(text.trim()));
		
		System.out.println(text.isBlank());
		
		var text2 = "   hello   \u2001";
		
		System.out.println(Character.isWhitespace('\u2001'));
		
		System.out.println(text2.trim().length());
		
		System.out.println(text2.strip().length());
		
		var multiplesLineas = "\nHola" 
						+ "\nque  \ntal";
		
//		multiplesLineas.split(null)
//		multiplesLineas.split("\\R");
		
		multiplesLineas.lines().forEach(System.out::println);
		
		
		
	}

}
