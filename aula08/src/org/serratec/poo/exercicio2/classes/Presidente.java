package org.serratec.poo.exercicio2.classes;

public record Presidente(
		String nome, 
		Pais pais, 
		int anoEleicao,
		EstadoCivil estadoCivil) {
}