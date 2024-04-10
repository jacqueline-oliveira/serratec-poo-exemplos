package org.serratec.poo.exercicio2.classes;

public enum EstadoCivil {
	CASADO("C", "casado(a)",1),
	SOLTEIRO("SO", "solteiro(a)",2),
	DIVORCIADO("D", "divorciado(a)",3),
	VIUVO("V", "viúvo(a)",4),
	SEPARADO("SE", "separado(a)",5);
	
	private String descricaoTextual;
	private String sigla;
	private int enumerado;
	
	
	private EstadoCivil(String sigla, String descricaoTextual, int enumerado) {
		this.descricaoTextual = descricaoTextual;
		this.enumerado = enumerado;
		this.sigla = sigla;
	}

	public String getSigla() {
		return sigla;
	}

	public String getDescricaoTextual() {
		return descricaoTextual;
	}

	public int getEnumerado() {
		return enumerado;
	}

	
}
