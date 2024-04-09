package org.serratec.poo.exercicio2.classes;

public class Atleta implements Olimpiadas {
	private String nome;
	private double peso;
	private String modalidade;
	private Pais pais;
	
	public Atleta(String nome, String modalidade, Pais pais) {
		super();
		this.nome = nome;
		this.modalidade = modalidade;
		this.pais = pais;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getNome() {
		return nome;
	}

	public String getModalidade() {
		return modalidade;
	}

	public Pais getPais() {
		return pais;
	}

	@Override
	public String verificaSituacao() {
		boolean podeParticipar = false;
		
		if ((modalidade.equalsIgnoreCase("peso pesado")) && (peso >= 90)) {
			podeParticipar = true;
		} else if (modalidade.equalsIgnoreCase("peso médio") 
				&& (peso >= 60 && peso < 90)) {
			podeParticipar = true;
		}
		
		String texto = (podeParticipar) ? "participará" : "não participará";
	
	    return nome + " com modalidade " + modalidade + " com peso: " + peso 
	    		+ " Kg " + texto + " das Olimpíadas.";
	}

	@Override
	public String toString() {
		return "Atleta [nome=" + nome + ", peso=" + peso + ", modalidade=" + modalidade + ", pais=" + pais + "]";
	}

}
