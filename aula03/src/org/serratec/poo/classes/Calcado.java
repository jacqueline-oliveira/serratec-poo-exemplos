package org.serratec.poo.classes;

public class Calcado {
	public String tipo;
	public String modelo;
	public String cor;
	public int tamanho;
	public String estilo;
	public double valor;
	
	public Calcado(String tipo, int tamanho, double valor) {
		this.tipo = tipo;
		this.tamanho = tamanho;
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Calcado [tipo=" + tipo + ", modelo=" + modelo + ", cor=" + cor + ", tamanho=" + tamanho + ", estilo="
				+ estilo + ", valor=" + valor + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}
