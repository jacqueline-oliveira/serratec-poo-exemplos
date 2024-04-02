package org.serratec.poo.classes;

public class Endereco {
	String logradouro;
	int numero;
	String bairro;
	String cep;
	
	public Endereco(String logradouro, int numero, String bairro, String cep) {
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cep = cep;
	}

	@Override
	public String toString() {
		return String.format("%s, %s - %s - %s", logradouro, numero, bairro, cep);
	}
}
