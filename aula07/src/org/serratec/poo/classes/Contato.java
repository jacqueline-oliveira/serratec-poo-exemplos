package org.serratec.poo.classes;

import java.util.ArrayList;
import java.util.List;

public class Contato {
	private String nome;
	private Endereco endereco;
	private List<Telefone> telefones = new ArrayList<>();
	
	public Contato(String nome, Endereco endereco) {
		super();
		this.nome = nome;
		this.endereco = endereco;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

	public String getNome() {
		return nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	@Override
	public String toString() {
		return "Contato " + nome + ", Endereço: " + endereco + ", Telefones: " + telefones ;
	}
	
	public void mostrarTelefones() {
		for (Telefone t : telefones) {
			System.out.println(t);
		}
	}
	
	public void adicionaTelefone(Telefone telefone) {
		this.telefones.add(telefone);
	}	
}
