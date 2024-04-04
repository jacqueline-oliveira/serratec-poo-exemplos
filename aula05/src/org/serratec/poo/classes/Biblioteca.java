package org.serratec.poo.classes;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Biblioteca {
	
	public static String formataData(LocalDate data) {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		return df.format(data);
	}
	
	public static int intervaloEmAnos(LocalDate primeiraData, LocalDate segundaData) {
		 Period periodo = Period.between(primeiraData, segundaData);
		 return periodo.getYears();
	}
}
