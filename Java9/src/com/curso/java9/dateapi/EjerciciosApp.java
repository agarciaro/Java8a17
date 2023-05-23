package com.curso.java9.dateapi;

import java.time.LocalDate;
import java.time.Period;
import java.time.Year;

public class EjerciciosApp {

	public static void main(String[] args) {
		//Contar días desde hoy hasta el 2025-09-12
		diasHastaFecha();
		aniosBisiestos();
		

	}
	
	public static void diasHastaFecha() {
		LocalDate fechaFin = LocalDate.of(2025, 9, 12);
		LocalDate hoy = LocalDate.now();
		
		long numDias = hoy.datesUntil(fechaFin).count();
		
		System.out.println(numDias);
	}
	
	public static void aniosBisiestos( ) {
		LocalDate hoy = LocalDate.now();
		LocalDate milNovecientos = LocalDate.ofYearDay(1900, 1);
		
//		long bisiestosTotales = milNovecientos
//					.datesUntil(hoy, Period.ofYears(1))
//					.mapToInt(LocalDate::getYear)
//					.filter(Year::isLeap)
//					.count();
		
		long bisiestosTotales = milNovecientos
				.datesUntil(hoy, Period.ofYears(1))
				.filter((d -> {
					 return Year.isLeap(d.getYear());
				}))
				.count();
		
		System.out.println(bisiestosTotales);
	}

}
