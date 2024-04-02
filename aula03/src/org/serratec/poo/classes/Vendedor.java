package org.serratec.poo.classes;

public class Vendedor {
	String nome;
	String cpf;
	Endereco endereco;
	
	public Vendedor(String nome, String cpf, Endereco endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Vendedor [nome=" + nome + ", cpf=" + cpf + ", endereco=" + endereco + "]";
	}	
}
