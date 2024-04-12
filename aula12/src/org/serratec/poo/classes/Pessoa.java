package org.serratec.poo.classes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pessoa implements Comparable<Pessoa> {
	private String nome;
	private LocalDate dataNascimento;
	private String cpf;
	
	public Pessoa(String nome, LocalDate dataNascimento, String cpf) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	@Override
	public String toString() {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		return "Nome: " + nome + ", Data de Nascimento: " + dataNascimento.format(df) +  ", cpf: " + cpf;
	}

	@Override
	public int compareTo(Pessoa outraPessoa) { 
		return this.getNome().compareTo(outraPessoa.getNome());
	}
	

}
