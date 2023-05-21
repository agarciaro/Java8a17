package com.curso.java9.modules.restaurante;

import com.curso.java9.modules.descuento.Descuento;
import com.curso.java9.modules.producto.Producto;

public class RestauranteApp {

	public static void main(String[] args) {
		RestauranteApp app = new RestauranteApp();
		Producto p = new Producto();
		
		Descuento d = new Descuento();
		
		System.out.println(p.getImporteConDescuento());

	}

}
