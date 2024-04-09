package org.serratec.poo.exercicio2.classes;

public class Atleta implements Olimpiadas {
	private String nome;
	private EstadoCivil estadoCivil;
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


	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	@Override
	public String toString() {
		return "Atleta " + nome + ", estadoCivil= " + estadoCivil.getSigla() + ", peso= " + peso + ", modalidade= " + modalidade
				+ ", pais= " + pais;
	}

	

}
