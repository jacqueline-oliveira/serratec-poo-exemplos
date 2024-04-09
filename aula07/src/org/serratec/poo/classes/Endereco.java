package org.serratec.poo.classes;

public class Endereco {
	private String rua;
	private String bairro;
	private String cep; 
	private Cidade cidade;
	
	public Endereco(String rua, String bairro, String cep, Cidade cidade) {
		this.rua = rua;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
	}

	public String getRua() {
		return rua;
	}

	public String getBairro() {
		return bairro;
	}

	public String getCep() {
		return cep;
	}

	public Cidade getCidade() {
		return cidade;
	}

	@Override
	public String toString() {
		return rua + " " + bairro + " cep " + cep + " cidade " + cidade + "]";
	}
}
