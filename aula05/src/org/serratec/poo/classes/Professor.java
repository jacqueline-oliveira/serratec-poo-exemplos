package org.serratec.poo.classes;

import java.time.LocalDate;

public class Professor extends Pessoa {
	private String contrato;
	private String disciplina;

	public Professor(String nome, String cpf, LocalDate dataNascimento, String contrato) {
		super(nome, cpf, dataNascimento);
		this.contrato = contrato;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public String getContrato() {
		return contrato;
	}
	
	@Override
	public String toString() {
		return super.toString() +
				String.format("Contrato: %s \nDisciplina: %s", 
						contrato, disciplina);
	}
	
	

}
