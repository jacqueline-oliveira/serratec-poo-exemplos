package org.serratec.poo.classes;

import java.time.LocalDate;

public class Aluno extends Pessoa {
	private String matricula;
	private String turma;

	public Aluno(String nome, String cpf, LocalDate dataNascimento, String matricula) {
		super(nome, cpf, dataNascimento);	
		this.matricula = matricula;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	public String getMatricula() {
		return matricula;
	}

	@Override
	public String toString() {
		return super.toString() + 
				String.format("Matrícula: %s\n", matricula);
	}
	
	
	
	

}
