package com.curso.java12a17;

public class InstaceOfApp {

	public static void main(String[] args) {
		
		Object object = 10;
		
		System.out.println("Clase:" + object.getClass().getName());
		
//		if(object instanceof Integer) {
//			Integer i = (Integer) object;
//			System.out.println(i);
//		}
		
		if(object instanceof Integer i) {
			System.out.println("Integer:" + i);
		}
//		
		if(object instanceof String s && s.length() <= 2) {
			System.out.println("String:" +s);
		}
		
//		switch (object) {
//		case String s -> "";
//		default->
//			throw new IllegalArgumentException("Unexpected value: " + object);
//		}
//		
	}

}
