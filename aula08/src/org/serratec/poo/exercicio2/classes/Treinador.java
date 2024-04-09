package org.serratec.poo.exercicio2.classes;

import java.time.LocalDate;

public class Treinador implements Olimpiadas {
	private String nome;
	private LocalDate dataVencimentoCREF;
	private Pais pais;
	
	public Treinador(String nome, LocalDate dataVencimentoCREF, Pais pais) {
		super();
		this.nome = nome;
		this.dataVencimentoCREF = dataVencimentoCREF;
		this.pais = pais;
	}

	public String getNome() {
		return nome;
	}

	public LocalDate getDataVencimentoCREF() {
		return dataVencimentoCREF;
	}

	public Pais getPais() {
		return pais;
	}

	@Override
	public String toString() {
		return "Treinador [nome=" + nome + ", dataVencimentoCREF=" + dataVencimentoCREF + ", pais=" + pais + "]";
	}

	@Override
	public String verificaSituacao() {
		LocalDate hoje = LocalDate.now();
		String texto = (dataVencimentoCREF.isAfter(hoje)) ? "participará" : "não participará";
		
	    return nome + " " + texto + " das Olimpíadas.";	
	}
	
	

}
