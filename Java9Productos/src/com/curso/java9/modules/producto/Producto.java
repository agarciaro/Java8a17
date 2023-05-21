package com.curso.java9.modules.producto;

import com.curso.java9.modules.descuento.Descuento;

public class Producto {
	private String nombre = "Producto";
	private double importe = 50;
	
	public double getImporteConDescuento() {
		return Descuento.cincuentaPorCiento(importe);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	
	
	
}
