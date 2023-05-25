package com.curso.java12a17;

public class RecordsApp {
	
	record Datos(String s, int i) {
		
		public Datos(String a) {
			this(a, 0);
		}
		
		public String upper() {
			return s.toUpperCase();
		}
	}
	
	public static void main(String[] args) {
		String a = "hola";
		int n = 2;
		
		var data = new Datos(a, n);

	}

}
