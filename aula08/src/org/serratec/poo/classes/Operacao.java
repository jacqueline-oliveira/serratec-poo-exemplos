package org.serratec.poo.classes;

public class Operacao implements Opcao {
	private String tipo;
	private double valorOperacao;
	private Livro livro;
	
		
	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public String getTipo() {
		return tipo;
	}

	public double getValorOperacao() {
		return valorOperacao;
	}

	@Override
	public void emprestar() {
		tipo = "Empréstimo";
		//Buscando a taxa da interface
		valorOperacao = livro.getValor() * Opcao.taxaEmprestimo / 100;
	    
		//Buscando a constante do livro
		//valorOperacao = livro.getValor() * livro.TAXA_EMPRESTIMO / 100;		
	}

	@Override
	public void vender() {
		tipo = "Venda";
		valorOperacao = livro.getValor();
		
	}

	@Override
	public String toString() {
		return "Operacao [tipo=" + tipo + ", valorOperacao=" + valorOperacao + ", livro=" + livro + "]";
	}
	
	

}
