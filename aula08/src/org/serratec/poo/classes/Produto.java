package org.serratec.poo.classes;

public class Produto implements Opcao {
	private String nome;
	private double valor;
	private String status;
	
	
	public Produto(String nome, double valor) {
		super();
		this.nome = nome;
		this.valor = valor;
	}


	public String getNome() {
		return nome;
	}


	public double getValor() {
		return valor;
	}
	
	
	public String getStatus() {
		return status;
	}


	@Override
	public void emprestar() {
		status = "emprestado";	
	}


	@Override
	public void vender() {
		status = "vendido";
	}


	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", valor=" + valor + ", status=" + status + "]";
	}	
	

}
