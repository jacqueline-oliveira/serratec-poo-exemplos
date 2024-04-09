package org.serratec.poo.exercicio2.classes;

public class Pais {
	private String nome;

	public Pais(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return " " + nome;
	}
	
	

}
