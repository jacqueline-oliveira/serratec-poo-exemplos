package org.serratec.poo.classes;

public class Funcionario {
	private String nome;
	protected double salario;
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public double getSalario() {
		return salario;
	}
	
	public void reajustaSalario(double percentual) {
		this.salario += salario * percentual / 100;
	}
	
	public void reajustaSalario() {
		this.salario += 200;
	}
	

	@Override
	public String toString() {
		return "Funcionario " + nome + ", salario=" + salario ;
	}
	
}
