package org.serratec.poo.classes;

import java.time.LocalDate;
import java.time.Period;


public abstract class Pessoa {
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
	
	public int getIdade() {
		LocalDate dataAtual = LocalDate.now();
		Period periodo = Period.between(dataNascimento, dataAtual);
		return periodo.getYears();
	}

	@Override
	public String toString() {
		return String.format("""
				Nome: %s
				CPF: %s
				D.Nasc: %s
				Idade: %s
				""", nome, cpf, Biblioteca.formataData(dataNascimento), 
				getIdade());
	}
	
}
