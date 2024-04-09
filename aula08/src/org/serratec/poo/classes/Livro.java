package org.serratec.poo.classes;

public class Livro {
	private String autor;
	private String titulo;
	private double valor;
	
	public static final double TAXA_EMPRESTIMO = 2.5;
	
	public Livro(String autor, String titulo, double valor) {
		super();
		this.autor = autor;
		this.titulo = titulo;
		this.valor = valor;
	}

	public String getAutor() {
		return autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public double getValor() {
		return valor;
	}

	@Override
	public String toString() {
		return "Livro [autor=" + autor + ", titulo=" + titulo + ", valor=" + valor + "]";
	}
	
	public void reajuste(double valor) {
		this.valor += valor;
	}

}
