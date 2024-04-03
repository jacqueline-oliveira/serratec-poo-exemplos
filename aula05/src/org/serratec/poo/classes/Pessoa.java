package org.serratec.poo.classes;

import java.time.LocalDate;

public class Pessoa {
	private String nome;
	private String cpf;
	private LocalDate dataNascimento;
	
	
	public Pessoa(String nome, String cpf, LocalDate dataNascimento) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	@Override
	public String toString() {
		//return "Nome: " + nome + ", cpf " + cpf + ", dataNascimento " + dataNascimento;
		return String.format("""
				Nome: %s
				CPF: %s
				D.Nasc: %s
				""", nome, cpf, dataNascimento);
	}
	
	
	
	

}
