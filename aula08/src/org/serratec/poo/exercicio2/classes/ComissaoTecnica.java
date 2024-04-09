package org.serratec.poo.exercicio2.classes;

public class ComissaoTecnica implements Olimpiadas {
	private String nome;
	private String cargo;
	private Pais pais;
	private boolean emDiaComAsObrigacoesLegais;
	
	public ComissaoTecnica(String nome, String cargo, Pais pais) {
		super();
		this.nome = nome;
		this.cargo = cargo;
		this.pais = pais;
	}

	public boolean isEmDiaComAsObrigacoesLegais() {
		return emDiaComAsObrigacoesLegais;
	}

	public void setEmDiaComAsObrigacoesLegais(boolean emDiaComAsObrigacoesLegais) {
		this.emDiaComAsObrigacoesLegais = emDiaComAsObrigacoesLegais;
	}

	public String getNome() {
		return nome;
	}

	public String getCargo() {
		return cargo;
	}

	public Pais getPais() {
		return pais;
	}

	@Override
	public String toString() {
		return "ComissaoTecnica [nome=" + nome + ", cargo=" + cargo + ", pais=" + pais + ", emDiaComAsObrigacoesLegais="
				+ emDiaComAsObrigacoesLegais + "]";
	}

	@Override
	public String verificaSituacao() {
		String texto = (emDiaComAsObrigacoesLegais) ? " participará" : " não participará";
		
	    return nome + " cujo cargo é " + cargo + texto + " das Olimpíadas.";
	}
	
}
